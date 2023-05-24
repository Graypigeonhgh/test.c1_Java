package day230524.Test2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @description:    URL网络编程实现Tomcat服务端数据下载
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-24-20:20
 **/
public class URLTest {
    public static void main(String[] args) throws IOException {

        HttpURLConnection urlConection = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            urlConection = null;
            is = null;
            fos = null;

            URL ur1 = new URL("http://localhost:8080/examples/orion.jpg");

            urlConection = (HttpURLConnection) ur1.openConnection();

            urlConection.connect();

            is = urlConection.getInputStream();
            fos = new FileOutputStream("day230523\\beauty3.jpg");

            byte[] buffer = new byte[1024];
            int len;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer,0,len);
            }

            System.out.println("下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (is != null) {
                is.close();
            }
            if (fos != null) {
                fos.close();
            }
            if (urlConection != null) {
                urlConection.disconnect();//断开连接
            }
        }




    }

}
