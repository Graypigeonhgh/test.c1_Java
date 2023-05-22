package day230520.Test1;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @description:
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-20-21:00
 **/

/*1.3练习:
从键盘输入字符串，要求将读取到的整行字符串转成大写输出。然后继续进行输入操作，直至当输入“e”或者exit”时，退出程序。
方法一: 使用Scanner实现
方法二: 使用System.in实现
 */
public class OtherStreamTest {

    @Test
    public void test1() {
        BufferedReader br = null;
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            br = new BufferedReader(isr);

            while (true) {
                System.out.print("请输入字符串：");
                String data = br.readLine();
                if ("e".equalsIgnoreCase(data) || "exit".equalsIgnoreCase(data)) {   //equalsIgnoreCase:equals忽略大小写
                    System.out.println("程序结束");
                    break;
                }

                String upperCase = data.toUpperCase();  //data改成大写
                System.out.println(upperCase);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
