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
		//二分查找（折半查找）所要查找的数组必须有序
		int[] arr2=new int[] {-98,-67,-34,0,9,10,24,40,78,87};
		int dest1=scan.nextInt();
		
		int head=0;//初始首索引
		int end=arr2.length-1;//初始末索引
		boolean isFlag1=true;
		while(head<=end)
		{
			int middle=(head+end)/2;
			if(dest1==arr2[middle])
			{
				System.out.println("找到了，位置为："+middle);
				isFlag1=false;
				break;
			}
			else if(dest1<arr2[middle])
			{
				end=middle-1;
			}
			else
			{
				head=middle+1;
			}
		}
		if(isFlag1==true)
		{
			System.out.println("很遗憾，没找到！");
		}

		
	}
}
