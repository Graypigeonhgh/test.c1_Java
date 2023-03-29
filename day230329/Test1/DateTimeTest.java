package day230329.Test1;

import org.junit.Test;

import java.util.Date;

/**
 * @description:    Date类的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-29-22:18
 **/
public class DateTimeTest {
    @Test
    public void test(){
        //构造器一：Date（）：创建一个对应当前时间的Date对象
        Date date1 = new Date();
        System.out.println(date1.toString());   //Wed Mar 29 22:30:28 CST 2023

        System.out.println(date1.getTime());    //1680100269493,时间戳

        //构造器二：创建指定毫秒数的Date对象
        Date date2=new Date(1680100269493L);
        System.out.println(date2.toString());   //Wed Mar 29 22:31:09 CST 2023

        //创建java.sql.Date 对象
        java.sql.Date date3 = new java.sql.Date(1384975394023L);
        System.out.println(date3);  //2013-11-21

        //如何将java.util.Date对象转换为java.sql.Date对象
        //情况一：
        Date date4=new java.sql.Date(4234789923933L);
        java.sql.Date date5=(java.sql.Date)date4;
        System.out.println(date5);  //2104-03-13  强制类型转换

        //情况二：
        Date date6=new Date();
        java.sql.Date date7=new java.sql.Date(date6.getTime());
        System.out.println(date7);  //2023-03-29
    }
}
