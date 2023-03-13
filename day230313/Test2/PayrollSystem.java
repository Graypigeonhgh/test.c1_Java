package day230313.Test2;
/**
 * @description:   编写工资系统，实现不同类型员工(多态)的按月发放工资。如果当月出现某个Employee对象的生日，
 *                 则将该雇员的工资增加100元。
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/13 19:10
 */

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        //方式1：
//        Scanner scan=new Scanner(System.in);
//        System.out.println("请输入当月的月份：");
//        int month=scan.nextInt();
        //方式二
        Calendar calendar= Calendar.getInstance();  //Calendar:API,获取当前月份
        int month=calendar.get(Calendar.MONTH);
        System.out.println(month);//首月January为0


        Employee[] emps=new Employee[2];

        emps[0]=new SalariedEmployee("马森",1002,new MyDate(2002,3,6),10000);
        emps[1]=new HourEmployee("猴森",2001,new MyDate(2006,2,23),100,8);

        for(int i=0;i<emps.length;i++){
            System.out.println(emps[i]);
            double salary=emps[i].earnings();
            System.out.println("月工资为:"+salary);

            if((month+1)==emps[i].getBirthday().getMonth()){    //首月January为0,month+1为我们认为的一月
                System.out.println("生日快乐！奖励100元");
            }
        }
    }
}
