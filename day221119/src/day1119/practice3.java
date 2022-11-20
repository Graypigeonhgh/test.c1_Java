package day1119;

import java.util.Arrays;
import java.util.Scanner;

public class practice3 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		
		int[][] arr=new int[][] {{1,2,3,4},{5,6,7,8},{9,0,12,23}};
		for(int i=0;i<arr.length;i++)//遍历数组
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
		
		int[] rowMax=new int[arr.length];
		int[] lineMin=new int[arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			rowMax[i]=arr[0][i];
			
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
			lineMin[i]=arr[0][i];
			
			for(int j=0;j<arr.length;j++)
			{
				
				if(lineMin[i]>arr[j][i])//固定列遍历每行，求每列最小值
				{
					lineMin[i]=arr[j][i];
				}
			}
		}
		System.out.println("每行最大值为："+"\n"+Arrays.toString(rowMax));
		System.out.println("每列最小值为："+"\n"+Arrays.toString(lineMin));
		
	}
}




























