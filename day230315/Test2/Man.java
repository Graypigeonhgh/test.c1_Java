package day230315.Test2;
/**
 * @description:    接口的默认方法的应用
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/15 21:11
 */
public class Man{
    public static void main(String[] args) {
        Man1 man=new Man1();
        man.help();
    }
}

interface Filial{   //孝顺的
    default void help(){    //接口中定义的默认方法
        System.out.println("老妈，我来救你了");
    }
}

interface Spoony{   //痴情的
    default void help(){
        System.out.println("媳妇，别怕，我来了");
    }
}

class Father{
    public  void help(){
        System.out.println("儿子，救我媳妇");
    }
}

class Man1 extends Father implements  Filial,Spoony{
    @Override
    public void help() {
        System.out.println("我该救谁呢？");
        Filial.super.help();
        Spoony.super.help();
    }
}


