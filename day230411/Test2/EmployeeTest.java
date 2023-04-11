package day230411.Test2;

import org.junit.Test;

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

        Employee e1=new Employee("刘德华",55,new MyDate(1969,5,3));
        Employee e2=new Employee("张学友",45,new MyDate(1975,6,8));
        Employee e3=new Employee("郭富城",38,new MyDate(1980,3,12));
        Employee e4=new Employee("黎明",60,new MyDate(1960,2,7));
        Employee e5=new Employee("梁朝伟",33,new MyDate(1991,11,7));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
    }
}
