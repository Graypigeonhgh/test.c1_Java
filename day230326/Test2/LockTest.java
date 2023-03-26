package day230326.Test2;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:    解决线程安全的方式三：Lock锁 ----JDK5.0新增
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-16:12
 **/

class Window implements Runnable{
    private int ticket=100;
    //1.实例化ReentrantLock
    private ReentrantLock lock=new ReentrantLock();

    @Override
    public void run(){
        while(true){
            try{

                //2.调用锁定方法Lock（）
                lock.lock();    //保证以下执行为单线程，与同步代码块类似

                if(ticket>0){

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":售票，票号为："+ticket);
                    ticket--;
                }else{
                    break;
                }
            }finally{   //无异常，不需要使用catch
                //3.调用解锁方法：unlock()
                lock.unlock();
            }

        }
    }
}


public class LockTest {
    public static void main(String[] args) {
        Window w=new Window();

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
