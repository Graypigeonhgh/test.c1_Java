package day230314.Test;
/**
 * @description:      接口的使用
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/14 20:35
 */

public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MAX_SPEED);

        Plane plane=new Plane();
        plane.fly();

    }
}

interface Flyable{      //使用interface定义USB接口

    //全局常量
    public static final int MAX_SPEED=7900; //第一宇宙速度
    int MIN_SPEED=1;    //省略了public static final

    //抽象方法
    public abstract void fly();
    //省略了 public abstract
    void stop();

}

interface Attackable{
    void attack();
}

class Plane implements Flyable{     //接口通过让类去“实现”（implement）的方式来使用
    @Override
    public void fly(){
        System.out.println("通过引擎起飞");
    }

    @Override
    public void stop(){
        System.out.println("通过指挥员减速");
    }
}

abstract class Kite implements Flyable{     //未重写完抽象方法

    @Override
    public void fly(){

    }
}

class Bullect implements Flyable,Attackable{      //实现了多个接口
    @Override
    public void fly() {
        
    }

    @Override
    public void stop() {

    }

    @Override
    public void attack() {

    }
}

