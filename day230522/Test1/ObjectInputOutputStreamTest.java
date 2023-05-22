package day230522.Test1;

import org.junit.Test;

import java.io.*;

/**
 * @description:    对象流序列化与反序列化字符串操作
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-22-17:20
 **/
public class ObjectInputOutputStreamTest {

    /*序列化过程：
    将内存中的Java对象保存到磁盘中或通过网络传输出去
    使用ObjectOutputStream实现
     */
    @Test
    public void testObjectOutputStream(){
        ObjectOutputStream oos = null;
        try {
            //1.
            oos = new ObjectOutputStream(new FileOutputStream("object.dat"));
            //2.
            oos.writeObject(new String("我爱北京天安门"));
            oos.flush();    //刷新操作

            oos.writeObject(new Person("王铭",23));
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oos != null) {
                try {
                    //3.关闭资源流
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*反序列化：
    将磁盘文件中的对象还原为内存中的一个Java对象
    使用ObjectInputStream来实现
     */
    @Test
    public void testObjectInputStream(){

        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream("object.dat"));
            Object obj = ois.readObject();
            String str = (String) obj;

            Person p = (Person)ois.readObject();
            System.out.println(str);
            System.out.println(p);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
