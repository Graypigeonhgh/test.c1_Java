package day230128;
/**
 * 
 *  @Description	可变个数形参的方法 格式：数据类型...变量名
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2023年1月31日下午7:22:32
 *
 */
public class MethodArgsTest {
	public static void main(String[] args) {
		MethodArgsTest test=new MethodArgsTest();
//		test.show(new String[]{"AA","BB","CC"});调用数组形式的方法，需要new
		
		//以下都是调用可变个数形参的方法，可传入参数个数为0~无穷
		test.show();
		test.show("AA");			//优先调用方法s
		test.show("AA","BB","CC");	//调用可变个数形参的方法时，可不用new
	}
	
	public void show(int i) {
		
	}
	public void show(String s) {
		System.out.println("show(String)");
	}
//	二者等价
//	public void show(String[] strs) {
//		
//	}
	
	public void show(String...strs) {	//strs相当于数组
		System.out.println("show(String...strs)");
		for(int i=0;i<strs.length;i++) {	
			System.out.println(strs[i]);
		}
	}
}


