package Happy.Excerise2;

import cn.hutool.core.util.RandomUtil;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 木月丶
 * @Description  定义一个一维数组arr，用于存储正整数，存储的数据的在控制台输入。
 *      1、将该数组反转输出
 *      2、将该数组反转在控制台输入一个数，用二分查找法判断该数是否在该数组里
 *      3、新建一个二维数组，将一维数组的中的全部奇数放在二维数组中并从小到大进行排序，全部偶数放到第二行中并从大到小进行排序。遍历输出该二维数组
 *
 */
public class Q1 {
    public static void main(String[] args) {
        //声明一个长度为10的一维数组
        int[] array = new int[10];
        int odd = 0;    //奇数个数
        int even = 0;   //偶数个数

        //将十个 1-100 的随机数放进数组中
        for (int i = 0; i < array.length; i++) {
            array[i] = RandomUtil.randomInt(1, 101);
        }

       //用随机数生成数组
//        for (int i = 0; i < array.length; i++) {
//            array[i] = (int)(Math.random()*100+1);
//        }

        //遍历输出顺便统计一下有多少个奇数有多少个偶数
        for (int i = 0; i < array.length; i++) {
            //统计
            if (array[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }

            //输出
            if (i == 0){
                System.out.print("原数组：\t\t[ " + array[i] + " , ");
            } else if (i == array.length - 1){
                System.out.println(array[i] + " ]");
            } else {
                System.out.print(array[i] + " , ");
            }
        }

        //反转数组
        int[] reverseArray = new int[array.length];
        for (int i = 0,j = array.length - 1 ; i < reverseArray.length ; i++,j--) {
            reverseArray[i] = array[j];
        }

        //遍历输出
        for (int i = 0; i < reverseArray.length; i++) {
            if (i == 0){
                System.out.print("反转数组：\t[ " + reverseArray[i] + " , ");
            } else if (i == array.length - 1){
                System.out.println(reverseArray[i] + " ]");
            } else {
                System.out.print(reverseArray[i] + " , ");
            }
        }

        //提示用户输入
        System.out.print("请输入：");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int low = 0;                    //数组最小索引
        int high = array.length - 1;    //数组最大索引
        int middle;                     //中间数
        boolean isExist = false;        //默认输入数字不存在于数组之中


        //使用数组工具类对其进行从小到大排序
        Arrays.sort(array);

        //二分法查找
        while(low <= high){
            middle = (low + high) / 2;
            if (array[middle] == number){
                System.out.println("【" + number + "】在数组当中");
                isExist = true;
                break;
            } else if (array[middle] > number){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }

        if (!isExist){
            System.out.println("【" + number + "】不在数组当中");
        }

        //定义奇数数组和偶数数组
        int[] oddArray = new int[odd];
        int[] evenArray = new int[even];

        //放数进去
        for (int i = 0,j = 0,k = 0; i < array.length; i++) {
            if (array[i] % 2 == 0){
                evenArray[j++] = array[i];
            }else {
                oddArray[k++] = array[i];
            }
        }
        
        //奇数数组从小到大排序
        Arrays.sort(oddArray);
        
        //偶数数组从小到大排序
        Arrays.sort(evenArray);
        //将偶数数组反转一下，变成从大到小排序
        int[] reverseEvenArray = new int[evenArray.length];
        for (int i = 0,j = reverseEvenArray.length - 1; i < evenArray.length; i++,j--) {
            reverseEvenArray[j] = evenArray[i];
        }

        //看看奇数多还是偶数多，用于创建二维数组
        int length = oddArray.length > evenArray.length ? oddArray.length : evenArray.length;

        int[][] newArray = new int[2][length];

        //将奇数和偶数放进二维数组
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0,x = 0,y = 0; j < newArray[i].length && x < oddArray.length && y < reverseEvenArray.length; j++) {
                if (i == 0 ) {
                    newArray[i][j] = oddArray[x++];
                }else {
                    newArray[i][j] = reverseEvenArray[y++];
                }
            }
        }

        //遍历打印二维数组
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                //解决输出0的问题
                if (newArray[i][j] == 0){
                    continue;
                }
                System.out.print(newArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
