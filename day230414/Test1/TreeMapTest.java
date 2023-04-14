package day230414.Test1;

import org.junit.Test;

import java.util.*;

/**
 * @description:    向TreeSet中添加key-value,要求key必须是由同一个类创建的对象
 * 因为要按照key进行排序：自然排序，定制排序
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-14-20:04
 **/
public class TreeMapTest {

    //自然排序
    @Test
    public void test(){
        TreeMap map = new TreeMap();
        User u1=new User("Tom",23);
        User u2=new User("Jerry",43);
        User u3=new User("Jack",23);
        User u4=new User("Ben",77);
        User u5=new User("Rose",63);

        map.put(u1,98);
        map.put(u2,23);
        map.put(u3,49);
        map.put(u4,77);

        Set entrySet=map.entrySet();
        Iterator iterator=entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj=iterator.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }

    }

    //定制排序
    @Test
    public void test2(){
        TreeMap map=new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1=(User) o1;
                    User u2=(User) o2;
                    return Integer.compare(u1.getAge(),u2.getAge());
                }
                throw new RuntimeException("输入的类型不匹配");
            }
        });
        User u1=new User("Tom",23);
        User u2=new User("Jerry",43);
        User u3=new User("Jack",23);
        User u4=new User("Ben",77);
        User u5=new User("Rose",63);

        map.put(u1,98);
        map.put(u2,23);
        map.put(u3,49);
        map.put(u4,77);

        Set entrySet=map.entrySet();
        Iterator iterator=entrySet.iterator();
        while (iterator.hasNext()) {
            Object obj=iterator.next();
            Map.Entry entry=(Map.Entry)obj;
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }

}
