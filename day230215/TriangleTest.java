package day230215;

public class TriangleTest {
	public static void main(String[] args) {
		Triangle t1=new Triangle();
		
		t1.setBase(2.0);
		t1.setHeight(5.5);
		System.out.println("base:"+t1.getBase()+",height:"+t1.getHeight());
		System.out.println("面积为："+t1.getBase()*t1.getHeight());
		
	}
}
