package day230406.Test;

/**
 * @description:    使用enum关键字定义枚举类
 * 说明：定义的枚举类默认调用 java.lang.Enum类
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-06-22:10
 **/
public class SeasonTest1 {
    public static void main(String[] args) {

        Season1 spring=Season1.SPRING;
        //toString()：返回当前枚举类对象常量的名称
        System.out.println(spring.toString());

        System.out.println("*******************");
        //values():返回枚举类的对象数组
        Season1[] values=Season1.values();
        for(int i=0;i<values.length;i++){
            System.out.println(values[i]);
            values[i].show();
         }

//        Season1 summer=Season1.SUMMER;
//        System.out.println(summer);
//
//        Season1 autumn=Season1.AUTUMN;
//        System.out.println(autumn);
//
//        Season1 winter=Season1.WINTER;
//        System.out.println(winter);
        System.out.println("******************");
        //输出线程状态：
        Thread.State[] values1=Thread.State.values();
        for(int i=0;i<values1.length;i++){
            System.out.println(values1[i]);
        }

        //valueOf(String objName):返回枚举类中对象名是objName的对象
        Season1 winter=Season1.valueOf("WINTER");
        System.out.println(winter);

    }
}

//接口
interface Info{
    void show();    //省略了pulbic abstract
}

enum Season1 implements Info{
    //1.提供当前枚举类的对象，多个对象之间用 “，” 隔开，末尾用 “；” 结束
    SPRING("春天","春暖花开"){
        @Override
        public void show(){
            System.out.println("春");
        }
    },
    SUMMER("夏天","夏日炎炎"){
        @Override
        public void show(){
            System.out.println("夏");
        }
    },
    AUTUMN("秋天","秋高气爽"){
        @Override
        public void show(){
            System.out.println("秋");
        }
    },
    WINTER("冬天","冰天雪地"){
        @Override
        public void show(){
            System.out.println("冬");
        }
    };

    //1.声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器，并给对象属性赋值
    private Season1(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //4.其他诉求1：提供get()
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.其他诉求：提供toString()
    //不重写toString时，调用的是java.lang.Enum类的toString方法。

//    @Override
//    public String toString() {
//        return "Season1{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }

//    @Override
//    public void show(){
//        System.out.println("这是一个季节");
//    }
}

