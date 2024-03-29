package day230308;

public class CircleTest {
    public static void main(String[] args){

        Circle c1=new Circle();
        Circle c2=new Circle();

        System.out.println("c1的id:"+c1.getId());
        System.out.println("c2的id:"+c2.getId());

        System.out.println("创建圆的个数:"+Circle.getTotal());
        System.out.println("创建圆的个数:"+Circle.getTotal());
    }
}

class Circle {

    private double radius;
    private int id;

    public Circle() {
        id = init++;
        total++;
    }

    private static int total;   //记录创建的圆的个数
    private static int init = 1001;   //static声明的属性被所有对象所共享

    public double findArea() {
        return 3.14 * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public int getId() {
        return id;
    }

    public static double getTotal() {
        return total;
    }

}
