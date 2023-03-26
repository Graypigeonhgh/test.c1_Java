package day230326.Test1;

/**
 * @description:    同步方法处理实现Runnable的线程安全问题
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-14:14
 **/

class Window2 implements Runnable{

    private int ticket=100;    //不需要声明静态属性

    //Object obj=new Object();    //对象无要求，只要是共用同一个对象
    Dog dog=new Dog();

    @Override
    public void run(){
        while(true){

            show();
        }
    }

    private synchronized void show(){   //同步方法的使用-->默认同步监视器为 this
        //synchronized(this){    //此时的this：唯一的window2的对象w1  //方式二synchronized(dog){
            if(ticket>0){

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+":卖票，票号为："+ticket);
                ticket--;
            }

    }
}

public class WindowTest5{
    public static void main(String[] args) {
        Window2 w1=new Window2();

        Thread t1=new Thread(w1);
        Thread t2=new Thread(w1);
        Thread t3=new Thread(w1);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Dog{

}