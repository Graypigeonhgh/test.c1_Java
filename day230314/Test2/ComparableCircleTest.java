package day230314.Test2;
/**
 * @description:    接口练习：比较圆半径大小（利用Double 包装类中的方法比较大小）
 * @param:
 * @authod:  GreyPigeon mail:2371849349@qq.com
 * @return:
 * @time:    2023/3/14 22:42
 */

public class ComparableCircleTest {
    public static void main(String[] args) {

        ComparableCircle c1=new ComparableCircle(3.9);
        ComparableCircle c2=new ComparableCircle(3.6);

        int comparaValue=c1.compareTo(c2);
        if(comparaValue>0){
            System.out.println("c1对象大");
        }else if(comparaValue<0){
            System.out.println("c2对象大");
        }else{
            System.out.println("c1与c2对象一样大");
        }
    }
}
