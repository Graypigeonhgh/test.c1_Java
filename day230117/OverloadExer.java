package day230117;
/*
 * 1.编写程序，定义三个重载方法并调用。方法名为mOL。
 * 三个方法分别接收一个int参数、两个int参数、一个字符串参数分别执行平方运算并输出结果，
 * 相乘并输出结果，输出字符串信息。在主类的main ()方法中分别用参数区别调用三个方法。
   2.定义三个重载方法max()，第一个方法求两个int值中的最大值
   第二个方法求两个double值中的最大值第三个方法求三个double值中的最大值并分别调用三个方法
 */
public class OverloadExer {
	//1.如下三个方法构成重载
	public void mOL(int i) {
		System.out.println(i*i);
	}
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	public void mOL(String i) {
		System.out.println(i);
	}
	//2.如下三个方法构成重载
	public int max (int i,int j) {
		return (i>j)?i:j;
	}
	public double max(double b1,double b2) {
		return (b1>b2)?b1:b2;
	}
	public double max(double b1,double b2,double b3) {
		double max=(b1>b2)?b1:b2;
		return (max>b3)?max:b3;
	}
}

