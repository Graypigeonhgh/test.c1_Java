package day230609.Test;

/**
 * @description:    Person类
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-27-11:30
 **/
public class Person {
    public int age;
    private String name;

    public Person() {
        System.out.println("Person()");
    }

    @MyAnnotation(value = "abc")
    private Person(String name) {
        this.name = name;
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("我是一个人");
    }

    @MyAnnotation
    private String showNation(String nation) throws NullPointerException,ClassCastException{
        System.out.println("我的国籍是："+nation);
        return nation;
    }
}
