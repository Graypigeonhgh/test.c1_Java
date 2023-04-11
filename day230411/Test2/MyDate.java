package day230411.Test2;

/**
 * @description:    MyDate类包含：private成员变量year，month，day； 并为每一个属性定义getter，setter方法。
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-11-22:34
 **/
public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}
