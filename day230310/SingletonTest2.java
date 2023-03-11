package day230310;

/**
 * @description:    单例设计模式：懒汉式
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/10 11:21
 */
public class SingletonTest2 {

}

class Order{

    //1,私有化类的构造器
    private Order(){

    }

    //2.声明当前类的对象，没有初始化
    //4.此对象也必须声明为static的
    private static Order instance=null; //未初始化

    //3.声明public，static的返回当前类对象的方法
    public static Order getInstance(){
        if(instance==null){     //只创建一个类的对象
            instance=new Order();
        }
        return instance;
    }
}