package day230222.exer;

public class Student extends Person{	//Person为子类
	
//	String name;
//	int age;
	String major;
	int id=1002;	//属性不能被重写，所以有两个属性id
	boolean isSmoking;
	
	public Student() {
		
	}
	public Student(String name,int age,String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
//	public void eat() {
//		System.out.println("吃饭");
//	}
//	public void sleep() {
//		System.out.println("睡觉");
//	}
	
	public void study() {
		System.out.println("学习");
	}
	
//	public void gender() {
//		System.out.println("男");
//	}
	
	//对父类的方法进行覆盖重写操作
	public void eat() {
		System.out.println("学生除了吃饭还需要学习");
	}
	
	public void show() {
		System.out.println("name="+this.name+",age="+super.age);//this和super可省略
		System.out.println("id="+this.id);  //子父类中出现同名属性，调用属性时this和super不能省略
		System.out.println("id="+super.id);	//super指“父类的”
	}
	
}












