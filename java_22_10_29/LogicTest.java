//逻辑操作符的使用
class LogicTest
{
	//逻辑与（&）和短路与（&&）
	public static void main(String[] args)
	{
		boolean b1=true;
		b1=false;
		int num1=10;
		if(b1&(num1++>0))
		{
			System.out.println("******");
		}
		else
		{
			System.out.println("......");
		}
		System.out.println("num1="+num1);


		boolean b2=true;
		b2=false;
		int num2=10;
		if(b2&&(num2++>0))
		{
			System.out.println("******");
		}
		else
		{
			System.out.println("......");
		}
		System.out.println("num2="+num2);

		//逻辑或|和短路或||
		boolean b3=false;
		b3=true;
		int num3=10;
		if(b3|(num3++>0))
		{
			System.out.println(".....");
		}
		else
		{
			System.out.println("******");
		}
		System.out.println("num3="+num3);


		boolean b4=false;
		b4=true;
		int num4=10;
		if(b4||(num4++>0))
		{
			
			System.out.println(".....");
		}
		else
		{
			System.out.println("******");
		}
		System.out.println("num4="+num4);

		//位运算符的使用
		//用最高效的方法计算2*8： 2<<3 或 8<<1
		int m=12;
		int n=5;
		System.out.println("m&n:"+(m&n));//4
		System.out.println("m|n:"+(m|n));//13
		System.out.println("m^n:"+(m^n));//9

		//练习：交换两个变量的值
		//推荐
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1="+num1+",num2="+num2);//注意格式

		//方式2
		//好处：不用定义临时变量，省空间；弊端：相加操作可能超出存储范围；有局限性，只能适用于数值类型
		//num1=num1+num2;
		//num2=num1-num2;
		//num1=num1-num2;

		//方式3：使用位运算符^
		//num1=num1^num2;
		//num2=num1^num2;
		//num1=num1^num2;


	}
}