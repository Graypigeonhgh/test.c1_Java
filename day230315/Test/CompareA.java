package day230315.Test;

//JDK8:除了定义全局常量和抽象方法之外，还可以定义静态方法，默认方法

public interface CompareA {

    //静态方法
    public static void method1(){
        System.out.println("CompareA:北京");
    }

    //默认方法
    public default void method2(){
        System.out.println("CompareA:上海");
    }

    default void method3(){     //默认是public类型，public可省略
        System.out.println("CompareA:上海");
    }

}
