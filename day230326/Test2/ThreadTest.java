package day230326.Test2;

/**
 * @description:    死锁问题
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-14:59
 **/

public class ThreadTest {
    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();

        new Thread(){
            @Override
            public void run(){

                synchronized(s1){
                    s1.append("a");
                    s2.append("1");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(s2){       //同步监视器的嵌套
                        s1.append("b");
                        s2.append("2");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }.start();

        new Thread(new Runnable() {     //runnable实现类的匿名对象
            @Override
            public void run() {
                synchronized(s2){
                    s1.append("c");
                    s2.append("3");

                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized(s1){
                        s1.append("d");
                        s2.append("4");

                        System.out.println(s1);
                        System.out.println(s2);
                    }
                }
            }
        }).start();
    }

}
