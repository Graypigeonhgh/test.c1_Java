package day1113;

public class YangHui 
{
	public static void main(String[] args)
	{
		/*
		 * 使用二维数组打印10行杨辉三角 ;
		 *  提示：每行第一个和最后一个元素都是1; 
		 *  第n行有n个元素; 
		 *  从第三行开始，对非第一列和最后一列的元素赋值:
		 * yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
		 */
		int[][] yangHui=new int[10][];//声明并初始化二维数组（动态初始化）
		for(int i=0;i<yangHui.length;i++)
		{
			yangHui[i]=new int[i+1];//给数组元素赋值（第n行有n个元素）
			yangHui[i][0]=yangHui[i][i]=1;
			
			for(int j=1;j<yangHui[i].length-1;j++)//给每行的非首元素赋值
			{
				yangHui[i][j]=yangHui[i-1][j-1]+yangHui[i-1][j];
			}
			
		}
		for(int i=0;i<yangHui.length;i++)//遍历数组元素
		{
			for(int j=0;j<yangHui[i].length;j++)
			{
				System.out.print(yangHui[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
