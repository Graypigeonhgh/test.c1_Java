//ʹ��Scanner��Ӽ����ϻ�ȡ��ͬ���͵ı���

import java.util.Scanner;//����
class ScannerTest
{
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);//Scanner��ʵ����

		System.out.println("������������");
		String name=scan.next();//��ȡ�ַ�������
		System.out.println(name);

		System.out.println("���������䣺");
		int age=scan.nextInt();
		System.out.println(age);

		System.out.println("���������أ�");
		double weight=scan.nextDouble();
		System.out.println(weight);

		System.out.println("���Ƿ��������ѣ�");
		boolean isLove=scan.nextBoolean();
		System.out.println(isLove);

//����char�͵Ļ�ȡ��Scannerû���ṩ��ط�����ֻ�ܻ�ȡһ���ַ�������string����ȡ�����ַ���
		System.out.println("�������Ա�");
		String gender=scan.next();
		System.out.println();
		
		char genderChar=gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
		System.out.println(genderChar);


	}
}
