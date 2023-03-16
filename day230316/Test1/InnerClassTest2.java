package day230316.Test1;

public class InnerClassTest2 {
    public void onCreate(){

    }

    /*在局部内部类的方法中（比如：show），如果调用局部内部类所声明的方法（比如：method）中的局部变量
      要求此局部变量声明为final的。
      jdk8以后的版本：可以省略final的声明
    */
    public void method(){
        //局部变量
        int num=10;     //省略了final，num为常量，只能调用，不能赋值

        class AA{

            public void show(){
                //num=20;   //报错
                System.out.println(num);
            }
        }

    }

}
