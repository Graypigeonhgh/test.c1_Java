package day230325.Test2;

/**
 * @description:        同步代码块的使用：同步代码块处理实现Runnable接口方式的线程安全问题
 * 问题：卖票出现重票，错票-->出现了线程的安全问题
 * 原因：当某个线程操作车票的过程中，尚未操作完成时，其他线程参与进来，也操作车票的过程
 * 解决：当一个线程a开始操作ticket。直到线程a操作完成好，线程b才能开始操作ticket。这种情况即使线程a出现了阻塞，也不能被改变
 * 方法一：同步方法块synchronized（同步监视器）{需要被同步的代码}
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-25-14:14
 **/


class Window2 implements Runnable{

    private int ticket=100;    //不需要声明静态属性

    //Object obj=new Object();    //对象无要求，只要是共用同一个对象
    Dog dog=new Dog();

    @Override
    public void run(){
        while(true){
            synchronized(this){    //此时的this：唯一的window2的对象w1  //方式二synchronized(dog){
                if(ticket>0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":卖票，票号为："+ticket);
                    ticket--;
                }else{
                    break;
                }
            }

        }
    }
}

public class WindowTest3{
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