package day230409.Test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * @description:    List接口中的常用方法
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-09-10:19
 **/
public class ListTest {

    @Test
    public void test1(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("CC");
        list.add(678);

        System.out.println(list);

        //void add(int index,Object ele):在index位置插入ele元素
        list.add(1,"BB");
        System.out.println(list);

        //boolean addAll(int index,Collection eles):从index位置开始将eles中的所有元素添加到对象中
        List list1= Arrays.asList(1,2,3);
        //list.addAll(list1); //9
        list.add(list1);    //7 -->将list1中的元素当成一个整体
        System.out.println(list.size());

        //Object get（int index):获取指定index位置的元素
        System.out.println(list.get(2));
    }

    @Test
    public void test2(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");
        list.add("CC");
        list.add(456);

        //int indexOf(Object obj):返回obj在集合中首次出现的位置。如果不存在，返回-1
        int index=list.indexOf(456);
        System.out.println(index);

        //int lastIndexOf(Object obj):返回obj在当前集合中末次出现的位置。如果不存在，返回-1
        System.out.println(list.lastIndexOf(456));

        //Object remove（int index）：移除指定index位置的元素，并返回此元素
        Object obj=list.remove(0);
        System.out.println(obj);
        System.out.println(list);

        //Object set(int index,Object ele):设置指定index位置的元素为ele
        list.set(1,"HH");
        System.out.println(list);

        //List subList(int fromIndex,int toIndex) : 返回从fromIndex到toIndex位置的左闭右开区间
        List subList=list.subList(2,4);
        System.out.println(subList);
        System.out.println(list);

    }

    //遍历集合元素:
    @Test
    public void test3(){
        ArrayList list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add("AA");

        //方式一：Iterator迭代器的方式
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*****************");

        //方式二：增强for循环
        for(Object obj:list){
            System.out.println(obj);
        }

        System.out.println("******************");

        //方式三：普通for循环
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }


}
