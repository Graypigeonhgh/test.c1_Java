package day230316.Test2;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;
import java.util.Scanner;

/**
 * @description:    面试题：常见异常有哪些？
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:  
 * @time:    2023/3/16 21:31
 */

public class ExceptionTest {
    //************* 以下是运行时异常 *************

    //1.ArrayIndexOutOfBoundsException
    @Test
    public void test1(){
//        int[] arr=new int[3];
//        System.out.println(arr[3]);

        //1.1 StringIndexOutOfBoundsException
        String str="abc";
        System.out.println(str.charAt(3));
    }

    //2.NullPointerException
    @Test
    public void test2(){
//      int[] arr=null;
//      System.out.println(arr[3]);

        String str="abc";
        str=null;
        System.out.println(str.charAt(0));
    }

    //3.ClassCastException（类型转换异常）
    @Test
    public void test3(){
        Object obj=new Date();
        String str=(String)obj;
    }

    //4.NumberFormatException（数值转换异常）
    @Test
    public void test4(){
        String str="123";
        str="abc";
        int num=Integer.parseInt(str);
    }

    //5.InputMismatchException （输入不匹配）
    @Test
    public void test5(){
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();    //输入abc
        System.out.println(score);
    }

    //6.ArithmeticException（算术异常）
    @Test
    public void test6(){
        int a=10;
        int b=0;
        System.out.println(a/b);
    }

    //************* 以下是编译时异常 *************
    @Test
    public void test7(){
//        File file=new File("hellp.txt");
//        FileInputStream fis=new FileInputStream(file);
//
//        int date=fis.read();
//        while (data != -1){
//            System.out.println((char)date);
//            data=fis.read();
//        }
//
//        fis.close();
    }
}
