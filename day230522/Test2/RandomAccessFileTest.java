package day230522.Test2;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @description:    RandomAccessFile实现数据的读写和插入
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-22-19:26
 **/
public class RandomAccessFileTest {

    @Test
    public void test1(){
        RandomAccessFile raf1 = null;
        RandomAccessFile raf2 = null;
        try {
            //1.创建流的对象txt
            raf1 = new RandomAccessFile(new File("object.txt"),"r");
            raf2 = new RandomAccessFile(new File("object.txt"),"rw");
            //2.读写过程
            byte[] buffer = new byte[1024];
            int len;
            while((len = raf1.read(buffer)) != -1){
                raf2.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //3.关闭流
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (raf2 != null) {
                try {
                    raf2.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void test2(){
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile("hello.txt","rw");
            raf1.seek(3);   //将指针调到角标为3的位置
            raf1.write("xyz".getBytes());   //替换开头三个字符
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    /*通过RandomAccesssFile实现“插入”数据的效果

     */
    @Test
    public void test3(){
        RandomAccessFile raf1 = null;
        try {
            raf1 = new RandomAccessFile("hello.txt","rw");

            raf1.seek(3);   //将指针调到角标为3的位置
            //保存指针3后面的所有数据到StringBuilder中（以文件长度来定义builder的长度）
            StringBuilder builder = new StringBuilder((int) new File("hello.txt").length());
            byte[] buffer = new byte[20];
            int len;
            while((len =raf1.read(buffer)) != -1){
                builder.append(new String(buffer,0,len));
            }
            //掉回指针，写入“xyz”
            raf1.seek(3);
            raf1.write("xyz".getBytes());

            //将StirngBuileder中的数据写入文件中
            raf1.write(builder.toString().getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (raf1 != null) {
                try {
                    raf1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }

}
