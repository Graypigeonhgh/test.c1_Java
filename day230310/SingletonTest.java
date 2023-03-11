package day230310;
/**
 * @description:    单例设计模式：饿汉式  （所谓单例设计模式，就是采取一定的方法保证在整个的
 *                  软件系统中，对某个类只能存在一个对象实例
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:  
 * @time:    2023/3/10 10:54
 */

public class SingletonTest {
    public static void main(String[] args){

        Bank bank1=Bank.getInstance();  //私有化的对象只能通过方法调用，而静态的方法只能通过类来调用
        Bank bank2=Bank.getInstance();

        System.out.println(bank1==bank2);
    }
}

class Bank{

    //1.私有化类的构造器
    private Bank(){

    }

    //2.类内部创建类的对象
    //4.要求此对象也必须声明为静态的
    private static Bank instance=new Bank();

    //3.提供公共的静态的方法，返回类的对象
    public static Bank getInstance(){
        return instance;    //静态的方法只能调用静态的对象和属性
    }
}