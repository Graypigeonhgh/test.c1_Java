package day230527.Test1;

import org.junit.Test;

/**
 * @description:    获取Class的实例的方式
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-27-11:30
 **/
public class ReflectionTest {

    //反射之前，对于Person的操作
    //在Person类的外部，不可以通过Person类的对象调用其内部的私有结构
    @Test
    public void test1(){
        //1.创建Person类的对象（Person的实例化）
        Person p1 = new Person(12,"Tom");

        //2.通过对象，调用其内部的属性和方法
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();
    }

    //获取Class的实例的方式
    @Test
    public void test2() throws ClassNotFoundException {
        //方式一：调用运行时类的属性： .class
        Class clazz1 = Person.class;
        System.out.println(clazz1);
        //方式二：通过运行时类的对象，调用getClass()
        Person p1 = new Person();
        Class clazz2 = p1.getClass();
        System.out.println(clazz2);

        //方式三(使用较多)：调用Class的静态方法：forName(String classPath)
        Class clazz3 = Class.forName("day230527.Test1.Person"); //更能体现反射的动态性
        System.out.println(clazz3);

        //方式四(了解)：使用类的加载器：ClassLoader。通过加载器类的对象，调用loadClass()
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("day230527.Test1.Person");
        System.out.println(clazz4);

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz1 == clazz3);
        System.out.println(clazz2 == clazz4);
        //上述四种方法调用的是唯一的运行时类。说明：加载到内存中的运行时类，会缓存一定的时间。
        // 在此时间之内，我们可以通过不同的方式来获取此运行时类。

    }
}
