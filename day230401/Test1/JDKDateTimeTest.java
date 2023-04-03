package day230401.Test1;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.TemporalAccessor;

/**
 * @description:    LocalDate,LocalTime,LocalDateTime的使用
 *                  Instant的使用（类似于java.util.Date类）
 *                  java.time.format.DateTimeFormatter类，该类提供了三种格式化的方法
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-01-21:09
 **/
public class JDKDateTimeTest {
    @Test
    public void test1(){
        //now():获取当前的日期，时间，日期+时间
        LocalDate localDate=LocalDate.now();
        LocalTime localTime=LocalTime.now();
        LocalDateTime localDateTime=LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        System.out.println("********************");
        //of():设置指定的年，月，日，时，分，秒。没有偏移量
        LocalDateTime localDateTime1=LocalDateTime.of(2023,9,18,22,20,20);
        System.out.println(localDateTime1);

        //getXxx
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getDayOfWeek());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getMinute());

        System.out.println("*************************");
        //withXxx:设置相关属性，体现不可变性
        LocalDate localDate1=localDate.withDayOfMonth(22);
        System.out.println(localDate);      //2023-04-01
        System.out.println(localDate1);     //2023-04-22

        LocalDateTime localDate2=localDateTime.withHour(10);
        System.out.println(localDateTime);  //2023-04-01T21:32:08.437
        System.out.println(localDate2);     //2023-04-01T10:32:08.437

        System.out.println("************************");
        //体现了不可变性
        LocalDateTime localDateTime3=localDateTime.plusMonths(3);
        System.out.println(localDateTime);  //2023-04-01T21:32:08.437
        System.out.println(localDateTime3); // 2023-07-01T21:32:08.437

        LocalDateTime localDateTime4=localDateTime.minusDays(3);
        System.out.println(localDateTime);  //2023-04-01T21:35:25.457
        System.out.println(localDateTime4); //2023-03-29T21:35:25.457

    }

    @Test
    public void test2(){
        //now();获取本初子午线对应的标准时间
        Instant instant=Instant.now();
        System.out.println(instant);    //2023-04-01T14:00:32.609Z

        //添加时间的偏移量:设置时区
        OffsetDateTime offsetDateTime=instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime); //2023-04-01T22:00:32.609+08:00

        //toEpochMilli():获取自1970年1月1日0时0分0秒（UTC)开始的毫秒数-->Date类的getTime（）
        long milli=instant.toEpochMilli();
        System.out.println(milli);  //1680357632609

        //
        Instant instant1=Instant.ofEpochMilli(1680357632609L);  //L指其为long型变量
        System.out.println(instant1);   //2023-04-01T14:00:32.609Z
    }

    @Test
    public void test3(){
        //方式一：预定义的标准格式：如 ISO_LOCAL_DATE_TIME等三个
        DateTimeFormatter formatter=DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //格式化：日期-->字符串
        LocalDateTime localDateTime=LocalDateTime.now();
        String str1=formatter.format(localDateTime);
        System.out.println(localDateTime);  //2023-04-01T22:17:58.944
        System.out.println(str1);   //2023-04-01T22:17:58.944

        //解析：字符串-->日期
        TemporalAccessor parse = formatter.parse("2023-04-01T22:17:58.944"); //格式要一致
        System.out.println(parse);  //{},ISO resolved to 2023-04-01T22:17:58.944

        //方式二：本地化相关的格式。如：ofLocalizedDateTime（）
        DateTimeFormatter formatter1=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        //格式化
        String str2 = formatter1.format(localDateTime);
        System.out.println(str2);   //2023年4月1日 下午10时26分33秒

        DateTimeFormatter formatter2=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        //格式化
        String str3 = formatter2.format(LocalDate.now());
        System.out.println(str3);   //2023-4-1

        //方式三（重点）：自定义的格式。如ofPattern("yyyy-MM-dd hh:mm:ss);
        DateTimeFormatter formatter3=DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        //格式化
        String str4=formatter3.format(LocalDateTime.now());
        System.out.println(str4);  //2023-04-01 10:37:51
    }


}
