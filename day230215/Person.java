package day230215;

public class Person {
	private int age;	//属性私有化，只能在类内调用
	private String name;
	
	//构造器(以下构成重载)
	public Person() {	//默认存在
	}
	
	public Person(String n,int a) {
		name=n;
		age=a;
	}
	
	//设置属性
	public void setAge(int a) {
		if(a<0||a>130) {
			System.out.println("传入的数据非法！");
		}else {
			age = a;
		}
	}
	//获取属性
	public int getAge() {
		return age;
	}
	
	public void setName(String n) {
		name=n;
	}
	
	public String getName() {
		return name;
	}

}
