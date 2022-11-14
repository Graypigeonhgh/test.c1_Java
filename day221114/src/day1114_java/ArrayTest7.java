package day1114_java;

public class ArrayTest7 
{
	public static void main(String[] args)
	{
		//数组的查找（线性查找）
		String[] arr=new String[] {"AB","BC","CD","DE","FG","GH"};
		String dest="DE";
		boolean isFlag=true;
		
		for(int i=0;i<arr.length;i++)
		{
			if(dest.equals(arr[i]))
			{
				System.out.println("找到了指定元素，位置下标为："+i);
				isFlag=false;
				break;
			}
		}
		if(isFlag)
		{
			System.out.println("很遗憾，没找到！");
		}
		
	}
}
