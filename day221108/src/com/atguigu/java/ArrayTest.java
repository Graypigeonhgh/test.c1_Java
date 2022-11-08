package com.atguigu.java;

public class ArrayTest 
{
	public static void main(String[] args)
	{
		int[] arr1=new int[]{1001,1002,1003,1004};
		String[] names=new String[5];
		names[0]="a";
		names[1]="b";
		names[2]="c";
		names[3]="d";
		names[4]="e";
		System.out.println(arr1[1]);
		System.out.println(arr1.length);
		for(int i=0;i<names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}
