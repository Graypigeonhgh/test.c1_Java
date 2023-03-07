package day230223.exer;

public class CylinderTest {
	public static void main(String[] args) {
		
		Cylinder cy=new Cylinder();
		
		
		cy.setRadius(2.3);
		cy.setHeigh(3.6);
		double volume=cy.findVolume();
		System.out.println("圆柱的体积为："+volume);
		
		double area=cy.findArea();
		System.out.println("圆柱的面积为："+area);
		
	}

}
