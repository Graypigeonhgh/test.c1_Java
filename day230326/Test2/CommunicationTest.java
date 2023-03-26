package day230326.Test2;

/**
 * @description:    线程通信的例子：使用两个线程打印1-100，线程一，线程二交替打印
 * 涉及到的方法：wait(),notify(),notifyAll();
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-17:50
 **/

class Number implements Runnable{
    private int number=1;

    @Override
    public void run(){

        while(true){
            synchronized(this){

                notify();   //notifyAll()-->唤醒线程，跳出wait的阻塞状态 省略了this,方法由同步监视器调用

                if(number<=100){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName()+":"+number);
                    number++;

                    try {
                        wait(); //使得如下wait()方法的线程进入阻塞状态,省略了this.
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else{
                    break;
                }
            }

        }
    }
}

public class CommunicationTest {
    public static void main(String[] args) {
        Number num=new Number();

        Thread t1=new Thread(num);
        Thread t2=new Thread(num);

        t1.setName("线程一");
        t2.setName("线程二");

        t1.start();
        t2.start();
    }
}
