package day230417.Test2;

/**
 * @description:    自定义泛型类
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-17-19:01
 **/
public class Order<T>{

    String orderName;
    int orderId;

    //类的内部结构就可以使用类的泛型
    T orderT;

    public Order(){}
    public Order(String orderName,int orderId, T orderT){
        this.orderName=orderName;
        this.orderId=orderId;
        this.orderT=orderT;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    //如下的三个方法都不是泛型方法
    public T getOrderT() {
        return orderT;
    }

    public void setOrderT(T orderT) {
        this.orderT = orderT;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderName='" + orderName + '\'' +
                ", orderId=" + orderId +
                ", orderT=" + orderT +
                '}';
    }
}
