package day230223.exer;

public class Cylinder extends Circle{
	private double heigh;

	public Cylinder() {
		heigh = 2.0;
	}

	public double getHeigh() {
		return heigh;
	}

	public void setHeigh(double heigh) {
		this.heigh = heigh;
	}
	
	public double findVolume() {
		return findArea()*heigh;
	}
}
