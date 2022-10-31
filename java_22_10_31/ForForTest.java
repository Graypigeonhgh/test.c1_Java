class ForForTest
{
	public static void main(String[] args)
	{
/*¥Ú”°
*
**
***
****
*****
****
***
**
*
*/
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}

			System.out.println("");
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=5-i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}



//æ≈æ≈≥À∑®±Ì
		for(int i=1;i<=9;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i+"*"+j+"="+(i*j)+"  ");
			}
			System.out.println();
		}
	}
}