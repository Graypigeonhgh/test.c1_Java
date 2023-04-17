package day230417.Test1;

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
 * @date: 2023-4-17 18:15:50
 **/
public class EmployeeTest {

    //问题一：使用自然排序
    @Test
    public void test1(){
        TreeSet<Employee> set=new TreeSet<Employee>();
        //TreeSet<Employee> set=new TreeSet<>(); //前后泛型相同后面可省略

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

        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee employee=iterator.next();
            System.out.println(employee);
        }
    }

    //问题二：按生日日期的先后排序
    @Test
    public void test2(){
        TreeSet<Employee> set=new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1,Employee o2) {
                     MyDate b1=o1.getBirthday();
                     MyDate b2=o2.getBirthday();

                    return b1.compareTo(b2);
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
