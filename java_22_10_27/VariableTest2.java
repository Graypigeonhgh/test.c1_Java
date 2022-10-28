class VariableTest2
{
	public static void main(String[] args)
	{
		byte a1=2;
		int b1=129;
		//byte i1=a1+b1;编译不成功，byte容量过小
		int i1=a1+b1;
		System.out.println(i1);

		int a2=a1+b1;
		long i2=a1+b1;
		System.out.println(i2);

		float f=a1+b1;
		System.out.println(f);

		short s1=123;
		double d2=s1;
		System.out.println(d2);

		char c1='a';
		int i3=10;
		int i4=c1+i3;
		System.out.println(i4);

		//强制类型转换，精度损失
		double d1=12.9;
		int i5=(int)d1;
		System.out.println(i5);

		int i6=128;
		byte b=(byte)i6;
		System.out.println(b);

		long l1=123;
		short s2=(short)l1;


	}
}