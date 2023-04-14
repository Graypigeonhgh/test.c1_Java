package day230414.Test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @description:    Collections工具类的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-14-21:35
 **/
public class CollectionsTest {

    @Test
    public void test1(){
        List list=new ArrayList();
        list.add(123);
        list.add(123);
        list.add(456);
        list.add(853);
        list.add(-35);

        System.out.println(list);
        //反转List中元素的顺序
//        Collections.reverse(list);

        //shuffle(List):对List集合元素进行随机排序
//        Collections.shuffle(list);

        //sort(List):将List中的元素按升序排列
//        Collections.sort(list);

        //swap(List, , ):将List集合中的元素i和j交换次序
        Collections.swap(list,1,3);

        int frequency=Collections.frequency(list,123);

        System.out.println(list);
        System.out.println(frequency);
    }

    @Test
    public void test2(){
        List list=new ArrayList();
        list.add(123);
        list.add(456);
        list.add(853);
        list.add(-35);

        //void copy(List dest,List src):将src的内容复制到dest中
        //报异常：IndexOutOfBoundsException: Source does not fit in dest
        //List dest=new ArrayList();
        // Collections.copy(dest,list);

        List dest= Arrays.asList(new Object[list.size()]);
        System.out.println(dest.size());    //list.size()
        Collections.copy(dest,list);
        System.out.println("dest:"+dest);

    }
}
