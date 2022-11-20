package day1119;

import java.util.Arrays;
//import java.util.Scanner;

public class practice2 
{
	public static void main(String[] args)
	{
		//Scanner scanner=new Scanner(System.in);
		/*
		 * 定义一个二维数组arr，存储数据在控制台输入 
		 * 4、将该数组遍历输出 
		 * 5.找出该二维数组的每行最大值，每列最小值
		 */
		int[][] arr=new int[3][4];
		System.out.println("随机给数组元素赋值：");
		
		for(int i=0;i<arr.length;i++)//给数组随机赋值
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=(int)(Math.random()*100);
			}
		}
		for(int i=0;i<arr.length;i++)//输出数组
		{
			System.out.println(Arrays.toString(arr[i]));
		}

	
		
		
		int[] rowMax=new int[arr.length];
		int[] lineMin=new int[arr[0].length];
		
		for(int i=0;i<arr.length;i++)
		{
			rowMax[i]=arr[i][0];//须初始化为一个数组内部的值(且每次都要换行，否则就会跟不同行比较)
			
			for(int j=0;j<arr[0].length;j++)
			{
				if(rowMax[i]<arr[i][j])//固定行遍历每列，求每行最大值
				{
					rowMax[i]=arr[i][j];
				}
			}
		}

		for(int i=0;i<arr[0].length;i++)
		{
			lineMin[i]=arr[0][i];//须初始化为一个数组内部的值(且每次都要换列，否则就会跟不同列比较)
			
			for(int j=0;j<arr.length;j++)
			{
				
				if(lineMin[i]>arr[j][i])//固定列遍历每行，求每列最小值
				{
					lineMin[i]=arr[j][i];
				}
			}
		}//总结：固定哪个，哪个的取值范围就等于行数
		System.out.println("每行最大值为："+"\n"+Arrays.toString(rowMax));//输出
		System.out.println("每列最小值为："+"\n"+Arrays.toString(lineMin));
		
	}
}