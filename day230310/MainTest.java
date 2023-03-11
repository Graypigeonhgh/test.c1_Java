package day230310;

import sun.applet.Main;

public class MainTest {
    public static void main(String[] args){
        Main.main(new String[100]);

        MainTest test=new MainTest();   //静态方法中，只能通过对象调用非静态方法
        test.show();
    }

    public void show(){

    }
}

class Maon{
    public static void main(String[] args){

        for(int i=0;i<args.length;i++){
            args[i]="args_"+i;
            System.out.println(args[i]);
        }
    }
}
