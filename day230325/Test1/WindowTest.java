package day230325.Test1;

/**
 * @description:    创建三个窗口卖票，总票数为100张（仍存在线程安全问题待解决）
 *                  方法一：使用继承Thread类的方式
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-25-13:34
 **/

class Window extends Thread{
    private static int ticket=100;  //静态属性，三个对象同时调用该属性

    @Override
    public void run(){
        while(true){
            if(ticket>0){
                System.out.println(getName()+":卖票，票号为："+ticket);
                ticket--;
            }else{
                break;
            }

        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1=new Window();
        Window w2=new Window();
        Window w3=new Window();

        w1.setName("窗口1");
        w2.setName("窗口2");
        w3.setName("窗口3");

        w1.start();
        w2.start();
        w3.start();
    }
}
