package day230317.Test1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//异常处理方式一：try-catch-finally结构
public class ExceptionTest {

    @Test
    public void test1(){

        String str="123";
        str="bds";
        int num=0;  //可以在方法外调用num；
        try{
            num=Integer.parseInt(str);
            System.out.println("hello----1");
        }catch (NullPointerException e){        //异常范围从小到大向下排列
            System.out.println("出现空指针异常");
        } catch (NumberFormatException e){
            System.out.println("出现数值转换异常");
            //常用的异常对象处理方式
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch(Exception e){
            System.out.println("出现异常了");
        }
        System.out.println(num);
        System.out.println("hello----2");
    }

    @Test
    public void test2(){
        try{        //使用try-catch-finally 处理编译时异常，使得程序在编译时不报错，但在运行时报错
            File file=new File("hellp.txt");
            FileInputStream fis=new FileInputStream(file);

            int date=fis.read();
            while (date != -1){
                System.out.println((char)date);
                date=fis.read();
            }
            fis.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
    }

    //标准写法
    @Test
    public void test3(){
        FileInputStream fis=null;   //使fis可在try结构外调用
        try{
            File file=new File("hellp.txt");
            fis=new FileInputStream(file);

            int date=fis.read();
            while (date != -1){
                System.out.println((char)date);
                date=fis.read();
            }

        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fis!=null)   //避免空指针异常
                    fis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
