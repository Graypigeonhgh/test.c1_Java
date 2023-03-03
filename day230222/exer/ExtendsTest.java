package day230222.exer;
/**
 * 
 *  @Description	面向对象之二：继承性;方法的重写
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2023年2月22日下午9:11:26
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		
		Person p1=new Person();
		p1.age=1;
		p1.eat();	
		p1.setGender("男");
		
		
		Student s1=new Student();
		s1.age=20;
		s1.eat();	//重写override
		s1.study();
		s1.setGender("女");	//因为封装性的影响，不能直接调用父类中的结构
		s1.getGender();
		s1.show();
		
		Person p2=new Student();//父类的引用指向子类的对象
		p2.eat();
		
		//p2是person类型，不能调用子类所特有的属性和方法
//		p2.isSmoking=true;
//		p2.study();
		
		//如何调用子类所特有的方法
		System.out.println("**********************");
		
		Student s2=(Student)p2;	//向下转型，使用强制类型转换符
		s2.isSmoking=true;
		s2.study();
		
		//使用强制类型转换符时，可能出现ClassCastEception异常
		/*
		 * System.out.println("**********************");
		 *  Worker w1=(Worker)p2;
		 * w1.workTime();
		 */		
		//为了避免使用强制类型转换符时出现ClassCastEception异常，可使用instanceof关键字
		// a instanceof A:判断对象a是否为类A的实例
		if(p2 instanceof Student) {
			Student s3=(Student)p2;
			s3.study();
			System.out.println("****Student****");
		}
		if(p2 instanceof Worker) {
			Worker w2=(Worker)p2;
			w2.workTime();
			System.out.println("****Worker*****");
		}
		
	}
}





