package day230326.Test1;

/**
 * @description:    同步方法处理继承Thread类的线程安全问题
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-14:25
 **/
class Window6 extends Thread{
    private static int ticket=100;  //静态属性，三个对象同时调用该属性

    private static Object obj=new Object();//必须声明为静态的对象，使三个线程共用同一把锁

    @Override
    public void run(){
        while(true){


        }
    }

    public static synchronized void show(){     //默认同步监视器：Window6.class，类本身
        //synchronized(Window.class){     //类也是对象。Class c=Window.class,Window.class只会加载一次，也就是共享同一把锁
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

public class WindowTest6 {
    public static void main(String[] args) {
        Window w1=new Window();
        Window w2=new Window();
        Window w3=new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
