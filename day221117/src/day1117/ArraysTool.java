package day1117;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月17日下午10:20:28
 *Arrays工具类的使用（java.util.Arrays类即为操作数组的工具类
 */

import java.util.Arrays;

public class ArraysTool
{
	public static void main(String[] args)
	{
		int[] arr1=new int[] {1,2,3,4,5,6,7};
		int[] arr2=new int[] {1,2,4,5,3,7,6};
		int[] arr3=new int[] {-60,-30,-20,3,10,28,40,45,60};
	
		//1.boolean equals(int[] a,int[]b):判断两个数组是否相等
		boolean isEquals=Arrays.equals(arr1,arr2);
		System.out.println(isEquals);
		
		
		//2.String toString(int[] a):输出数组信息（不需再用for循环遍历了）
		System.out.println(Arrays.toString(arr1));
		
		
		//3.void fill(int[] a,int val):将指定的值填充到数组中
		Arrays.fill(arr1,10);
		System.out.println(Arrays.toString(arr1));
		
		
		//4.void sort(int[] a):对数组进行排序(快速排序)(不需要使用冒泡了)
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
		
		//5.int binarySearch(int[] a,int key):二分法检索指定的值
		int index=Arrays.binarySearch(arr3, 20);
		System.out.println(index);//未找到时index为负数
		if(index>0)//直观反映是否找到
		{
			System.out.println(index);
		}
		else
		{
			System.out.println("未找到");
		}
	}
}
