import java.util.Scanner;//����
class Practice
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);//Scanner��ʵ����

//1.��תһ��ֻ����λ��������
		System.out.println("��������λ����");
		int num1=scan.nextInt();
		if(num1>99&&num1<1000)
		{
			System.out.print(num1%10);
			System.out.print(num1/10%10);
			System.out.print(num1/100+"\n");
		}
		else
		{
			System.out.println("�������"+'\n');
		}

//2.��һ����ĸ�������д�дת��ΪСд(��Сдת��Ϊ��д)
		System.out.println("������һ����д��ĸ");
		String gender=scan.next();
		char letter=gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
		letter=(char)(letter+32);//ǿ������ת��
		System.out.println(letter); 

//3,�ڿ���̨������Ǫ��4���������������䰴�Ѵ�С�����˳���������
		System.out.println("�������һ������");
		int num2=scan.nextInt();

		System.out.println("������ڶ�������");	
		int num3=scan.nextInt();

		System.out.println("���������������");	
		int num4=scan.nextInt();

		System.out.println("��������ĸ�����");
		int num5=scan.nextInt();
		int temp;
		for (int i=1;i<4 ;i++ )
		{
			if (num2>num3)
			{
				temp=num2;
				num2=num3;
				num3=temp;
			}
			if (num2>num4)
			{
				temp=num2;
				num2=num4;
				num4=temp;
			}
			if (num2>num5)
			{
				temp=num2;
				num2=num5;
				num5=temp;
			}
			if (num3>num4)
			{
				temp=num3;
				num3=num4;
				num4=temp;
			}
			if (num3>num5)
			{
				temp=num3;
				num3=num5;
				num5=temp;
			}
			if (num4>num5)
			{
				temp=num4;
				num4=num5;
				num5=temp;
			}

			else if(num2<=num3&&num3<=num4&&num4<=num5)
			{
				break;
			}
		}
		System.out.println(num2+" "+num3+" "+num4+" "+num5);

//4.�ڿ���̨����������һ����������λ����������:
//�������Ǽ�λ��
//�������ӡ(��:6427���Ϊ7246;5430���Ϊ345)

		int num=scan.nextInt();
		int b=num;
		int count=0;
		if (num>=1000&&num<=9999)
		{
			for (int i=0;i<4;i++)
			{
				if (num>0)
				{
					num=num/10;
					count++;
				}

			}
			System.out.println(count+"λ��");
		}
		else
		{
			System.out.println("�������");
		}


		for (int a=0;a<count ;a++ )
		{
			int c=b%10;
			b=b/10;
			if (c!=0)
			{
				System.out.print(c);
			}
		}
		
//5.��ӡ��1-100(��100)֮�����в���7�ı����Ͳ�����7�����֣������
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if (i%7!=0)
			{
				if (i%10!=7&&i/10%10!=7)
				{
					System.out.println(i);
					sum=sum+i;
				}
			}
		}
		System.out.println("����֮��Ϊ��"+sum+"\n");


//6.����������2005��9��12�����������̨�ۺ�Ƶ���ײ����߽�(2022��11��6��)�Ѳ����˶�����?
		System.out.println("���������");
		int year=scan.nextInt();
		System.out.println("�������·�");
		int month=scan.nextInt();
		System.out.println("���������");
		int day=scan.nextInt();
		int j;
		int sum=0,a=0;

		for(int i=year+1;i<=2022;i++)
		{
			if (i%400==0||(i%4==0&&i%100!=0))
			{
				j=366;
			}
			else
			{
				j=365;
			}
			sum=sum+j;
		}
		switch(month)
		{
			case 1:a+=31;
			case 2:if (year%400==0||(year%4==0&&year%100!=0))
					{
						a+=29;
					}
					else
					{
						a+=28;
					}
			case 3:a+=31;
			case 4:a+=30;
			case 5:a+=31;
			case 6:a+=30;
			case 7:a+=31;
			case 8:a+=31;
			case 9:a+=30;
			case 10:a+=31;
			case 11:a+=30;
			case 12:a+=31;
		}
		sum=sum+a-day-55;
		System.out.println("������Ϊ:"+sum);

	}
}
