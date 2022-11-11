package com.atguigu.java;

public class ArrayTest2 
{
	public static void main(String[] args)
	{
		//二维数组的使用:标准写法
		int[][] arr1=new int[][] {{1,2,3,4},{6,7,4},{9,0}};//静态初始化
		String[][] arr2=new String[3][4];
		
		String[][] arr3=new String[3][];//行一定不能省略
		int[] arr4[]=new int[][] {{1,2,3},{4,5}};
		int arr5[][]=new int[][] {{1,2,3,4},{8,4}};
		int[][] arr6= {{1,2,3},{9,8}};//Sring中不可省
		
		/*
		 * //错误写法 
		 * int[][] arr7=new int[4][3] {{1,3,4,5},{6,7}}; 
		 * String[][] arr7=new String[][4];
		 * String[4][3] arr7=new String[][];
		 */
		
		//调用数组指定位置的元素
		System.out.println(arr1[0][1]);//2
		System.out.println(arr2[1][2]);//null,元素未赋值，String默认初始化为null
		arr3[1]=new String[4];//指定第二行的列数为4，但未赋值
		System.out.println(arr3[1][0]);//若无上一行，则会报错，因为列数未指定
		
		
		//计算数组长度
		System.out.println(arr1.length);//3，arr4仍为一维数组
		System.out.println(arr1[0].length);//4,arr[0]位置上数组的长度
		System.out.println(arr4[1].length);//2
				
		
	}
}
