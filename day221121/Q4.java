import java.util.Scanner;

/**
 * @Author 木月丶
 * @Description 在控制台中输入任意一个不超过五位数的正整数：
 *              ①求它是几位数  ②逆序打印（例：6427输出为7246；5430输出为345）
 */
public class Q4 {
    public static void main(String[] args) {
        int wei = 0;
        int result = 0;
        System.out.print("请输入一个不超过五位数的正整数：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int copyNumber = number;

        while(copyNumber > 0){
            copyNumber = copyNumber / 10;
            wei++;
        }
        System.out.println("这是一个" + wei + "位数");

        int temp;
        int copyWei = wei;
        for (int i = 0; i < wei; i++,copyWei--) {
            temp = number % 10;
            number /= 10;
            result += (int) (temp * Math.pow(10, copyWei-1));
        }

        System.out.println("逆序输出结果为：" + result);
    }
}
