//输入三个整型存入变量num1，num2，num3中，按从小到大排序

import java.util.Scanner;//导包
class IfTest
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);//Scanner的实例化
		
		System.out.println("输入第一个整数");
		int num1=scan.nextInt();

		System.out.println("输入第二个整数");
		int num2=scan.nextInt();

		System.out.println("输入第三个整数");
		int num3=scan.nextInt();
		
		if(num1>num2)
		{
			int temp=num1;
			num1=num2;
			num2=temp;
		
			if(num1>num3)
			{
				temp=num1;
				num1=num3;
				num3=temp;
			
				if(num2>num3)
				{
					temp=num2;
					num2=num3;
					num3=temp;
				}
			}
		}
		System.out.println("\n"+num1+"\n"+num2+"\n"+num3+"\n");
	}
}