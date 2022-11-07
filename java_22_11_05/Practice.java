import java.util.Scanner;//导包
class Practice
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);//Scanner的实例化

//1.反转一个只有三位数的整数
		System.out.println("请输入三位整数");
		int num1=scan.nextInt();
		if(num1>99&&num1<1000)
		{
			System.out.print(num1%10);
			System.out.print(num1/10%10);
			System.out.print(num1/100+"\n");
		}
		else
		{
			System.out.println("输入错误"+'\n');
		}

//2.将一个字母，将其中大写转换为小写(或将小写转换为大写)
		System.out.println("请输入一个大写字母");
		String gender=scan.next();
		char letter=gender.charAt(0);//获取索引为0位置上的字符
		letter=(char)(letter+32);//强制类型转换
		System.out.println(letter); 

//3,在控制台中输入仟意4个正整数，并对其按昭从小到大的顺序排列输出
		System.out.println("请输入第一个整数");
		int num2=scan.nextInt();

		System.out.println("请输入第二个整数");	
		int num3=scan.nextInt();

		System.out.println("请输入第三个整数");	
		int num4=scan.nextInt();

		System.out.println("请输入第四个整数");
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

//4.在控制台中输入任意一个不超过五位数的正整数:
//①求它是几位数
//②逆序打印(例:6427输出为7246;5430输出为345)

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
			System.out.println(count+"位数");
		}
		else
		{
			System.out.println("输入错误");
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
		
//5.打印出1-100(含100)之间所有不是7的倍数和不包含7的数字，并求和
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
		System.out.println("数字之和为："+sum+"\n");


//6.《亮剑》于2005年9月12日在中央电视台综合频道首播，具今(2022年11月6日)已播出了多少天?
		System.out.println("请输入年份");
		int year=scan.nextInt();
		System.out.println("请输入月份");
		int month=scan.nextInt();
		System.out.println("请输入号数");
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
		System.out.println("总天数为:"+sum);

	}
}

