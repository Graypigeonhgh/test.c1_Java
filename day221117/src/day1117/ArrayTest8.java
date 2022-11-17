package day1117;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月16日下午11:51:26
 *
 */

public class ArrayTest8
{
	//冒泡排序
	public static void main(String[] args)
	{
		int[] arr=new int[] {40,30,70,-40,-50,-10,9,20,50};
		int i,j;
		for(i=0;i<arr.length-1;i++)//趟数
		{
			for(j=0;j<arr.length-1-i;j++)//每趟次数
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+",");
		}
	}
}
