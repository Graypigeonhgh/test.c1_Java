package day230407.Test1;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @description:    注解的使用，常见的Annotation示例，JDK中4个基本的元注解的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-07-19:43
 **/
public class Annotation {
    public static void main(String[] args) {
        Person p=new Student();
        p.walk();

        @SuppressWarnings("unused")
        int num=10;
    }
    @Test
    public void test(){
        Class clazz=Student.class;
        java.lang.annotation.Annotation[] annotations=clazz.getAnnotations();
        for(int i=0;i<annotations.length;i++){
            System.out.println(annotations[i]);
        }

    }
}


@MyAnnotation(value="你好")
@MyAnnotation(value="hi")   //如果注解有成员，在使用注解时，需要指明成员的值。
class Person{
    private String name;
    private int age;

    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void walk(){
        System.out.println("人走路");
    }

    public void eat(){
        System.out.println("人吃饭");
    }
}

interface Info{
    void show();
}

class Student extends Person implements Info{
    //@Override
    public void walk() {
        System.out.println("学生走路");
    }

    @Override
    public void show() {

    }
}

class Generic<@MyAnnotation T>{
    public void show() throws @MyAnnotation RuntimeException{
        ArrayList<@MyAnnotation String> list=new ArrayList<>();
        int num=(@MyAnnotation int )10L;
    }
}