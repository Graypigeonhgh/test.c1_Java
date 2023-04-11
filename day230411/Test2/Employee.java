package day230411.Test2;

/**
 * @description:    定义一个Employee类。
 * 该类包含: private成员变量name,age,birthday，
 * 其中 birthday 为 MyDate 类的对象;
 * 并为每一个属性定义 getter，setter 方法;
 * 并重写 tostring 方法输出 name，age，birthday
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-11-22:33
 **/
public class Employee implements Comparable{
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

    @Override
    public int compareTo(Object o) {
        if(o instanceof Employee){
            Employee e=(Employee) o;
            return this.name.compareTo(e.name);
        }
        //return 0;
        throw new RuntimeException("传入的数据类型不一致！");
    }
}
