//String--��ϰ

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
		System.out.println('*'+'\t'+'*');//��ӡ��Ӧ��ASCII��ֵ��93
		System.out.println('*'+"\t"+'*');//���ַ���ӣ�+Ϊ��������������Ϊ*	*
		System.out.println('*'+'\t'+"*");//��������������㣬���Ϊ��51*
		System.out.println('*'+('\t'+"*"));//����������ӣ������ַ���+Ϊ��������

		String str1=123+"";
		//String str1=123  ��ͨ��

		//int num1=str1;
		//int num1=(int)str1; String���ǻ����������ͣ�������ǿ������ת��

		int num1=Integer.parseInt(str1);
		System.out.println(num1);//123 

	}
}
