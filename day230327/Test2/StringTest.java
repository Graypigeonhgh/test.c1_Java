package day230327.Test2;

import org.junit.Test;

/**
 * @description:    String类的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-27-21:39
 **/
public class StringTest {

    @Test
    public void test2(){
        //只要其中有一个变量，结果就是在堆中
        String s1="helloworld";
        String s2="hello";
        String s3="world";

        String s4="hello"+"world";
        String s5="hello"+s3;
        String s6=s2+"world";

        System.out.println(s1==s4);//true
        System.out.println(s1==s5);//false
        System.out.println(s1==s6);//false
        System.out.println(s4==s5);//false
        System.out.println(s4==s6);//false
        System.out.println(s5==s6);//false

        String s7=(s2+s3).intern(); //返回值在常量池中找
        System.out.println(s1==s7);//true
    }

    @Test
    public void test1(){
        //通过字面量定义的方式：此时的s1和s2的数据声明在方法区中的字符串常量池中。
        String s1 = "javaEE";
        String s2 = "javaEE";

        //通过new+构造器的方式：此时的s3和s4保存的地址值，是数据在堆空间中开辟空间以后对应的地址值
        String s3=new String("javaEE");
        String s4=new String("javaEE");

        System.out.println(s1==s2);//true
        System.out.println(s1==s3);//false
        System.out.println(s1==s4);//false
        System.out.println(s3==s4);//false

        System.out.println("*********************");
        //p1,p2在堆空间中分别开辟两个空间，但都指向常量池里的同一个地址值（存放Tom的地址）
        Person p1=new Person("Tom",12);
        Person p2=new Person("Tom",12);

        System.out.println(p1.name.equals(p2.name));//true
        System.out.println(p1.name== p2.name);      //true

    }


}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}