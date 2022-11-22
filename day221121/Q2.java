package Happy.Excerise2;

//import cn.hutool.core.util.RandomUtil;

/**
 * @Author 木月丶
 * @Description  定义一个二维数组arr，存储数据在控制台输入
 *      1、遍历输出该数组
 *      2、找出该二维数组的一个鞍点（即该元素的位置在该行上最大，该列上最小）
 */
public class Q2 {
    public static void main(String[] args) {
        //声明一个5×5的数组
        int arr[][] = new int[5][5];

//        //用随机数生成数组
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                arr[i][j] = RandomUtil.randomInt(1, 101);
//            }
//        }

        //用随机数生成数组
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*100+1);
            }
        }

        //遍历输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }

        //寻找鞍点(该元素的位置在该行上最大，该列上最小)
        int point;                  //鞍点
        int x;                      //行坐标
        int y;                      //列坐标
        boolean isMax = false;      //是不是行最大，默认不是
        boolean isMin = false;      //是不是列最小，默认不是

        over:for (int i = 0; i < arr.length; i++) {
            label:for (int j = 0; j < arr[i].length; j++) {
                point = arr[i][j];
                //记上坐标
                x = i;
                y = j;

                //判断这个数字是不是这一行中最大的
                for (int k = 0; k < arr[x].length; k++) {
                    //跟大小相同的值，不比较
                    if (point == arr[x][k]){
                        continue;
                    }

                    isMax = point > arr[x][k] ? true : false;
                    if (isMax == false){
                        continue label;
                    }
                }

                //判断这个数是不是这一列中最小的
                for (int k = 0; k < arr.length; k++) {
                    //跟大小相同的值，不比较
                    if (point == arr[k][y]){
                        continue;
                    }

                    isMin = point < arr[k][y] ? true : false;
                    if (isMin == false){
                        continue label;
                    }
                }
                //如果是行最大同时也是列最小，则是鞍点
                if (isMax == true && isMin == true){
                    System.out.println("【" + point + "】是这个矩阵的鞍点，他在第" + (x+1) +"行第" + (y+1) + "列");
                    //由于鞍点只有一个，所以直接跳出所有的循环
                    break over;
                }
            }
        }

        if (isMax == false || isMin == false){
            System.out.println("此矩阵没有鞍点");
        }
    }
}
