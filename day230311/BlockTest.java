package day230311;

import java.nio.file.FileSystemNotFoundException;
/**
 * @description:    类中代码块的使用
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:  
 * @time:    2023/3/11 15:46
 */
public class BlockTest {
    public static void main(String[] args) {
        String desc=Person.desc;

        Person p1=new Person();
        Person p2=new Person();

        System.out.println(p1.age);

       // Person.info();
    }

}

class Person{
    //属性
    String name;
    int age;
    static String desc="我是一个人";

    //构造器
    public Person(){

    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    //static的代码块
    static{     //随着类的加载而执行，而且只执行一次
        System.out.println("hello,static block2");
        desc="我是一个学生";//作用：初始化类的信息
    }
    static {
        System.out.println("hello,static block1");
    }

    {       //每创建一个对象，就执行一次非静态代码块
        System.out.println("hello,block");
        age=1;  //作用：可以在创建对象时，对对象的属性进行初始化
    }

    //方法
    public void eat(){
        System.out.println("吃饭");
    }

    @Override
    public String toString(){
        return "Person[name="+name+",age="+age+"]";
    }
}