package com.day1112;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月12日下午5:03:27
 *
 */

public class ArrayTest3 
{
	public  static void main(String[] args)
	{
		//一维数组初始化的两种方式
		int[] arr1=new int[] {1,2,3,4};
		String[] arr2=new String[]{"tom","oblige"};//静态初始化
		
		int[] arr3=new int[5];
		String[] arr4=new String[5];//动态初始化
		//数组一旦初始化，其长度就是确定的，不可修改；
		
		//二维数组初始化的两种方式
		int[][] arr5=new int[][] {{1,2,3},{4,5},{6,7}};
		String[][] arr6=new String[][] {{"a","b"},{"c"}};
		
		int[][] arr7=new int[4][5];
		String[][] arr8=new String[3][];
		
		//如何遍历二维数组
		for(int i=0;i<arr5.length;i++)
		{
			for(int j=0;j<arr5[i].length;j++)
			{
				System.out.print(arr5[i][j]);
			}
			System.out.println();
		}
		
	}
}
