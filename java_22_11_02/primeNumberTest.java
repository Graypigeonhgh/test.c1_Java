//��ӡ1~100���ڵ�����
class PrimeNumberTest
{
	public static void main(String[] args)
	{
		//��1
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

		//��2
		boolean isFlag=true;//��ʶi�Ƿ�j������һ���������޸���ֵ
		int count=0;
		long start=System.currentTimeMillis();//��ȡ��ǰʱ�����1970-01-01  00:00:00�ĺ�����
		for (int i=2;i<=100000 ;i++ )
		{
			for (int j=2;j<=Math.sqrt(i) ;j++ )//�Ż�����ƽ��
			{
				if (i%j==0)
				{
					isFlag=false;
					break;//�Ż���ֻ�Ա������������Ȼ������Ч��
				}
			}
			if (isFlag==true)
			{
				count++;
				System.out.println(i);
			}
			isFlag=true;//����isFlag
		}
		long end=System.currentTimeMillis();
		System.out.println("����ʱ��Ϊ��"+(end-start));
		System.out.println("��ӡ��������Ϊ��"+count);
	}
}