package day230325.Test1;

/**
 * @description:    线程优先级设置
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-25-12:59
 **/

//修改前：默认优先级：MORM_PRIORITY:5
        //MAX_PRIORITY:10
        //MIN-PRIORITY:1
class HelloThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
        }
    }
}


public class ThreadMethodTest2 {
    public static void main(String[] args) {
        HelloThread h1=new HelloThread();

        //给线程1命名
        h1.setName("Thread1--");

        //设置分线程的优先级
        h1.setPriority(Thread.MAX_PRIORITY);//10
//        h1.setPriority(8);//8

        h1.start();

        //给主线程命名
        Thread.currentThread().setName("mianThread--");
        //设置主线程的优先级
        Thread.currentThread().setPriority(Thread.MIN_PRIORITY);//2

        for(int i=0;i<100;i++){
            if(i%2!=0){
                System.out.println(Thread.currentThread().getName()+":"+Thread.currentThread().getPriority()+":"+i);
            }
        }

        //判断线程是否存活
        System.out.println(h1.isAlive());
    }

}
