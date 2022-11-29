package day221129;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月29日下午9:23:45
 *
 *创建另一个class文件存放Person类
 */

public class Person {
	String name;
	int age;
	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	public void showAge() {
		System.out.println("age:"+age);
	}
	public int addAge(int i) {
		age+=i;
		return age;
	}

}
