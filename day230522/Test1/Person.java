package day230522.Test1;

import java.io.Serializable;

/**
 * @description:    Person需要满足如下要求，方可序列化
 *1.需要实现接口：serializable (标识接口)
 *2.需要当前类提供一个全局常量：serialVersionUID;(自定义异常类)
 *3.除了当前Person类需要实现Serializable接口之外，还必须保证其
 *  内部所有属性也必须是可序列化的。(默认情况下，基本数据类型可序列化)
 *4.补充: ObjectOutputStream和objectInputStream不能序列化static，transient修饰的成员变量
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-22-18:10
 **/
public class Person  implements Serializable {

    public static final long serialVersionUID = 42L;    //一个表示序列化版本标识符的静态变量

    private String name;
    private int age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
}
