package day230326.Test2;

/**
 * @description:    使用同步机制将单例模式中的懒汉式改写成线程安全的
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-26-14:34
 **/
public class BankTest {
}

class Bank{

    private Bank(){}

    private static Bank instance=null;

    public static synchronized Bank getInstance(){  //同步监视器为Bank类本身
        //方式一：效率较差
        //synchronized (Bank.class){
//        if(instance==null){
//            instance=new Bank();
//        }
//
//        return instance;

        //方式二：效率更高
        if(instance==null){

            synchronized(Bank.class){
                if(instance==null){
                    instance=new Bank();
                }
            }
        }

        return instance;
    }
}