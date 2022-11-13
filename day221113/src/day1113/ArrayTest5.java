package day1113;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月13日下午10:23:37
 *
 */

public class ArrayTest5 
{
	public static void main(String[] args)
	{
		//赋值10个随机数并求数组中元素的最大，最小，平均值
		int[] arr=new int[10];//数值的动态初始化
		for(int i=0;i<arr.length;i++)//赋值随机数[10,99]
		{
			arr[i]=(int)(Math.random()*(99-10+1)+10);
		}
		
		for(int i=0;i<arr.length;i++)//遍历
		{
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		
		int maxValue=0;
		for(int i=0;i<arr.length;i++)//求最大值
		{
			if(maxValue<arr[i])
			{
				maxValue=arr[i];
			}
		}
		System.out.println("最大值为："+maxValue);

		
		int minValue=arr[0];
		for(int i=0;i<arr.length;i++)//求最小值
		{
			if(minValue>arr[i])
			{
				minValue=arr[i];
			}
		}
		System.out.println("最小值为："+minValue);
		
		int sum=0;
		for(int i=0;i<arr.length;i++)//求数组元素的总和
		{
			sum+=arr[i];
		}
		System.out.println("总和为："+sum);

		int avgValue=sum/arr.length;//求数组元素的平均数
		System.out.println("平均数为："+avgValue);

		
	}
}
