package day230417.Test1;

/**
 * @description:    定义一个Employee类（泛型）。
 * 该类包含: private成员变量name,age,birthday，
 * 其中 birthday 为 MyDate 类的对象;
 * 并为每一个属性定义 getter，setter 方法;
 * 并重写 tostring 方法输出 name，age，birthday
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-4-17 18:15:34
 **/
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    //指明泛型时的写法
    @Override
    public int compareTo(Employee o) {
        //不用考虑传入类型不一致的问题
        return this.name.compareTo(o.name);
    }
}
