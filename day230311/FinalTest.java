package day230311;
/**
 * @description:    final关键字的使用：修饰类，方法，属性和局部变量
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/11 15:47
 */
public class FinalTest {
    //final修饰属性（常量为大写）
    final int WIDTH=0;  //显示初始化
    final int LEFT;     //代码块中初始化
    final int RIGHT;    //构造器中赋值

    {
        LEFT=1;
    }

    public FinalTest(){
        RIGHT=2;
    }
    public FinalTest(int n){
        RIGHT=n;
    }

    //final修饰形参
    public void eat(final int num){
        //num=20;               //形参num被final修饰，在方法内不能进行重新赋值
        System.out.println(num);//只能在方法中调用此形参
    }

}
