package day230517.Test1;

import org.junit.Test;

import java.io.*;

/**
 * @description:    处理流之一：缓冲流的使用
 * 作用：提供流的读取、写入的速度
 * 原因：内部提供了缓冲区
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-17-16:24
 **/
public class BufferedTest {

    //实现非文本文件的复制
    @Test
    public void BufferedStreamTest() throws IOException {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File("girl1001.jpg");
            File destFile = new File("girl1002.jpg");

            //2.造流
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取，写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);

                //bos.flush();//刷新缓冲区
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭：先关外层的流，再关内层的流
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            //说明：关闭外层流的同时，内层流也会关闭
//        fos.close();
//        fis.close();
        }
    }

    //实现非文本文件的复制
    public void copyFileWithBuffered(String srcPath,String destPath) {
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1.造文件
            File srcFile = new File(srcPath);
            File destFile = new File(destPath);

            //2.造流
            //2.1造节点流
            FileInputStream fis = new FileInputStream(srcFile);
            FileOutputStream fos = new FileOutputStream(destFile);

            //2.2造缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            //3.复制的细节：读取，写入
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4.资源关闭：先关外层的流，再关内层的流
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void testCopyFileWithBuffered(){
        long start = System.currentTimeMillis();

        String srcPath = "";
        String destPath = "";

        copyFileWithBuffered(srcPath,destPath);

        long end = System.currentTimeMillis();
        System.out.println("复制操作花费的时间为："+(end - start));
    }

    //使用BufferedReader和BufferedWriter实现文本文件的复制
    @Test
    public void testBufferedReaderBufferedWriter() throws IOException {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
       /* 方法一：
       //1.造文件
        File srcFile = new File("");
        File destFile = new File("");

        //2.造流
        //2.1造节点流
        FileReader fis = new FileReader(srcFile);
        FileWriter fos = new FileWriter(destFile);

        //2.2造缓冲流
        BufferedReader bis = new BufferedReader(fis);
        BufferedWriter bos = new BufferedWriter(fos);*/

            //方法二：创建文件和相应的流
            br = new BufferedReader(new FileReader(new File("abc.txt")));
            bw = new BufferedWriter(new FileWriter(new File("abc1.txt")));

            //读写操作
            //方式一：
            /*char[] cbuf = new char[1024];
            int len;
            while((len = br.read(cbuf)) !=-1){
                bw.write(cbuf,0,len);
                //bw.flush();
            }*/

            //方式二：
            String data;
            while ((data = br.readLine()) != null) {
                //方法一；
                bw.write(data +"\n");   //data不包含换行符
                //方法二：
                bw.write(data);
                bw.newLine();   //提供换行操作
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭资源流
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
