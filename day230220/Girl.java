package day230220;

public class Girl {
	private String name;
	private int age;
	
	public Girl(String name,int age) {
		this.name=name;
		this.age=age;
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
	
	public void marry(Boy boy) {
		System.out.println("我想嫁给："+boy.getName());
		boy.marry(this);	//this是指调用marry方法的对象（girl）
		//或者boy.marry(new Girl())	重新new一个girl
	}
	
	public int compare(Girl girl) {
//		if(this.age>girl.age) {
//			return 1;
//		}else if(this.age<girl.age) {
//			return -1;
//		}else {
//			return 0;
//		}
		
		return this.age-girl.age;
	}
	
}



