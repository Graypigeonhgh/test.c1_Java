package day230512.Test1;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @description:    使用FileInputStream和FileOutputStream复制文件的方法测试
 *                 （可以复制非文本文件，也可以复制文本文件）
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-13-16:03
 **/
public class CopyFileTest {

    //指定路径下文件的复制
    public void copyFile(String srcPath,String destPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1.创建File类的对象，指明输出的文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

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

    @Test
    public void testCopyFile(){

        long start = System.currentTimeMillis();

        String srcPath = "D:\\360MoveData\\Users\\23718\\OneDrive\\桌面\\006.mp4.lnk";
        String destPath = "D:\\360MoveData\\Users\\23718\\OneDrive\\桌面\\007.mp4.lnk";
        copyFile(srcPath,destPath);

        long end = System.currentTimeMillis();

        System.out.println("复制操作花费的时间为："+(end - start));
    }
}
