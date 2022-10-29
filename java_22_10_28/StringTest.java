//特殊类型

class StringTest 
{
	public static void main(String[] args)
	{
		String s1="Hello World!";
		System.out.println(s1);
		String s2="abc";
		String s3="";

		//char ='';编译不通过
		//char='1';

		int number=1001;
		String numberStr="学号: ";
		String info=number+numberStr;//+在这里是连接运算符
		boolean b1=true;
		String info1=info+b1;
		System.out.println(info);
		System.out.println(info1);


	}
}