package day230329.Test1;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @description:    String 与 基本数据类型，包装类,char[],byte[]之间的转换
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-29-19:31
 **/
public class StringTest {

    @Test
    public void test1(){
        String s1="1234";
        int num=Integer.parseInt(s1);
        System.out.println(s1);

        //基本数据类型-->String :两种方法
        String s2=String.valueOf(num);//"1234"
        String s3=num+"";   //s3指向堆空间

        System.out.println(s2);
        System.out.println(s1==s3);//false
    }

    @Test
    public void test2(){
        //String与char[]之间的转换

        String str1="ab123";
        //String-->char[];调用String的toCharArray（）
        char[] charArrays = str1.toCharArray();
        for(int i=0;i<charArrays.length;i++){
            System.out.println(charArrays[i]);
        }

        char[] arr=new char[]{'h','e','l','l','o'};
        //char-->String :调用String的构造器
        String str2=new String(arr);
        System.out.println(str2);
    }

    @Test
    public void test3() throws UnsupportedEncodingException {
        //编码：字符串-->字节（二进制数据）

        String str1="123abc中国台湾";
        //编码：String-->byte[]:调用String的getByte（）
        byte[] bytes=str1.getBytes();//使用默认的字符集，进行编码，中文会乱码
        //
        System.out.println(Arrays.toString(bytes));

        byte[] gbks=str1.getBytes("gbk");   //使用gbk字符集进行编码。用两个数字代表一个字
        System.out.println(Arrays.toString(gbks));

        System.out.println("**********************");

        String str2=new String(bytes);  //使用默认字符集，进行解码。
        System.out.println(str2);

        String str3=new String(gbks);
        System.out.println(str3);   //出现乱码。原因：编码集和解码集不一致

        String str4=new String(gbks,"gbk"); //设置字符集
        System.out.println(str4);   //没有。原因：编码集和解码集一致
    }
}
