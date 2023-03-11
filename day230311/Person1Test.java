package day230311;
/**
 * @description:    抽象类的匿名子类
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/11 20:49
 */

public class Person1Test {
    public static void main(String[] args) {

        method(new Student());  //匿名对象

        Worker worker=new Worker();
        method1(worker);    //非匿名的类非匿名的对象（平时的操作）

        method1(new Worker());//非匿名的类匿名的对象（Work类已定义）

        System.out.println("**********************");

        //创建了一匿名子类对象：p
        Person1 p=new Person1(){    //p实际上是person类的子类，只是用父类替代的
            @Override
            public void eat() {
                System.out.println("吃东西");
            }

            @Override
            public void breath() {
                System.out.println("呼吸空气");
            }
        };

        method1(p);
        System.out.println("*********************");

        method1(new Person1() {
            @Override
            public void eat() {
                System.out.println("吃好吃的东西");
            }

            @Override
            public void breath() {
                System.out.println("好好呼吸新鲜空气");
            }
        });
    }

    public static void method(Student s){

    }

    public static void method1(Person1 p){
        p.eat();
        p.breath();
    }
}

class Worker extends Person1{
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void breath() {
        System.out.println("呼吸空气");
    }
}