package day1114_java;

public class ArrayTest6 
{
	public static void main(String[] args)
	{
	 //数组的复制，反转
		String[] arr=new String[] {"A","B","C","D","E","F"};//字符的静态初始化
		String[] arr2=new String[] {"A","B","C","D","E","F"};//字符的静态初始化
	
		String[] arr1=new String[arr.length];//动态
		arr1=arr;//赋值
		System.out.println(arr1);//地址值
		
		for(int i=0;i<arr1.length;i++)//数组的复制（区别于赋值）
		{
			arr1[i]=arr[i];
		}
		for(int i=0;i<arr1.length;i++)//遍历
		{
			System.out.print(arr1[i]+"\t");
		}
		
		for(int i=0;i<arr.length/2;i++)//数组的反转：法1
		{
			String temp=arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		for(int i=0;i<arr1.length;i++)//遍历
		{
			System.out.print(arr[i]+"\t");
		}
	
		
		for(int i=0,j=arr2.length-1;i<j;i++,j--)//法2
		{
			String temp=arr2[i];
			arr2[i]=arr[j];
			arr[j]=temp;
		}
		for(int i=0;i<arr1.length;i++)//遍历
		{
			System.out.print(arr[i]+"\t");
		}
	
	}
}
