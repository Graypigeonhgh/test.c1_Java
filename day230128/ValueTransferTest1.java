package day230128;

public class ValueTransferTest1 {
	public static void main(String[] args) {
		Date date=new Date();
		
		date.m=10;
		date.n=20;
		
		System.out.println("m="+date.m+",n="+date.n);
		
		ValueTransferTest1 test=new ValueTransferTest1();
		test.swap(date);
		
	}
	
	public void swap(Date date) {	//传入参数为引用数据类型，传入的是地址值
		int temp=date.m;
		date.m=date.n;
		date.n=temp;
		System.out.println("m="+date.m+",n="+date.n);
		
	}
}

class Date{
	int m;
	int n;
	
}