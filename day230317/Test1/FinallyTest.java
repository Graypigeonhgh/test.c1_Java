package day230317.Test1;

import org.junit.Test;

public class FinallyTest {

    @Test
    public void test1(){
        try{
            int a=20;
            int b=0;
            System.out.println(a/b);

        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            System.out.println("我好帅啊哈哈");
        }
    }

    @Test
    public void testNethod(){
        int num=method();
        System.out.println(num);
    }

    public int method(){
        try{
            int[] arr=new int[0];
            System.out.println(arr[10]);
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally{
            System.out.println("我一定会被执行");
            return 3;
        }
    }
}
