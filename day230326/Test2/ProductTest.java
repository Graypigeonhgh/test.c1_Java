package day230326.Test2;

import java.util.function.Consumer;

/**
 * @description:        消费者/生产者问题
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-21:12
 **/

class Clerk{
    private int productCount=0;

    //生产产品
    public synchronized void produceProduct() {
        if(productCount<20){
            productCount++;
            System.out.println(Thread.currentThread().getName()+":开始生产第"+productCount+"个产品");

            notify();

        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    //消费产品
    public synchronized void consumeProduct() {
        if(productCount>0) {
            System.out.println(Thread.currentThread().getName() + ":开始消费第" + productCount + "个产品");
            productCount--;

            notify();

        }else{
            //等待
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Producer extends Thread{     //生产者
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run(){
        System.out.println(getName()+":开始生产产品。。。");
        while(true){

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.produceProduct();
        }
    }

}

class Consumer1 extends Thread{      //消费者
    private Clerk clerk;

    public Consumer1(Clerk clerk){
        this.clerk=clerk;
    }

    @Override
    public void run(){
        System.out.println(getName()+":开始消费产品。。。");
        while(true){

            try {
                Thread.sleep(11);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk=new Clerk();

        Producer producer=new Producer(clerk);
        producer.setName("生产者1：");
        Consumer1 consumer1=new Consumer1(clerk);
        consumer1.setName("消费者2：");

        producer.start();
        consumer1.start();
    }
}
