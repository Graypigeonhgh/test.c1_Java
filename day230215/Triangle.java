package day230215;

public class Triangle {
	private double base;//底边长
	private double height;//高
	
	//构造器
	public Triangle() {
	}
	
	public Triangle(double b,double h) {
		base=b;
		height=h;
	}
	public void setBase(double b) {
		base=b;
	}
	public double getBase() {
		return base;
	}
	
	public void setHeight(double h) {
		height=h;
	}
	public double getHeight() {
		return height;
	}
}
