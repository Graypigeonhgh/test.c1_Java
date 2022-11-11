package com.atguigu.contact;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月10日上午9:03:29
 *
 */

public class ArrayDemo1 
{
	public static void main(String[] args)
	{
		int[] arr1=new int[] {1,2,5,6,7,8,9,0};
		int[] arr2=new int[] {0,2,6,4,3,2,0,7,1,2,5};
		String a="";
		for(int i=0;i<arr2.length;i++)
		{
			a+=arr1[arr2[i]];
		}
		System.out.println("联系方式："+a);
	}
}
