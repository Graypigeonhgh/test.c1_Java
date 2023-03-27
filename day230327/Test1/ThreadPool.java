package day230327.Test1;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;


/**
 * @description:    创建线程的方式三:线程池
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-27-18:59
 **/

//Executor:工具类，线程池的工厂类，用于创建并返回不同类型的线程池
//ExecutorService:真正的线程池接口。常见子类：ThreadPoolExecutor
//Executors.newFixedThreadPool(n):创建一个只有一个线程的线程池

class NumberThread implements Runnable{

    @Override
    public void run(){
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }
}

public class ThreadPool {
    public static void main(String[] args) {

        //1.提供指定线程数量的线程池
        ExecutorService service= Executors.newFixedThreadPool(10);
        //强制类型转换
        ThreadPoolExecutor service1=(ThreadPoolExecutor)service;

        //设置线程池的属性
        System.out.println(service.getClass());
        service1.setCorePoolSize(15);
        //service1.setKeepAliveTime();

        //2.执行指定的线程的操作。需要提供实现Runnable接口实现类的对象
        service.execute(new NumberThread());    //适用于Runnable
        service.execute(new NumberThread());    //适用于Runnable
        //service.submit();//适用于Callable

        //3.关闭连接池
        service.shutdown();
    }
}
