package day230523.Test1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @description:    IP的理解与InetAddress类的实例化
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-23-18:17
 **/
public class InetAddressTest {

    public static void main(String[] args){
        try {
            InetAddress inet1 = InetAddress.getByName("192.168.10.14");

            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getByName("127.0.0.1"); //获取本地IP

            InetAddress inet4 = InetAddress.getLocalHost();
            System.out.println(inet4);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
