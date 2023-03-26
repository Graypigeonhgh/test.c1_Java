package day230325.Test1;

/**
 * @description:   实现Runnable接口（不需要静态化属性）
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-25-13:47
 **/

//创建实现了Runnable接口的类
class MYThread implements Runnable{

    //2.实现类去实现Runnable中的抽象方法：run()
    @Override
    public void run(){
        for(int i=0;i<100;i++){
            if(i%2==0){
                System.out.println(Thread.currentThread().getName()+":"+i);
            }
        }
    }

}
public class ThreadTest {
    public static void main(String[] args) {
        //3.创建实现类的对象
        MYThread myThread=new MYThread();
        //4.将此对象作为参数传递到Thread类的构造器中，创建Thread类的对象
        Thread t1=new Thread(myThread); //myThread赋值给run（）中的target
        //5.通过Thread类的对象调用start（）；1.启动线程 2.调用当前线程的run（）-->调用Runnable类型的target
        t1.setName("线程1：");
        t1.start();

        //再启动一个线程，遍历100以内的偶数
        Thread t2=new Thread(myThread);
        t2.setName("线程2：");
        t2.start();
    }
}
