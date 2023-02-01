package day230128;
/**
 * 
 *  @Description	变量的赋值
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2023年1月31日下午8:31:18
 *
 */
public class ValueTransferTest {
	public static void main(String[] args) {
		System.out.println("基本数据类型：");//赋值变量保存的是数据值
		int m=10;
		int n=m;
		System.out.println("m="+m+",n="+n);
		n=20;
		System.out.println("m="+m+",n="+n);
		
		System.out.println("引用数据类型：");//赋值变量保存的是地址值
		Order o1=new Order();
		o1.OrderId=1001;
		Order o2=o1;	//赋值以后，o1和o2的地址值相同，都指向堆空间中同一个对象实体
		System.out.println("o1.OrderId="+o1.OrderId+",o2.OrderId="+o2.OrderId);
		o2.OrderId=1003;
		System.out.println("o1.OrderId="+o1.OrderId+",o2.OrderId="+o2.OrderId);
	}
}
class Order{
	int OrderId;
}