package day230331.Test1;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description:    SimpleDateFormat的使用：SimpleDateFormat对日期Date类的格式化和解析
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-31-21:51
 **/
public class DateTimeTest {

    @Test
    public void testSimpleDateFormat() throws ParseException {
        //实例化SimpleDateFormat:使用默认的构造器
        SimpleDateFormat sdf = new SimpleDateFormat();

        //格式化：日期-->字符串
        Date date=new Date();
        System.out.println(date);   //Fri Mar 31 22:12:33 CST 2023

        String format=sdf.format(date);
        System.out.println(format);     //23-3-31 下午10:12

        //解析：格式化的逆过程，字符串-->日期
        String str="23-3-31 下午10:05";    //格式要和格式化一致
        Date date1=sdf.parse(str);
        System.out.println(date1);

        //按照指定的方式格式化和解析：调用带参的构造器
        //SimpleDateFormat sdf1=new SimpleDateFormat("yyyyy.MMMMM.dd GGG hh:mm aaa");
        //格式化
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format1=sdf1.format(date);
        System.out.println(format1);    //2023-03-31 10:12:33
        //解析：要求字符串必须是符合SimpleDateFormat识别的格式（通过构造器参数体现）
        String str1="2023-03-31 10:12:33";
        Date date2=sdf1.parse(str1);
        System.out.println(date2);      //day230331.Test1.DateTimeTest


    }

    //练习1：字符串“2031-09-08”转换为java.sql.Date
    @Test
    public void test2() throws ParseException {
        String birth = "2031-09-08";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse(birth);
        System.out.println(date);   //Mon Sep 08 00:00:00 CST 2031

        java.sql.Date birthDate=new java.sql.Date(date.getTime());
        System.out.println(birthDate);     //2031-09-08
    }

    //练习2：“三天大渔两天晒网”，从1990-01-01开始，xxxx-xx-xx 后，打渔？晒网？
    @Test
    public void test1 () throws ParseException {
        String  doDate1= "1990-01-01";
        String  doDate2 = "2023-04-01";
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse(doDate1);
        Date date2=sdf.parse(doDate2);

        //计算总天数
       long sumDay = (date2.getTime() - date1.getTime())/(1000*60*60*24)+1;
        if(sumDay%5==1||sumDay%5==2||sumDay%5==3){
            System.out.println("天数为"+sumDay+",打渔");
        }else{
            System.out.println("天数为"+sumDay+",晒网");
        }



    }
}
