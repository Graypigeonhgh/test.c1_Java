package day230401.Test1;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @description:    Calendar 日历类（抽象类）的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-01-20:18
 **/
public class CalendarTest {
    @Test
    public void testCalendar(){
        //1.实例化
        //方式一：创建其子类（GregorianCalendar）的对象
        //方式二：调用其静态方法getInstance（）
        Calendar calendar=Calendar.getInstance();
        System.out.println(calendar.getClass());

        //2.常用方法
        //get()
        int days=calendar.get(Calendar.DAY_OF_MONTH);   //获取当月号数
        System.out.println(days);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));

        //set()
        calendar.set(Calendar.DAY_OF_MONTH,18);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //add()
        calendar.add(Calendar.DAY_OF_MONTH,10);
        days=calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(days);

        //getTime():日历类-->Date
        Date date=new Date();
        System.out.println(date);   //Sat Apr 01 20:44:11 CST 2023

        //setTime():Date-->日历类
        Date date1=new Date();
        calendar.setTime(date1);
        days=calendar.get(Calendar.DAY_OF_YEAR);
        System.out.println(days);   //91
    }


}
