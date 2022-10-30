//算术运算符的使用

class AriTest
{
	public static void main(String[] args)
	{
		int num1=12;
		int num2=5;
		int result1=num1/num2;
		System.out.println(result1);//2

		int result2=num1/num2*num2;//10
		double result3=num1/num2;//2.0
		double result4=num1/num2+0.0;//2.0
		double result5=num1/(num2+0.0);//2.4 ， 整型/浮点型=浮点型
		double result6=(double)num1/num2;//2.4
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);


		int m1=12;
		int n1=5;
		System.out.println("m1%n1="+m1%n1);//2
		int m2=-12;
		int n2=5;
		System.out.println("m2%n2="+m2%n2);//2
		int m3=12;
		int n3=-5;
		System.out.println("m3%n3="+m3%n3);//-2
		int m4=-12;
		int n4=-5;
		System.out.println("m4%n4="+m4%n4);//-2


		//自增++（自增不会改变变量本身的数据类型）
		byte b1=127;
		b1++;
		System.out.println("b1="+b1);//-128,容量范围没变，说明数据类型也没变

/*
练习：随意给出一个三位数的整数，打印显示它的个位数，十位数，百位数的值
数字：123
输出：个位数：3
      十位数：2
	  百位数：1
*/
		int num=918;
		int bai=num/100;
		int shi=num%100/10;
		int ge=num%10;
		System.out.println("百位为："+bai);
		System.out.println("十位为："+shi);
		System.out.println("个位为："+ge);


/*赋值运算符：++，--，+=，%=，*=
	好处：代码量少，不会改变变量的数据类型
*/
		int s1=1;
		//s1=s1+2;编码失败
		s1+=2;

		int n=10;
		n+=(n++)+(++n);//n=n+(n++)+(++n)————n=10+10+12=32
		System.out.println(n);//32

	}
}