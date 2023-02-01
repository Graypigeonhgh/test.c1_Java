package day230128;

public class ValueTransferTest2 {
	public static void main(String[] args) {
		ValueTransferTest2 util=new ValueTransferTest2();
		
		int[] arr=new int[] {32,24,46,-90,66,10,20};
		util.sort(arr);
		util.print(arr);
	
	}
	
	public void sort(int[] arr) {
		//冒泡排序
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);	//数组为引用数据类型
				}
			}
		}
	}
	
	public void swap(int[] arr,int i,int j) {	//传入参数为引用数据类型，传入的是地址值
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	}
	
	public void print(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+",");	
		}
	}
}


