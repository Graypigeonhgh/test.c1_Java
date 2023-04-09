package day230409.Test2;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:    Set的无序性与不可重复性的理解
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-09-15:42
 **/
public class SetTest {

    @Test
    public void test1(){
        Set set=new HashSet();
        set.add(456);
        set.add(123);
        set.add("AA");
        set.add("BB");
        set.add(new User("Tom",20));
        set.add(new User("Tom",20));
        set.add(129);

        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
