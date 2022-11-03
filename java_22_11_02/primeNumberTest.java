//打印1~100以内的质数
class PrimeNumberTest
{
	public static void main(String[] args)
	{
		//法1
		for (int i=2;i<=100;i++ )
		{
			boolean isFlag=true;
			for (int j=2;j<i ;j++ )
			{
				if (i%j==0)
				{
					isFlag=false;
				}
			}
			if (isFlag==true)
			{
				System.out.println(i);
			}
		}

		//法2
		boolean isFlag=true;//标识i是否被j除尽，一旦除尽，修改其值
		int count=0;
		long start=System.currentTimeMillis();//获取当前时间距离1970-01-01  00:00:00的毫秒数
		for (int i=2;i<=100000 ;i++ )
		{
			for (int j=2;j<=Math.sqrt(i) ;j++ )//优化：开平方
			{
				if (i%j==0)
				{
					isFlag=false;
					break;//优化：只对本身非质数的自然数是有效的
				}
			}
			if (isFlag==true)
			{
				count++;
				System.out.println(i);
			}
			isFlag=true;//重置isFlag
		}
		long end=System.currentTimeMillis();
		System.out.println("所花时间为："+(end-start));
		System.out.println("打印质数个数为："+count);
	}
}