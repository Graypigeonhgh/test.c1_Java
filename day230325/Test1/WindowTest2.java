package day230325.Test1;

/**
 * @description:        创建三个窗口卖票，总票数为100张（仍存在线程安全问题待解决）
 *                     方法二：实现Runnable接口（不需要静态化属性）
 *                     原理：3个不同对象都是通过同一个对象w调用同一个类中的run()
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-25-14:14
 **/

class Window1 implements Runnable{

    private int ticket=100;    //不需要声明静态属性

    @Override
    public void run(){
        while(true){
            if(ticket>0){
                System.out.println(Thread.currentThread().getName()+":卖票，票号为："+ticket);
                ticket--;
            }else{
                break;
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window1 w=new Window1();

        Thread t1=new Thread(w);
        Thread t2=new Thread(w);
        Thread t3=new Thread(w);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
