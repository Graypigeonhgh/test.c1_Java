package day1119;

import java.util.Arrays;

public class practice4 
{
	public static void main(String[] args)
	{
		
		int[] arr2=new int[] {1,2,3,4,5,6,7,8,9,10,11,13,15};
		int[][] arr3=new int[2][];

		int end=6,head=7;
		arr3[0]=new int[head];
		arr3[1]=new int[arr2.length-head];
		
		for(int i=0;i<end;i++)//使用冒泡法排序奇数部分
		{
			for(int j=0;j<end-i;j++)
			{
				if(arr2[j]>arr2[j+1])
				{
					int temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
		for(int i=head;i<arr2.length-1;i++)//使用冒泡法排序偶数部分
		{
			for(int j=head;j<arr2.length-1-i;j++)
			{
				if(arr2[j]<arr2[j+1])
				{
					int temp=arr2[j];
					arr2[j]=arr2[j+1];
					arr2[j+1]=temp;
				}
			}
		}
	
		
		for(int i=0;i<arr3.length;i++)//遍历
		{
			System.out.println(Arrays.toString(arr3[i]));
		}
	}
}
