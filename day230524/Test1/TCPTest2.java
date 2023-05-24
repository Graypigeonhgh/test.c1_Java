package day230524.Test1;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @description:    例题二：客户端发送文件给服务端，服务端将文件保存在本地
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-24-18:39
 **/
public class TCPTest2 {

    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        FileInputStream fis = null;
        try {
            //1.创建Socket对象，指明服务器端IP和端口号
            socket = new Socket(InetAddress.getByName("127.0.0.1"),9090);
            //2.获取一个输出流，用于输出数据
            os = socket.getOutputStream();
            //3.获取一个输入流，用于读取文件数据
            fis = new FileInputStream(new File("orion.jpg"));

            //4.写出数据的操作
            byte[] buffer = new byte[1024];
            int len;
            while((len = fis.read(buffer)) !=-1){
                os.write(buffer,0,len);
            }
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
        }

    }

    @Test
    public void server(){
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //1.创建服务器端的ServerSocket，指明自己的端口号
            ServerSocket ss = new ServerSocket(9090);
            //2.调用accept()表示接收来自于客户端的socket
            Socket socket = ss.accept();
            //3.获取输入流,用于读取输入流中的数据
            is = socket.getInputStream();
            //4.获取一个输出流，读取文件数据
            fos = new FileOutputStream(new File("orion1.jpg"));
            //5.写出数据的操作
            byte[] buffer = new byte[1024];
            int len;
            while((len = is.read(buffer)) != -1){
                fos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //6.关闭资源流
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
        }

    }
}
