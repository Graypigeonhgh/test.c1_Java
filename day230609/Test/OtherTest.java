package day230609.Test;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * @description:    获取构造器的结构,获取运行时类的接口，所在包，注解
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-06-09-17:38
 **/
public class OtherTest {
    @Test
    //获取构造器的结构
    public void test1(){
        Class clazz = Person.class;

        //getConstructors():获取当前运行时类声明为public的构造器
        Constructor[] constructors = clazz.getConstructors();
        for(Constructor c : constructors){
            System.out.println(c);
        }
        System.out.println("-------------------------------------");

        //getDeclaredConstructors():获取当前 运行时类中声明的所有的构造器
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for(Constructor c : declaredConstructors){
            System.out.println(c);
        }
    }

    @Test
    //获取运行时类的父类
    public void test2(){
        Class clazz = Person.class;
        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    @Test
    //获取运行时类的带泛型的父类
    public void test3(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    @Test
    //获取运行时类的带泛型的父类的泛型
    public void test4(){
        Class clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paramType = (ParameterizedType)genericSuperclass; //ParameterizedType:带参数的类型
        //获取泛型类型
        Type[] actualTypeArguments = paramType.getActualTypeArguments();

        System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

    @Test
    //获取运行时类实现的接口
    public void test5(){
        Class clazz = Person.class;

        Class[] interfaces = clazz.getInterfaces();
        for(Class c : interfaces){
            System.out.println(c);
        }

        System.out.println();
        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getInterfaces();
        for(Class c : interfaces1){
            System.out.println(c);
        }
    }

    @Test
    //获取运行时类所在的包
    public void test7(){
        Class clazz = Person.class;

        Package pack = clazz.getPackage();
        System.out.println(pack);
    }

    @Test
    //获取运行时类声明的注解
    public void test8(){
        Class clazz = Person.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation annos : annotations){
            System.out.println(annos);
        }
    }
}
