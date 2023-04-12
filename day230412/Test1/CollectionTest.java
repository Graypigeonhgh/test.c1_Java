package day230412.Test1;

import org.junit.Test;

import java.util.HashSet;

/**
 * @description:    set接口的练习
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-12-11:19
 **/
public class CollectionTest {

    @Test
    public void test3(){
        HashSet set=new HashSet();
        Person p1=new Person(1001,"AA");
        Person p2=new Person(1002,"BB");

        set.add(p1);
        set.add(p2);
        System.out.println(set);
        //[Person{id=1002, name='BB'}, Person{id=1001, name='AA'}]

        p1.name = "CC";
        set.remove(p1);     //“1001，AA”通过哈希值对应的地址是p1的地址；而“1001，CC”通过哈希值对应的地址是另一个空地址，
                            //所有“1001，CC”并没有被remove
        System.out.println(set);


        set.add(new Person(1001,"CC"));
        System.out.println(set);    //“1001，CC”对应的地址仍为空，可以存放，添加成功

        set.add(new Person(1001,"AA"));
        System.out.println(set);    //“1001，AA”对应的的地址为P1所在的地址，里面已经存放了“1001，CC”，
                                    // 哈希值相同，equals（）比较的值不同，所以添加成功

    }
}
