package day230222.exer;

public class Person {
	
	String name;
	int age;
	private String gender;
	int id=1001;//身份证号
	
	public Person() {
			
		}
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public void eat() {
		System.out.println("人吃饭");
	}
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void gender() {
		System.out.println("男");
	}
}
