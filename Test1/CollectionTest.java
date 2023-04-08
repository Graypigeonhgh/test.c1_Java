package day230408.Test1;

import org.junit.Test;

import java.util.*;

/**
 * @description:    Collection接口的常用方法
 * 向Collection接口的实现类的对象中添加数据obj时，要求obj所在类要重写equals（）
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-08-12:59
 **/
public class CollectionTest {

    @Test
    public void test1(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));   //Person p=new Person(jerry,20);coll.add(p);

        //1.cotains(Object obj):判断当前集合是否包含obj
        //我们在判断时会调用obj对象所在类的equals（）
        boolean cotains=coll.contains(123);
        System.out.println(cotains);    //true
        System.out.println(coll.contains(new String("Tom")));   //true
        System.out.println(coll.contains(new Person("Jerry", 20))); //false-->true:重写equals（）

        //2.containAll(Collection coll1):判断形参coll1中所有元素是否都存在于当前集合中。
        Collection coll1= Arrays.asList(123,456);
        System.out.println(coll.containsAll(coll1));    //true
    }

    @Test
    public void test2(){
        //3.remove(Object obj):从当前集合中移除obj元素
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        coll.remove(123);
        System.out.println(coll);

        coll.remove(new Person("Jerry",20));
        System.out.println(coll);

        //4.removeAll(Collection coll1):差集：从当前集合中移除所有coll1中的所有元素
        Collection coll1=Arrays.asList(123,45678);
        coll.removeAll(coll1);
        System.out.println(coll);

    }

    @Test
    public void test3(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //5.retainAll(Collection coll1):交集：获取当前集合和coll1集合的交集，并返回给当前集合。
        Collection coll1=Arrays.asList(123,456,789);
        coll.retainAll(coll1);
        System.out.println(coll);
    }

    @Test
    public void test4(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new String("Tom"));
        coll.add(false);
        coll.add(new Person("Jerry",20));

        //6.equals(Object obj):
        Collection coll1=new ArrayList();
        coll1.add(123);
        coll1.add(456);
        coll1.add(new String("Tom"));
        coll1.add(false);
        coll1.add(new Person("Jerry",20));

        System.out.println(coll.equals(coll1));

        //7.hashCode():返回当前对象的哈希值
        System.out.println(coll.hashCode());

        //8.集合-->数组：toArray（）
        Object[] arr=coll.toArray();
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        //拓展：数组 --->集合：调用Arrays类的静态方法asList()
        List<String> list=Arrays.asList(new String[]{"AA","BB","CC"});
        System.out.println(list);   //[AA, BB, CC]

        List arr1=Arrays.asList(new int[]{123,456});
        System.out.println(arr1);   //[[I@3d82c5f3]
        System.out.println(arr1.size());    //1

        List arr2=Arrays.asList(new Integer[]{123,456});
        System.out.println(arr2);   //[123, 456]
        System.out.println(arr2.size());    //2
    }

    //集合元素的遍历操作，使用迭代器Iterator接口。迭代器不是容器，只用于遍历
    //内部的方法：hasNext（）和next（）
    @Test
    public void test5(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        Iterator iterator=coll.iterator();  //每调用一次coll.iterator(),都会生成一个新的迭代器对象
        //方式一：
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        //报异常：NoSuchElementException
        //System.out.println(iterator.next());

        //方式二：不推荐
//        for(int i=0;i<coll.size();i++){
//            System.out.println(iterator.next());
//        }

        //方式三：推荐
        //hasNext():判断是否还有下一个元素
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test6(){
        Collection coll=new ArrayList();
        coll.add(123);
        coll.add(456);
        coll.add(new Person("Jerry",20));
        coll.add(new String("Tom"));
        coll.add(false);

        //删除集合中的“Tom"
        Iterator iterator=coll.iterator();
        while(iterator.hasNext()){
            Object obj=iterator.next();
            if("Tom".equals(obj)){
                iterator.remove();
            }
        }

        //遍历集合
        iterator=coll.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
