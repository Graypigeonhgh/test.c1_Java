package day230524.Test2;

import org.junit.Test;

import java.io.IOException;
import java.net.*;

/**
 * @description:    UDP协议的网络编程
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-24-19:48
 **/
public class UDPTest {
    //发送端
    @Test
    public void sender() {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket();

            String str = "我是UDP方式发送的导弹";
            byte[] data = str.getBytes();
            InetAddress inet = InetAddress.getLocalHost();  //本地IP
            DatagramPacket packet = new DatagramPacket(data,0,data.length,inet,9090);

            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }


    }

    //接收端
    @Test
    public void receiver() {
        DatagramSocket socket = null;
        try {
            socket = new DatagramSocket(9090);

            byte[] buffer = new byte[100];
            DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

            socket.receive(packet);

            System.out.println(new String(packet.getData(),0, packet.getLength()));//getData()就是buffer中的数据
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                socket.close();
            }
        }

    }
}
