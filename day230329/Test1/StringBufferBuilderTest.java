package day230329.Test1;

import org.junit.Test;

/**
 * @description:    StingBuffer，StringBuilder的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-29-21:21
 **/
public class StringBufferBuilderTest {

    @Test
    public void test2(){
        StringBuffer s1=new StringBuffer("abcdef");  //初始化长度为16
        //字符串拼接
        s1.append(1);
        s1.append('1'); //两者相同，因为append（）形参中提供了多种数据类型
        System.out.println(s1);
        //删除指定位置，左闭右开[2,5)
        s1.delete(2,5);
        System.out.println(s1);

        //把[start,end)位置替换为str
        s1.replace(4,8,"helloo");
        System.out.println(s1);
        //插入
        s1.insert(2," false ");
        System.out.println(s1);
        //反转
        s1.reverse();
        System.out.println(s1);
        System.out.println("**********************");
        //返回一个左闭右开区间内的子字符集
        String s2=s1.substring(1,3);
        System.out.println(s2);

        System.out.println(s1.length());//为存储数据的长度
    }

    @Test
    public void test1(){
        StringBuffer sb1=new StringBuffer("abc");
        sb1.setCharAt(0,'m');
        System.out.println(sb1);

        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.length());   //0
    }

}
