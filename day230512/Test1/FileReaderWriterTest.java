package day230512.Test1;

import org.junit.Test;

import java.io.*;

/**
 * @description:    IO流--FileReader，FileWriter，FileInputStream和FileInputStream的基本操作
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-12-21:03
 **/
public class FileReaderWriterTest {
    public static void main(String[] args){
        File file = new File("hello.txt");//相较于当前工程（文件写在Module下，在当前工程找汇报文件找不到的异常
        System.out.println(file.getAbsoluteFile());
        //解决方法：使用File类的构造器
        File file1 = new File("day230512\\hello.txt");
        System.out.println(file1.getAbsoluteFile());
    }

    /*将day09下的hello.txt文件读入程序中，并输出到控制台
    说明：1.read()的理解：返回读入的一个字符。如果达到文件末尾，返回-1
          2.异常处理：为了保证流的资源一定可以执行关闭操作，需要使用try-catch-finally，不能使用throws
    */
    @Test
    public void test1() {
        FileReader fr = null;   //字符输入流
        try {
            //1.实例化File类的对象，指明要操作的文件
            File file = new File("hello.txt");  //相较于当前Module
            //2.提供具体的流
            fr = new FileReader(file);

            //3.数据的读入
            //read():返回读入的一个字符。如果达到文件末尾，返回-1
            //方式一：
            int date = fr.read();
            while (date != -1) {
                System.out.print((char)date);   //强制类型转换
                date = fr.read();
            }

            //方式二：语法上针对于方式一的修改
            int date1;
            while((date1 = fr.read()) !=-1){
                System.out.print((char) date1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.流的关闭操作
            try {
                if(fr != null)  //fr初始值为null，如果实例化过程中报异常，直接进入finally调用fr，就会报空指针异常
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //对read()操作升级：使用read的重载方法
    @Test
    public void testFileReader1() {
        FileReader fr = null;
        try {
            //1.File类的实例化
            File file = new File("hello.txt");

            //2.FileReader流的实例化
          fr = new FileReader(file);

            //3.读入的操作
            //read(char[] cbuf):charbuffer,返回每次读入cbuf数组中的字符的个数。如果达到文件末尾，返回-1
            char[] cbuf = new char[5];  //每次读入5个字符
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //方式一：错误的写法
//                for(int i=0;i < cbuf.length;i++){
//                    System.out.print(cbuf[i]);
//                }
                //正确的写法：
//                 for(int i=0;i < len;i++){
//                        System.out.print(cbuf[i]);    //每次输出五个字符，最后一次输出剩下的字符
//                    }

                //方式二:错误的写法：
//                String str = new String(cbuf);
//                System.out.print(str);
                //正确的写法：
                String str = new String(cbuf,0,len);    //使用String类的构造器
                System.out.print(str);

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
    1.输出操作，对应的File类可以不存在。并不会报异常
    2.File对应的硬盘中的文件如果不存在，在输出过程中，会自动创建此文件。
      File对应的硬盘中的文件如果存在:
            如果构造器是：FileWriter(file,false)/FileWriter(file):对原有的文件进行覆盖
            如果构造器是：FileWriter(file,true)：不会对原有的文件覆盖，而是在原有的文件内容的基础上进行添加
     */
    @Test
    public void testFileWriter() {
        FileWriter fw = null;
        try {
            //1.提供File类的对象，指明写出的文件
            File file = new File("hello1.txt");

            //2.提供FileWriter的对象，用于数据的写出
            fw = new FileWriter(file,false);

            //3.写出的操作
            fw.write("I have a dream!\n");
            fw.write("you have a dream,too!\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //4.流资源的关闭
                if(fw !=null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    //FileReader和FileWriter同时使用
    @Test
    public void testFileReaderFileWriter() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1.创建File类的对象，指明读入和写出的文件
            //不能使用字符流处理图片等字节数据（如xxx.jpg)
            File srcFile = new File("hello.txt");
            File destFile = new File("helo1.txt");

            //2.创建输入流和输出流的对象
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3.数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;
            while ((len = fr.read(cbuf)) != -1) {
                //每次写出len个字符
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源流
            try {
                if(fr != null)
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {   //fr.close()报异常不会影响fw.close()的执行
                if(fw != null)
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testFileInputStream() {
        FileInputStream fis= null;
        try {
            //1.创建File类的对象，指明输出的文件
            File file = new File("hello.txt");

            //2.创建输出流的对象
            fis = new FileInputStream(file);

            //3.读入数据
            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                String str = new String(buffer,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源流
            if(fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }



    }


    //FileInputStream和FileInputStream的同时使用
    @Test
    public void testFileInputOutputStream() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建File类的对象，指明输出的文件
            File srcFile = new File("国际奥林匹克日手机海报4.jpg");
            File destFile = new File("国际奥林匹克日手机海报5.jpg");

            //2.创建输出流的对象
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3.数据的输入和输出操作(复制的过程)
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) !=-1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.关闭资源流
            try {
                if(fos != null)
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(fis != null)
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}


