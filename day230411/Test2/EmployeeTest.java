package day230411.Test2;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @description:    创建该类的5个对象，并把这些对象放入 TreeSet 集合中(下一章:Treeset 需使用泛型来定义)
 * 分别按以下两种方式对集合中的元素进行排序，并遍历输出:
 * 1).使Employee 实现 Comparable 接口，并按 name 排序
 * 2)创建 TreeSet 时传入 Comparator 对象，按生日日期的先后排序。
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-11-22:43
 **/
public class EmployeeTest {

    //问题一：使用自然排序
    @Test
    public void test1(){
        TreeSet set=new TreeSet();

        Employee e1=new Employee("liudehua",55,new MyDate(1975,5,3));
        Employee e2=new Employee("zhangxueyou",45,new MyDate(1975,6,8));
        Employee e3=new Employee("guofucheng",38,new MyDate(1980,3,12));
        Employee e4=new Employee("liming",60,new MyDate(1960,2,7));
        Employee e5=new Employee("liangchaowei",33,new MyDate(1991,11,7));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
    }

    //问题二：按生日日期的先后排序
    @Test
    public void test2(){
        TreeSet set=new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Employee && o2 instanceof Employee){
                     Employee e1=(Employee) o1;
                     Employee e2=(Employee) o2;

                     MyDate b1=e1.getBirthday();
                     MyDate b2=e2.getBirthday();
                     //方式一：
//                     int minusYear=b1.getYear()-b2.getYear();
//                     if(minusYear != 0){
//                         return minusYear;
//                     }
//
//                     int minusMonth=b1.getMonth()-b2.getMonth();
//                     if(minusMonth != 0){
//                         return minusMonth;
//                     }
//
//                     return b1.getDay() - b2.getDay();

                    //方式二:
                    return b1.compareTo(b2);
                }
                //return 0;
                throw new RuntimeException("传入的数据类型不一致");
            }
        });

        Employee e1=new Employee("liudehua",55,new MyDate(1975,5,3));
        Employee e2=new Employee("zhangxueyou",45,new MyDate(1975,6,8));
        Employee e3=new Employee("guofucheng",38,new MyDate(1980,3,12));
        Employee e4=new Employee("liming",60,new MyDate(1960,2,7));
        Employee e5=new Employee("liangchaowei",33,new MyDate(1991,11,7));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);

        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
