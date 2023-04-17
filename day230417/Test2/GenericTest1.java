package day230417.Test2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:    如何自定义泛型类，泛型接口，泛型方法
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-17-19:08
 **/
public class GenericTest1 {

    @Test
    public void test1(){
        //如果定义了泛型类，实例化没有指明类的泛型，则认为此泛型类型为Object类型
        //要求：如果定义了类是带泛型的，建议在实例化时指明类的泛型
        Order order=new Order();
        order.setOrderT(123);
        order.setOrderT("ABC");

        //建议：实例化时指明类的泛型
        Order<String> order1=new Order<>("Tom",1001,"tom");
        order1.setOrderT("AA:hello");
    }

    @Test
    public void test2(){
        SubOrder sub1=new SubOrder();
        //由于子类在继承泛型的父类时，指明了泛型类型。则实例化子类对象时，不再需要指明泛型。
        sub1.setOrderT(1122);

        SubOrder1<String> sub2=new SubOrder1<>();
        sub2.setOrderT("order2...");
    }

    @Test
    public void test3(){
        Order<String> order = new Order<>();
        Integer[] arr=new Integer[]{1,2,3,4};
        //泛型方法在调用时，指明泛型参数的类型。
        List<Integer> list=copyFromArrayToList(arr);
        System.out.println(list);
    }

    //泛型方法:在方法中出现了泛型的结构，泛型参数与类的泛型参数没有任何关系
    // 换句话说，泛型方法所属的类是不是泛型类都没有关系。
    //泛型方法可以声明为静态的，原因：泛型参数是在调用方法时确定的，并非在实例化类时确定的。
    public static <E> List<E> copyFromArrayToList(E[] arr){    //指明E[]中的E不是一个类
        ArrayList<E> list = new ArrayList<>();

        for(E e:arr){
            list.add(e);
        }
        return list;
    }
}
