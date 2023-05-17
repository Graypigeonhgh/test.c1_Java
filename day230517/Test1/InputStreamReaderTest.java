package day230517.Test1;

import org.junit.Test;

import java.io.*;

/**
 * @description:    处理流之二：转换流的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-17-22:40
 **/
public class InputStreamReaderTest {

    @Test
    public void test1(){

        InputStreamReader isr = null;
        try {
            FileInputStream fis = new FileInputStream("abcd.txt");
            isr = new InputStreamReader(fis);   //使用系统默认的字符集

            //参数2指明了字符集，具体使用哪个字符集，取决于文件abcd.txt保存时使用的字符集
//            isr = new InputStreamReader(fis,"gbk");

            char[] cbuf = new char[20]; //每次读取字符的个数
            int len;
            while((len = isr.read(cbuf)) != -1){
                String str = new String(cbuf,0,len);
                System.out.print(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(isr != null){
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            //1.造文件
            File file1 = new File("abcd.txt");
            File file2 = new File("abcde.txt"); //gbk写出：乱码

            FileInputStream fis = new FileInputStream(file1);
            FileOutputStream fos = new FileOutputStream(file2);

            isr = new InputStreamReader(fis,"utf-8");
            osw = new OutputStreamWriter(fos,"gbk");

            //读写过程
            char[] cbuf = new char[20];
            int len;
            while((len = isr.read(cbuf)) !=-1){
                osw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭资源
            if (isr != null) {
                try {
                    isr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (osw != null) {
                try {
                    osw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        }



    }

}
