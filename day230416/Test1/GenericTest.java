package day230416.Test1;

import org.junit.Test;

import java.util.*;

/**
 * @description:    泛型的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-16-17:40
 **/
public class GenericTest {

    //在集合中使用泛型之前的情况,以ArrayList举例：
    @Test
    public void test1(){
        ArrayList list = new ArrayList();
        //需求：存放学生的成绩
        list.add(78);
        list.add(76);
        list.add(89);
        list.add(12);
        //问题一：类型不安全
        //list.add("Tom");

        for(Object score:list){ //增强
            //问题二：强转时，可能出现ClassCastException:类转换异常
            int stuScore = (Integer)score;

            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：
    @Test
    public void test2(){
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(78);
        list.add(76);
        list.add(89);
        list.add(12);

        //方式一：
//        for(Integer score : list){
//            //避免了强转操作
//            int stuScore = score;
//
//            System.out.println(stuScore);
//        }

        //方式二：
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
            int stuScore = iterator.next();
            System.out.println(stuScore);
        }
    }

    //在集合中使用泛型的情况：以HashMap为例
    @Test
    public void test3(){
        Map<String,Integer> map=new HashMap<String,Integer>();

        map.put("Tom",56);
        map.put("Jane",56);
        map.put("Smith",34);
        //map.put(23,"Jenny");

        //泛型的嵌套
        Set<Map.Entry<String,Integer>> entry = map.entrySet();
        Iterator<Map.Entry<String,Integer>> iterator=entry.iterator();

        while(iterator.hasNext()){
            Map.Entry<String,Integer> e = iterator.next();
            String key=e.getKey();
            Integer value=e.getValue();
            System.out.println(key+"----"+value);
        }
    }
}
