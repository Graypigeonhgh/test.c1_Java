package day230223.exer;

public class Circle {
	private double radius;
	
	public Circle() {
		//super();默认存在
		radius=1.0;
	}
	
	public void setRadius(double radius) {
		this.radius=radius;
	}
	public double getRadius() {
		return radius;
	}
	
	public double findArea() {
		return Math.PI*radius*radius;
	}
	
}
