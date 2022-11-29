package day221129;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月29日上午10:46:10
 *
 */

public class UserTest1 {
	public static void main(String[] args) {
		//2.创建person类的对象
		Person1 p1=new Person1();
		
		//3.调用对象的结构：属性，方法
		//调用属性：“对象.属性”
		p1.name="Tom";
		p1.isMale=true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat("面条");						//局部变量的赋值不可修改
		p1.sleep();
		
	}

}
//1.创建person类，设计类的成员（包括属性和方法）
class Person1{
	//属性（成员变量），格式：数据类型 变量名=变量值
	String name;							//成员变量都有对应的默认初始化值（由其返回值类型决定）
	int age=1;
	boolean isMale;							//权限修饰符为缺省
	//属性的权限修饰符有public，private，缺省，protected
	public int weight=50;
	//方法
	public void eat(String food) {			//在方法括号（）的为形参，无默认初始化值，但可以不赋值
		food="烙饼";							//局部变量（在方法内等）无默认初始化值，必须要显式赋值（但是不可修改）
		System.out.println("北方人吃"+food);
		
	}
	public void sleep() {					//无返回值类型的用void
		System.out.println("人晚上会睡觉");	//方法体（方法内的代码）
	}
}









