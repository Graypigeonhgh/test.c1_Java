//�����������ʹ������num1��num2��num3�У�����С��������

import java.util.Scanner;//����
class IfTest
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);//Scanner��ʵ����
		
		System.out.println("�����һ������");
		int num1=scan.nextInt();

		System.out.println("����ڶ�������");
		int num2=scan.nextInt();

		System.out.println("�������������");
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