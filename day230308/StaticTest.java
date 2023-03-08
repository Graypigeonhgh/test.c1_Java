package day230308;

public class StaticTest {
    public static void main(String[] args){

        Chinese.nation="中国";  // 静态变量（类变量）随着类的加载而加载。可以通过“类.静态变量”的方式进行调用

        Chinese c1=new Chinese();
        c1.name="姚明";
        c1.age=40;
        c1.nation="CHINA";

        Chinese c2=new Chinese();
        c2.name="马龙";
        c2.age=35;
        c2.nation="china";

        //System.out.println(c2.nation);  //（c2未赋值），多个对象共享同一个静态变量。
        System.out.println(c1.nation);  //当通过某一个对象修改静态变量时，会导致其他对象调用此静态变量是修改过的

        c1.eat();
        Chinese.show();
        c1.show();
    }


}

//中国人
class Chinese{
    String name;
    int age;

    static String nation;   //静态变量

    public void eat(){
        System.out.println("中国人吃中餐");
        //调用非静态结构
        this.drink();
        //调用静态结构
        walk();
        System.out.println("nation:"+nation);   //静态变量nation前省略了Chinese.
    }
    public static void show(){
        System.out.println("我是中国人");
        //eat();省略了this.    静态方法里不能调用this，super
    }

    public static void walk(){
        System.out.println("人走路");
    }

    public void drink(){
        System.out.println("人喝水");
    }
}
