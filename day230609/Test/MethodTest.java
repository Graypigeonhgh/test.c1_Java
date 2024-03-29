package day230609.Test;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @description: 获取运行时类的方法的内部结构
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-06-09-11:44
 **/
public class MethodTest {

    @Test
    public void test1(){
        //调用运行时类的属性： .class
        Class clazz = Person.class;

        //getMethods():获取当前运行时类及其所有父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
        System.out.println("-----------------------------------------------------------");

        //getDeclaredMethods():获取当前运行时类中声明的所有方法（不包含父类声明的方法）。
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }

    @Test
    public void test2(){
        Class clazz = Person.class;
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for(Method m : declaredMethods){
            //1.获取方法的声明注解
            Annotation[] annos = clazz.getAnnotations();
            for(Annotation a : annos){
                System.out.println(a);
            }

            //2.获取权限修饰符
            System.out.print(Modifier.toString(m.getModifiers()) + "\t");

            //3.返回值类型
            System.out.print(m.getReturnType() + "\t");

            //4.方法名
            System.out.print(m.getName());
            System.out.print("(");

            //5.形参列表
            Class[] parameterTypes = m.getParameterTypes();
            if(!(parameterTypes == null && parameterTypes.length ==0)){
                for(int i = 0;i<parameterTypes.length;i++){
                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + "args_" + i);
                        break;
                    }

                    System.out.print(parameterTypes[i].getName() + "args_" + ",");
                }
            }

            System.out.print(")");

            //6.抛出的异常
            Class[] exceptionTypes = m.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                System.out.print("throws");
                for(int i = 0;i<exceptionTypes.length;i++){
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");

                }
            }
            System.out.println();
        }

    }

}
