package day230327.Test1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:    创建线程的方式三：实现Callable接口--->JDK5.0新增
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-27-8:10
 **/

//1.创建一个实现Callable的实现类
class NumThread implements Callable {
    //2.实现call方法，将此线程需要执行的操作声明在call方法中
    @Override
    public Object call() throws Exception{
        int sum=0;
        for(int i=0;i<=100;i++){
            if(i%2==0){
                System.out.println(i);
                sum+=i;
            }
        }
        return sum;
    }

}

public class ThreadNew {
    public static void main(String[] args) {
        //3.创建Callable接口实现类的对象
        NumThread numThread=new NumThread();
        //4.将此Callable接口实现类的对象作为参数传递到FutureTask构造器中，创建FutureTask的对象
        FutureTask futureTask=new FutureTask(numThread);
        //5.将FutureTask的对象作为参数传递到Threa类的构造器中，创建Thread类的对象，并调用start()
        new Thread(futureTask).start();

        try {
            //获取Callable中call（）的返回值
            //get（）返回值即为FutureTask构造器参数Callable实现类重写的call()返回值
            Object sum=futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
