package day230411.Test1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @description:   Set的实现类：TreeSet的使用
 * 向TreeSet中添加的数据，要求是相同的对象
 * 两种排序方式：自然排序和定制排序
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-11-20:47
 **/
public class TreeSetTest {

    //方式一：自然排序
    @Test
    public void test1(){
        TreeSet set=new TreeSet();

        //例1：
//        set.add(123);
//        set.add(31);
//        set.add(-20);

        //set.add("AA");    //必须是相同类型的对象

        //例2：
        set.add(new User("Tom",12));
        set.add(new User("Jenny",32));
        set.add(new User("Brake",45));
        set.add(new User("Mike",17));
        set.add(new User("Jack",34));
        set.add(new User("Jack",59));

        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    //方式二：定制排序
    @Test
    public void test2(){
        Comparator com=new Comparator() {
            //按照年龄从小到大排序
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof User && o2 instanceof User){
                    User u1=(User)o1;
                    User u2=(User)o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }else{
                    throw new RuntimeException("输入的类型不匹配");
                }
            }
        };

        TreeSet set = new TreeSet(com);
        set.add(new User("Tom",12));
        set.add(new User("Jenny",32));
        set.add(new User("Brake",45));
        set.add(new User("Mike",17));
        set.add(new User("Jack",34));
        set.add(new User("Jack",59));

        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
