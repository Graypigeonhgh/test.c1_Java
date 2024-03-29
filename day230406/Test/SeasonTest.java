package day230406.Test;

/**
 * @description:    自定义枚举类
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-06-21:55
 **/
public class SeasonTest {
    public static void main(String[] args) {
        Season spring=Season.SPRING;
        System.out.println(spring);

        Season summer=Season.SUMMER;
        System.out.println(summer);

        Season autumn=Season.AUTUMN;
        System.out.println(autumn);

        Season winter=Season.WINTER;
        System.out.println(winter);

    }
}

class Season{
    //1.声明Season对象的属性：private final修饰
    private final String seasonName;
    private final String seasonDesc;

    //2.私有化类的构造器，并给对象属性赋值
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }

    //3.提供当前枚举类的多个对象：public static final的
    public static final Season SPRING=new Season("春天","春暖花开");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","秋高气爽");
    public static final Season WINTER=new Season("冬天","冰天雪地");

    //4.其他诉求1：提供get()
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

    //4.其他诉求：提供toString()

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}
