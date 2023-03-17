package day230317.Test1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//异常处理方式二：throws + 异常类型
public class ExceptionTest2 {
    public static void main(String[] args) {
        try{
            method2();
        }catch(IOException e){
            e.printStackTrace();
        }
        //method3();
    }

//    public static void method3(){
//        try{
//            method2();
//        }catch(IOException e){
//            e.printStackTrace();
//        }
//    }

    public static void method2() throws IOException {
        method1();
    }

    public static void method1() throws FileNotFoundException,IOException{
        File file=new File("hellp.txt");
        FileInputStream fis=new FileInputStream(file);

        int date=fis.read();
        while (date != -1){
            System.out.println((char)date);
            date=fis.read();
        }
        fis.close();
    }
}
