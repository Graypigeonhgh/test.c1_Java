//�߼���������ʹ��
class LogicTest
{
	//�߼��루&���Ͷ�·�루&&��
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

		//�߼���|�Ͷ�·��||
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

		//λ�������ʹ��
		//�����Ч�ķ�������2*8�� 2<<3 �� 8<<1
		int m=12;
		int n=5;
		System.out.println("m&n:"+(m&n));//4
		System.out.println("m|n:"+(m|n));//13
		System.out.println("m^n:"+(m^n));//9

		//��ϰ����������������ֵ
		//�Ƽ�
		int temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("num1="+num1+",num2="+num2);//ע���ʽ

		//��ʽ2
		//�ô������ö�����ʱ������ʡ�ռ䣻�׶ˣ���Ӳ������ܳ����洢��Χ���о����ԣ�ֻ����������ֵ����
		//num1=num1+num2;
		//num2=num1-num2;
		//num1=num1-num2;

		//��ʽ3��ʹ��λ�����^
		//num1=num1^num2;
		//num2=num1^num2;
		//num1=num1^num2;


	}
}