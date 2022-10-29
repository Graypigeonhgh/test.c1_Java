//String--练习

class StringTest2
{
	public static void main (String[] args)
	{
		char c='a';
		int num=10;
		String str="hello";
		System.out.println(c+num+str);//107hello
		System.out.println(c+str+num);//ahello10
		System.out.println(c+(num+str));//a10hello
		System.out.println((c+num)+str);//107hello
		System.out.println(str+num+c);//hello10a


		System.out.println("*	*");//*		*
		System.out.println('*'+'\t'+'*');//打印相应的ASCII码值：93
		System.out.println('*'+"\t"+'*');//与字符相加，+为连接运算符，结果为*	*
		System.out.println('*'+'\t'+"*");//先相加再连接运算，结果为：51*
		System.out.println('*'+('\t'+"*"));//括号内先相加，含有字符，+为连接运算

		String str1=123+"";
		//String str1=123  不通过

		//int num1=str1;
		//int num1=(int)str1; String不是基本数据类型，不能用强制类型转换

		int num1=Integer.parseInt(str1);
		System.out.println(num1);//123 

	}
}
