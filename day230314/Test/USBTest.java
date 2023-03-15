package day230314.Test;
/**
 * @description:    接口的使用与匿名实现类
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/14 21:11
 */

public class USBTest {
    public static void main(String[] args) {
        Computer com=new Computer();
        //1.创建了接口的非匿名实现类（非匿名子类）的非匿名对象
        Flash flash=new Flash();
        com.transferData(flash);

        //2.创建了接口的非匿名实现类的匿名对象
        com.transferData(new Printer());

        //3.创建了接口的匿名实现类的非匿名对象
        USB phone=new USB() {   //用父类代替了子类创建非匿名对象（子类匿名）
            @Override
            public void start() {
                System.out.println("手机开启工作");
            }

            @Override
            public void stop() {
                System.out.println("手机结束工作");
            }
        };

        //4.创建了接口的匿名实现类的匿名对象
        com.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("mp3开启工作");
            }

            @Override
            public void stop() {
                System.out.println("mp3结束工作");
            }
        });


    }
}
class Computer{
    public void transferData(USB usb){  //多态：USB usb=new Flash();
        usb.start();

        System.out.println("具体传输数据的细节");

        usb.stop();
    }

}

interface USB{       //使用interface定义USB接口

    void start();    //抽象函数，省略了public abstract
    void stop();
}

class Flash implements USB{     //接口通过让类去“实现”（implement）的方式来使用

    public void start(){        //若实现类覆盖了接口中的所有抽象方法，则实现类就可以实例化
        System.out.println("U盘开启工作");
    }
    public void stop(){
        System.out.println("U盘结束工作");
    }
}
class Printer implements USB{   //接口通过让类去“实现”（implement）的方式来使用
    @Override
    public void start() {
        System.out.println("打印机开启工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
