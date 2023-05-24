package day230524.Test1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @description:
 * 实现TCP的网络编程例题3:从客户端发送文件给服务端，服务端保存到本地。
 * 并返回“发送成功”给客户端并关闭相应的连接。
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-24-19:09
 **/
public class TCPTest3 {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        ByteArrayOutputStream baos = null;
        try {
            //1.创建Socket对象，指明服务器端IP和端口号
            socket = new Socket(InetAddress.getByName("127.0.0.1"), 9090);
            //2.获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //3.获取一个输入流，用于读取文件数据
            fis = new FileInputStream(new File("orion.jpg"));

            //4.写出数据的操作
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fis.read(buffer)) != -1) {
                os.write(buffer, 0, len);
            }

            socket.shutdownOutput();    //关闭数据的输出

            //5.接收来自于服务器端的数据，并显示到控制台上
            InputStream is = socket.getInputStream();
            baos = new ByteArrayOutputStream();//将数据存到其内部的数组里
            byte[] byffer = new byte[20];
            int len1;
            while ((len1 = is.read(buffer)) != -1) {
                baos.write(buffer, 0, len1);
            }
            System.out.println(baos.toString());    //输出baos的内容

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (socket != null) {
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (baos != null) {
                try {
                    baos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }

    @Test
    public void server(){
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ServerSocket ss = new ServerSocket(9090);
            //2.调用accept()表示接收来自于客户端的socket
            Socket socket = ss.accept();
            //3.获取输入流,用于读取输入流中的数据
            is = socket.getInputStream();
            //4.获取一个输出流，读取文件数据
            fos = new FileOutputStream(new File("orion2.jpg"));
            //5.写出数据的操作
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }

            //6.服务器端给予客户端反馈
            os = socket.getOutputStream();
            os.write("你好，照片已收到！".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //7.关闭资源流
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (os != null) {
                try {
                    os.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
