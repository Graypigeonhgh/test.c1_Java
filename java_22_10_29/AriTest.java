//�����������ʹ��

class AriTest
{
	public static void main(String[] args)
	{
		int num1=12;
		int num2=5;
		int result1=num1/num2;
		System.out.println(result1);//2

		int result2=num1/num2*num2;//10
		double result3=num1/num2;//2.0
		double result4=num1/num2+0.0;//2.0
		double result5=num1/(num2+0.0);//2.4 �� ����/������=������
		double result6=(double)num1/num2;//2.4
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);


		int m1=12;
		int n1=5;
		System.out.println("m1%n1="+m1%n1);//2
		int m2=-12;
		int n2=5;
		System.out.println("m2%n2="+m2%n2);//2
		int m3=12;
		int n3=-5;
		System.out.println("m3%n3="+m3%n3);//-2
		int m4=-12;
		int n4=-5;
		System.out.println("m4%n4="+m4%n4);//-2


		//����++����������ı����������������ͣ�
		byte b1=127;
		b1++;
		System.out.println("b1="+b1);//-128,������Χû�䣬˵����������Ҳû��

/*
��ϰ���������һ����λ������������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ
���֣�123
�������λ����3
      ʮλ����2
	  ��λ����1
*/
		int num=918;
		int bai=num/100;
		int shi=num%100/10;
		int ge=num%10;
		System.out.println("��λΪ��"+bai);
		System.out.println("ʮλΪ��"+shi);
		System.out.println("��λΪ��"+ge);


/*��ֵ�������++��--��+=��%=��*=
	�ô����������٣�����ı��������������
*/
		int s1=1;
		//s1=s1+2;����ʧ��
		s1+=2;

		int n=10;
		n+=(n++)+(++n);//n=n+(n++)+(++n)��������n=10+10+12=32
		System.out.println(n);//32

	}
}