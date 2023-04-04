package day230402.Test1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @description:    Comparable接口的使用举例：自然排序
 *                  Comparator接口的使用：   定制排序
 * 1.像String,包装类等实现了Comapable接口，重写了compareTo（）方法，给出了比较两个对象大小方式
 * 2.像String,包装类重写CompareTo方法以后，进行了从小到大的排列
 * 3.对于自定义类来说，如果需要排序，我们可以让自定义类实现comprable接口，重写compareTo（）接口
 * 在CompareTo（obj）方法中指明如何排序
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-02-13:15
 **/
public class CompareTest {
    @Test
    public void test1(){
        String[] arr=new String[]{"AA","BB","UU","MM","CC","ZZ","JJ"};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test2(){
        Goods[] arr=new Goods[5];
        arr[0]=new Goods("lenovoMouse",34);
        arr[1]=new Goods("dellMouse",60);
        arr[2]=new Goods("xiaomiMouse",46);
        arr[3]=new Goods("huaweiMouse",60);
        arr[4]=new Goods("microseftMouse",70);

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Comparator接口的使用：   定制排序
    @Test
    public void test3(){
        String[] arr=new String[]{"AA","ZZ","CC","MM","FF","BB"};
        //匿名对象
        Arrays.sort(arr,new Comparator(){
            //按照字符串从大到小的顺序排列
            @Override
            public int compare(Object o1,Object o2){
                if(o1 instanceof String&&o2 instanceof String){
                    String s1=(String)o1;
                    String s2=(String)o2;
                    return -s1.compareTo(s2);
                }
                //return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }

    @Test
    public void test4(){
        Goods[] arr=new Goods[5];
        arr[0]=new Goods("lenovoMouse",34);
        arr[1]=new Goods("dellMouse",60);
        arr[2]=new Goods("xiaomiMouse",46);
        arr[3]=new Goods("huaweiMouse",60);
        arr[4]=new Goods("microseftMouse",70);

        Arrays.sort(arr, new Comparator() {
            //指明商品比较大小的方式：按照产品名称从低到高排序，再按照价格从高到低排序
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Goods && o2 instanceof Goods) {
                    Goods g1=(Goods)o1;
                    Goods g2=(Goods)o2;
                    if(g1.getName().equals(g2.getName())){
                        return -Double.compare(g1.getPrice(),g2.getPrice());
                    }else{
                        return g1.getName().compareTo(g2.getName());
                    }
                }
                //return 0;
                throw new RuntimeException("输入的数据类型不一致");
            }
        });
        System.out.println(Arrays.toString(arr));
    }
}
