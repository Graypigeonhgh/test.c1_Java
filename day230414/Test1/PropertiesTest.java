package day230414.Test1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * @description:    Properties:常用来处理配置文件：key和value都是String类型
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-14-20:50
 **/
public class PropertiesTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            Properties pros = new Properties();

            fis = new FileInputStream("jbdc.properties");
            pros.load(fis);//加载流对应的文件

            String name = pros.getProperty("name");
            String password = pros.getProperty("password");
            System.out.println("name=" + name + ",password=" + password);
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
        }
    }
}
