package day230517.Test1;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:    图片的加密与解密
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-17-18:52
 **/
public class PicTest {

    //图片的加密
    @Test
    public void test1(){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("girl2002.jpg");
            fos = new FileOutputStream("girl2003.jpg");

            byte[] buffer = new byte[20];
            int len;
            while((len = fis.read(buffer)) !=-1){
                //字节数组进行修改
                //错误的：只是将buffer赋给了b，buffer本身没有变
    //            for(byte b:buffer){
    //                b = (byte)(b^5);
    //            }

                //正确的
                for(int i=0;i < len;i++){
                    buffer[i] = (byte)(buffer[i]^5);    //异或5
                }
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    //图片的解密
    @Test
    public void test2() {

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("girl2003.jpg");
            fos = new FileOutputStream("girl2004.jpg");

            byte[] buffer = new byte[20];
            int len;
            while ((len = fis.read(buffer)) != -1) {

                for (int i = 0; i < len; i++) {
                    buffer[i] = (byte) (buffer[i] ^ 5);    //再次异或5即等于原值
                }
                fos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
