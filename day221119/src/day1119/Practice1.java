package day1119;

import java.util.Arrays;
import java.util.Scanner;

public class Practice1 
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		/*
		 * 定义一个一维数组arr，用于存储正整数，存储的数据的在控制台输入。
		 *  1、将该数组反转
		 *  2.在控制台输入一个数,用二分查找法判断该数是否在该数组里
		 *  3.新建一个二维数组，将一维数组的中的全部奇数放在二维数组中并从小到大进行排序，全部偶数
		 *  放到第二行中并从大到小进行排序。 遍历输出该二维数组
		 */
		int[] arr=new int[10];
		int[] arr1=new int[arr.length];
		System.out.println("请输入数组元素（正整数）：");
		for(int i=0;i<arr.length;i++)//给arr[]赋值
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<arr1.length;i++)//反转
		{
			arr1[i]=arr[arr.length-1-i];
		}
		System.out.println(Arrays.toString(arr1));//输出数组信息
		
		int dest=scanner.nextInt();//二分法
		int head=0;//初始首索引
		int end=arr.length-1;
		boolean flag=true;
		while(head<=end)
		{
			int middle=(head+end)/2;
			if(dest==arr[middle])
			{
				System.out.println("找到了，位置为："+middle+"\n");
				flag=false;
				break;
			}
			else if(dest<arr[middle])
			{
				end=middle-1;
			}
			else
			{
				head=middle+1;
			}
			
		}
		if(flag==true)
		{
			System.out.println("没找到！");
		}
		
		
		
		
		int[] arr2=new int[10];
		
		for(int i=0;i<arr2.length;i++)//随机赋值
		{
			arr2[i]=(int)(Math.random()*100);
		}
		System.out.println(Arrays.toString(arr2));//输出数组arr2
		
		
		
		int[][] arr3=new int[2][];
		head=0;
		end=arr2.length-1;
		while(head<=end)//利用二分法将奇数放左侧，偶数放右侧
		{
			
			if(arr2[head]%2!=0&&arr2[end]%2==0)
			{
				head++;end--;
			}
			else if(arr2[head]%2!=0&&arr2[end]%2!=0)
			{
				head++;
			}
			else if(arr2[head]%2==0&&arr2[end]%2==0)
			{
				end--;
			}
			else if(arr2[head]%2==0&&arr2[end]%2!=0)
			{
				int temp=arr2[head];
				arr2[head]=arr2[end];
				arr2[end]=temp;
				head++;end--;
				
			}
		}
		//System.out.println(head+"\n"+end);
		
		arr3[0]=new int[head];
		arr3[1]=new int[arr2.length-head];
		int[] arr4=new int[arr2.length-head];
		for(int i=0;i<head;i++)//给二维数组赋值，第一行
		{
			arr3[0][i]=arr2[i];
		}
		for(int i=head;i<arr2.length;i++)//第二行
		{
			arr4[i-head]=arr2[i];
		}
		
		Arrays.sort(arr3[0]);//使用数组工具，先给二维数组赋值，再排序
		Arrays.sort(arr4);
		
		
		for(int i=0;i<arr3[1].length;i++)//第二列的偶数从大到小排列
		{
			arr3[1][i]=arr4[arr4.length-1-i];
		}


		for(int i=0;i<arr3.length;i++)//遍历
		{
			System.out.println(Arrays.toString(arr3[i]));
		}


	}
}

