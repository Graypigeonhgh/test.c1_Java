package day221130;
/**
 * 
 *  @Description
 *  @author  greypigeon  Email:2371849349@qq.com
 *  @version
 *  @date 2022年11月30日下午9:28:18
 *
 */
public class CirlcleTest {
	public static void main(String[] args) {
		Circle c1=new Circle();
		c1.radius=2;
		//对应方式一
		double area=c1.findArea();
		System.out.println(area);
		//对应方式二
		c1.findArea();//直接调用函数

	}
}


//创建类
class Circle{
	//属性
	double radius;
	
	//求圆面积
	//方式一：
	public double findArea() {
		double area=Math.PI*radius*radius;
		System.out.println("面积为："+area);
		return area;
	}
	//方式二
	public void findArea() {
		double area=Math.PI*radius*radius;
		System.out.println("面积为："+area);
	}

}
