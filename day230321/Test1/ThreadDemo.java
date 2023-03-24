package day230321.Test1;

/**                 方法一：
 * @description:    创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-21-11:57
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        MyThread1 m1=new MyThread1();
        MyThread2 m2=new MyThread2();

        m1.start();
        m2.start();

    }

}

class MyThread1 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

class MyThread2 extends Thread{

    @Override
    public void run() {
        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}
