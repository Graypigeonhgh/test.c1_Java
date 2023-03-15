package day230315.Test3;
/**
 * @description:    内部类的使用
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/15 21:33
 */

public class InnerClssTest {
    public static void main(String[] args) {

        //创建Dog实例（静态的成员内部类）
        Person.Dog dog=new Person.Dog() ;
        dog.show();
        //创建Bird实例（非静态的成员内部类）
//        Person.Bird bird=new Person.Bird();//错误的
        Person p=new Person();
        Person.Bird bird=p.new Bird();
        bird.sing();

        System.out.println("*************");
        bird.display("杜鹃");

    }

}

class Person{

    String name="Tom";
    int age;

    public void eat(){
        System.out.println("吃饭");
    }

    //静态成员内部类
    static class Dog{
        String name="旺财";
        int age;
        public void show(){
            System.out.println("我是一条单身狗");
//            eat();    //静态类不能直接调用非静态方法
        }
    }
    //非静态成员内部类
    final class Bird{
        String name="鹦鹉";
        public Bird(){  //构造器
        }

        public void sing(){
            System.out.println("我是一只小小鸟");
            Person.this.eat();  //调用外部类的非静态属性
            eat();              //没有同名方法时可使用
            System.out.println(age);
        }

        public void display(String neme){
            System.out.println(name);   //方法的属性
            System.out.println(this.name);  //内部类的属性
            System.out.println(Person.this.name);   //外部类的属性
        }

    }

    public void method(){
        //局部内部类
        class AA{

        }

        {   //代码块

        }
        class BB{

        }

    }
    public Person() {
        class CC {

        }
    }

}