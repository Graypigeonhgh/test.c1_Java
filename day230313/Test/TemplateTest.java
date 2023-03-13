package day230313.Test;
/**
 * @description:    模板方法的设计模式及应用场景
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/13 17:51
 */

public class TemplateTest {
    public static void main(String[] args) {
        SubTemplate t=new SubTemplate();
        t.spendTime();
    }

}

abstract class Template{

    //计算某段代码所需要花费的时间
    public void spendTime(){

        long start=System.currentTimeMillis();

        code();//不确定的部分，易变的部分

        long end =System.currentTimeMillis();
        System.out.println("花费的时间为："+(end-start));

    }
    public abstract void code();    //抽象函数（spendTime中的代码基本确定，只有部分代码如code的代码不确定
                                    //可抽象一下，用子类进行重写

}

class SubTemplate extends Template{

    @Override
    public void code() {
        for(int i=0;i<=1000;i++){
            boolean isFlag=true;
            for(int j=2;j<=Math.sqrt(i);j++){   //sqrt（）：平方
               if(i%j==0){
                   isFlag=false;
                   break;
               }
            }
            if(isFlag){
                System.out.println(i);
            }
        }
    }
}
