package day230318_project.view;

import java.util.Scanner;

public class TSUtility {
    private static Scanner scanner=new Scanner(System.in);
    
    /**
     * @description:该方法读取键盘，如果用户键入‘1’--‘4’中的任意字符，则方法返回，返回值为用户键入字符
     * @param:   []
     * @authod:  GreyPigeon mail:2371849349@qq.com
     * @return:  char
     * @date:    2023/3/17 22:56
     **/
    public static char readMenuSelection(){
        char c;
        for(;;){
            String str=readKeyBoard(1,false);
            c=str.charAt(0);
            if(c !='1'&&c !='2' &&c !='3' &&c !='4'){
                System.out.println("选择错误，请重新输入");
            }else break;
        }
        return c;
    }

    /**
     * @description:该方法提示并等待，直到用户按回车键后返回
     * @param:   []
     * @authod:  GreyPigeon mail:2371849349@qq.com
     * @return:  void
     * @date:    2023/3/17 23:04
     **/
    public static void readReturn(){
        System.out.println("按回车键继续...");
        readKeyBoard(100,true);
    }

    /**
     * @description:该方法从键盘读取一个长度不超过2位的整数，并将其作为方法的返回值
     * @param:   []
     * @authod:  GreyPigeon mail:2371849349@qq.com
     * @return:  int
     * @date:    2023/3/17 23:05
     **/
    public static int readInt(){
        int n;
        for(;;){
            String str=readKeyBoard(2,false);
            try{
                n=Integer.parseInt(str);
                break;
            }catch(NumberFormatException e){
                System.out.print("数字错误，请重新输入：");
            }
        }
        return n;
    }

    /**
     * @description:从键盘读取‘Y’或‘N'，并将其作为方法的返回值
     * @param:   []
     * @authod:  GreyPigeon mail:2371849349@qq.com
     * @return:  char
     * @date:    2023/3/18 12:39
     **/
    public static char readConfirmSelection(){
        char c;
        for(;;){
            String str=readKeyBoard(1,false).toUpperCase();
            c=str.charAt(0);    //输入一个字符
            if(c=='Y'||c=='N'){
                break;
            }else{
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }

    private static String readKeyBoard(int limit,boolean blankReturn){
        String line="";
        while(scanner.hasNextLine()){
            line = scanner.nextLine();
            if(line.length()==0){
                if(blankReturn) return line;
                else continue;
            }
            if(line.length()<1||line.length()>limit){
                System.out.println("输入长度不大于："+limit+"。错误，请重新输入：");
                continue;
            }
            break;
        }
        return line;
    }

}
