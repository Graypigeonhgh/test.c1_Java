package com.day1112;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月12日下午7:24:11
 *
 */

public class ArrayTest4 
{
	public static void main(String[] args)
	{
		int[][] arr=new int[][] {{3,5,4,6},{3,7,6},{7,8,9,0}};
		
		int sum=0;//记录总和
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println("总和为："+sum);
	}
	
}
