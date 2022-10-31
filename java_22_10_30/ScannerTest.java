//使用Scanner类从键盘上获取不同类型的变量

import java.util.Scanner;//导包
class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);//Scanner的实例化

		System.out.println("请输入姓名：");
		String name=scan.next();//获取字符串类型
		System.out.println(name);

		System.out.println("请输入年龄：");
		int age=scan.nextInt();
		System.out.println(age);

		System.out.println("请输入体重：");
		double weight=scan.nextDouble();
		System.out.println(weight);

		System.out.println("你是否有男朋友：");
		boolean isLove=scan.nextBoolean();
		System.out.println(isLove);

//对于char型的获取，Scanner没有提供相关方法，只能获取一个字符串（用string来获取单个字符）
		System.out.println("请输入性别：");
		String gender=scan.next();
		System.out.println();
		
		char genderChar=gender.charAt(0);//获取索引为0位置上的字符
		System.out.println(genderChar);


	}
}
