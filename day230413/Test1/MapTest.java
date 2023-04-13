package day230413.Test1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @description:
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-13-22:19
 **/
public class MapTest {

    //HashMap和Hashtable的区别
    @Test
    public void test1(){
        Map map = new HashMap();
        //map=new Hashtable();  //NullPointerException
        map.put(null, 123);
        System.out.println(map);
    }

    //LinkedHashMap可按添加顺序实现遍历
    @Test
    public void test2(){
        Map map = new HashMap();
        map = new LinkedHashMap();
        map.put(123,"AA");
        map.put(456,"BB");
        map.put(789,"CC");

        System.out.println(map);
    }

    //添加，修改，删除操作：
    @Test
    public void test3(){
        Map map=new HashMap();
        //添加
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //修改
        map.put("AA",87);

        System.out.println(map);    //{AA=87, BB=56, 45=123}:“=”不是赋值的意思，只是用来区分key和value

        Map map1=new HashMap();
        map1.put("CC",123);
        map1.put("DD",123);
        //将map1中所有key-value对存放到当前map中
        map.putAll(map1);

        System.out.println(map);

        //remove(Object key)
        Object value = map.remove("CC");
        System.out.println(value);
        System.out.println(map);

        //clear()
        map.clear();    //与map=null操作不同,不会报空指针异常
        System.out.println(map.size()); //0
        System.out.println(map);
    }

    @Test
    public void test4(){
        Map map=new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);

        //Object get(Object key):获取指定key对应的value
        System.out.println(map.get(45));

        //containsKey(Object key) : 是否包含指定的key
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        //containsValue(Object value) : 是否包含指定的value
        isExist=map.containsValue(123);
        System.out.println(isExist);

        //int size():返回map中key-value对的个数
        int size=map.size();
        System.out.println(size);
    }

}
