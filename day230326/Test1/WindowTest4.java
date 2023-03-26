package day230326.Test1;

/**
 * @description:    同步代码块的使用：同步代码块处理继承Thread类的方式的线程安全问题
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-13:41
 **/
class Window extends Thread{
    private static int ticket=100;  //静态属性，三个对象同时调用该属性

    private static Object obj=new Object();//必须声明为静态的对象，使三个线程共用同一把锁

    @Override
    public void run(){
        while(true){
            //错误的方式：synchronized(this){     this指window的对象，有三个，不唯一，并没有共用一把锁
            //正确的方式一：synchronized(obj){
            synchronized(Window.class){     //类也是对象。Class c=Window.class,Window.class只会加载一次，相当于共享同一把锁
                if(ticket>0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(getName()+":卖票，票号为："+ticket);
                    ticket--;
                }else{
                    break;
                }

            }

        }
    }
}

public class WindowTest4 {
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