package day230409.Test1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:    关于List接口的练习:
 *                  区分List中remove（int index）和remove（Object obj）
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-09-11:10
 **/
public class ListExer {

    @Test
    public void test(){
        List list=new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        updateList(list);
        System.out.println(list);
    }

    private void updateList(List list){
        //list.remove(2); //2指的是索引
        list.remove(new Integer(2));    //2指的是创造的对象
    }
}
