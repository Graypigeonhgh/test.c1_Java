package day230215;

//this的使用：可用来修饰 构造器，属性，方法
public class Person1 {
	public static void main(String[] args) {
		PersonTest1 p1=new PersonTest1();
		
		p1.setAge(10);
		System.out.println("年龄为："+p1.getAge());
		
		PersonTest1 p2=new PersonTest1("Tonny",20);
		System.out.println("年龄为："+p2.getAge());
		
		p1.eat();
	}
}


class PersonTest1{
	private String name;
	private int age;
	
	public PersonTest1() {
		this.eat();	//调用方法
	}
	
	
	public PersonTest1(int age) {
		this();	//调用空参构造器
		this.age = age;
	}

	public PersonTest1(String name) {
		this();
		this.name = name;
	}

	public PersonTest1(String name,int age) {
		this(age);
		this.name=name;
		//this.age=age;
	}
	
	public void setName(String name) {	//属性与形参相同时，须使用“this.属性”的方式区别
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	public void eat() {
		System.out.println("吃饭");
		this.drink();	//此处的“this.”可省略
	}
	public void drink() {
		System.out.println("喝水");
	}
}
	




