package day230213;

public class RecursionTest {
	public static void main(String[] args) {
		//1.计算1~100的总和（递归）
		RecursionTest test=new RecursionTest();
		System.out.println("总和为:"+test.getSum(100));
		
		//2.已知一个数列，f(0)=1,f(1)=4,f(n+2)=2*f(n+1)+f(n),求f(n);
		System.out.println("总和为:"+test.f(10));
	}
	
	public int getSum(int i) {
		if(i==1) {
			return 1;
		}else {
			return i+getSum(i-1);
		}
	}
	
	public int f(int n) {
		if(n==0) {
			return 1;
		}else if(n==1){
			return 4;
		}else {
//			return 2*f(n+1)-f(n+2);//栈溢出，f()越来越大，无限循环
			//正确写法：使循环次数有限，令f(n+2)=f(n);
			return 2*f(n-1)+f(n-2);
		}
	}
	
}
