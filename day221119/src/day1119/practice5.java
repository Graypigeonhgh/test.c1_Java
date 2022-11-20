package day1119;

import java.util.Arrays;

public class practice5 
{
	public static void main(String[] args)
	{
		//Scanner scanner=new Scanner(System.in);
		/*
		 * 定义一个二维数组arr，存储数据在控制台输入 
		 * 4、将该数组遍历输出 
		 * 5.找出该二维数组的一个鞍点 (即该元素的位置在该行上最大，该列上最小)
		 */
		
		int row=3;
		int line=4;
		int[][] arr=new int[row][line];
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
		
		
		int i=0,j=0,k=0,m=0;
		boolean flag=true;
	
		for(i=0;i<row;i++)
		{
			int max=arr[i][0];
			for(j=0;j<line;j++)//找第一行中最大值的数
			{
				if(arr[i][j]>max)
				{
					max=arr[i][j];
					m=j;//max所在列
				}
			}
			for(k=0;k<row;k++)//判断arr所在列中是否存在最小值
			{
				if(max>arr[k][m])
				{
					break;
				}
			}
			if(k==row)//说明该列中没有比max更大的数
			{
				System.out.println("鞍点为："+max);
				flag=false;
			}
		}
		if(flag==true)
		{
			System.out.println("该二维数组没有鞍点\n");
		}

	}
}


















