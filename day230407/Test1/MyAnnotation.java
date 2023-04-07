package day230407.Test1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @description:    自定义注解，如果
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-07-19:55
 **/

@Inherited  //被它修饰的Annotation具有继承性
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)     //  指明生命周期
@Target({TYPE,FIELD,METHOD,PARAMETER,CONSTRUCTOR,LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})   //指定被修饰的Annotation能用于修饰哪些程序元素
public @interface MyAnnotation {    //@interface与接口无关

   //方式一： String value();
    //方式二：指定成员的默认值，用default
    String value() default "hello";
}
