package day230321.Test1;

/**               方法二：
 * @description:    创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-21-12:11
 **/
public class ThreadDemo2 {
    public static void main(String[] args) {

        //创建Thread 的匿名子类的方式
        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    if(i%2==0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for(int i=0;i<100;i++){
                    if(i%2!=0){
                        System.out.println(Thread.currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }


}
