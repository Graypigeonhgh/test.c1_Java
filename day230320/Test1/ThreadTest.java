package day230320.Test1;

/**
 * @description:    多线程的创建
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-20-21:56
 **/

//1.创建一个继承于Thread类的子类
class MyThread extends Thread{
    //2.重写Thread类中的run() -->将此线程执行的操作声明在run()中
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + ":"+i);
            }
        }
    }
}


public class ThreadTest {
    public static void main(String[] args) {
        //3.创建Thread的子类的对象
        MyThread t1=new MyThread();

        //4.通过此对象调用start()：启动当前线程：调用当前线程的run()
        t1.start();
        //问题1.我们不能通过直接调用run()的方式启动线程
//        t1.run();

        //问题2.再启动一个线程，遍历100以内的偶数，不可以还让已经start()的线程去执行。会报IllegalThreadStateException
        //t1.start();
        //我们需要重新创建一个线程 的对象

        MyThread t2=new MyThread();
        t2.start();

        //如下操作仍然在main线程中执行
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName() + ":"+i+"**********main线程**********");//两条线程的交互性
            }
        }
    }
}