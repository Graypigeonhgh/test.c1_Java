package day230321.Test1;

/**
 * @description:
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-21-19:39
 **/

class HelloThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2==0) {

                try {   //让当前线程“睡眠”指定的milltime毫秒，在指定的毫秒时间内，当前线程处于阻塞状态
                    sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

//            if(i%20==0) {
//                //释放当前CPU的执行权
//                yield();
//            }

        }
    }

    //给线程一命名方式二：提供构造器
    public HelloThread(String name){
        super(name);
    }
}

public class ThreadMethodTest {
    public static void main(String[] args) {

        HelloThread h1=new HelloThread("Thread.1--");

        //给线程一命名：
       // h1.setName("线程一");
        h1.start();

        //给主线程命名
        Thread.currentThread().setName("主线程");

        for(int i=0;i<100;i++){
            if(i%2!=0) {
                System.out.println(Thread.currentThread().getName() + ":" + i);
            }

            if(i==20){
                try {
                    h1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }

        //判断当前线程是否存活
        System.out.println(h1.isAlive());

    }


}
