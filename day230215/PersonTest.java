package day230215;

public class PersonTest {
	public static void main(String[] args) {
		//创建类的对象：new + 构造器
		Person p1=new Person();	
	
		Person p2=new Person("小黄",20);	//初始化对象信息
//		p1.age=20; 编译不通过，只能通过setAge()和getAge()调用，体现Java的封装性

		System.out.println("姓名为："+p2.getName());
		System.out.println("年龄为："+p2.getAge());

		p2.setName("小明");
		p2.setAge(18);
		System.out.println("姓名为："+p2.getName());
		System.out.println("年龄为："+p2.getAge());
		
	}

}
