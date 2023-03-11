package day230311;

/**
 * @description:    抽象类和方法的使用
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/11 19:43
 */
public class AbsractTest {
    public static void main(String[] args) {
        //一旦person类抽象了，就不可实例化
        //Person p1=new Person();
        //p1.eat();
    }
}

abstract class Creature{
    public abstract void breath();
}

abstract class Person1 extends Creature{
    String name;
    int age;

    public Person1(){

    }
    public Person1(String name,int age){
        this.name=name;
        this.age=age;
    }

    public abstract void eat();    //抽象方法只有方法的声明，没有方法体

    public void walk(){
        System.out.println("人走路");
    }

}

class Student extends Person1{   //子类调用父类的抽象方法，要么重写所有抽象方法
                                // （包括直接的和间接的抽象方法），要么抽象子类
    public Student(){

    }
    public Student(String name,int age){
        super(name,age);
    }

    @Override
    public void eat() {
        System.out.println("学生应该多吃有营养的东西");
    }

    @Override
    public void breath() {
        System.out.println("人应该多呼吸新鲜空气");
    }
}

