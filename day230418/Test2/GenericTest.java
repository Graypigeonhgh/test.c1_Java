package day230418.Test2;

import day230418.Test1.Student;
import org.junit.Test;

import java.util.*;

/**
 * @description:    泛型在继承方面的体现和通配符的使用，以及使用通配符后数据的读取和写入要求
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-18-22:23
 **/
public class GenericTest {

    //1.泛型在继承方面的体现
    //类A是类B的父类，G<A>和G<B>二者不具备子父类关系，二者是并列关系
    //补充：类A是类B的父类，A<G>是B<G>的父类

    @Test
    public void test1(){
        Object obj=null;
        String str=null;
        obj=str;

        Object[] arr1=null;
        String[] arr2=null;
        arr1=arr2;

        List<Object> list1=null;
        List<String> list2=null;
        //此时的list1和list2的类型不具有子父类关系(如下str和date的关系），二者是并列关系
        //list1=list2;

        Date date = new Date();
        //str=date;

    }

    @Test
    public void test(){
        AbstractList<String> list1=null;
        List<String> list2=null;
        ArrayList<String> list3=null;

        list1 = list3;
        list2 = list3;

        List<String> list4 = new ArrayList<>();
    }

    //2.通配符“?”的使用
    //类A是类B的父类，G<A>和G<B>没有关系，二者共同的父类是：G<?>
    @Test
    public void test3(){
         List<Object> list1=null;
         List<String> list2=null;

         List<?> list=null;

         list=list1;
         list=list2;



//         print(list1);
//         print(list2);

        List<String> list3=new ArrayList<>();
        list3.add("AA");
        list3.add("BB");
        list3.add("CC");

        list=list3;
        //添加:对于List<?>就不能向其内部添加数据。
        list.add(null);

        //获取（读取）
        Object o=list.get(0);
        System.out.println(o);
        System.out.println(list.get(2));
    }

    public void print(List<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    //3.有限制条件的通配符的使用。
    //？ extends A:  G<? extends A> 可以作为G<A>和G<B>的父类，其中B是A的子类
    //?  super A:    G<? super A> 可以作为G<A>和G<B>的父类，其中B是A的子类

    @Test
    public void test4(){
        List<? extends Person> list1=null;  //类<=Person
        List<? super Person> list2=null;    //类>=Person

        List<Student1> list3=new ArrayList<Student1>();
        List<Person> list4=new ArrayList<Person>();
        List<Object> list5=new ArrayList<Object>();

        list1 = list3;
        list1 = list4;
//        list1 = list5;

//        list2=list3;
        list2=list4;
        list2=list5;

        //读取数据
        list1=list3;
        Person p1 = list1.get(0);
        Object p2 = list1.get(0);
        //编译不通过
        //Student s=list1.get(0);

        list2 = list4;
        Object obj=list2.get(0);
        //编译不通过
//        Person obj = list2.get(0);

        //写入数据：
        //编译不通过
//        list1.add(new Student1());
        list2.add(new Person());
        list2.add(new Student1());
    }

}
