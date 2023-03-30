package day230328.Test1;

import org.junit.Test;

import java.sql.SQLOutput;

/**
 * @description:    String的常用方法
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-28-21:08
 **/
public class StringTest2 {

    @Test
    public  void test4(){
        String str1="天若有情天亦老" ;
        String str2="天空若有情天空亦老";
        //返回一个新字符串，通过用newChar替换此字符串中出现的所有oldChar
        String str3 = str1.replace("天", "地");
        System.out.println(str3);
        //使用指定的字面值替换序列替换此字符串所有匹配字面值目标序列的子字符串
        String str4=str2.replace("天空","大地");
        System.out.println(str4);

        System.out.println("*******************");
        String str="123hello33worldjava3412hgh890";
        //把字符串中的数字替换成“，”，如果结果开头和结尾有“，”的话去掉
        String string=str.replaceAll("\\d+",",").replaceAll("^,|,$","");
        System.out.println(string);

        str="123456";
        //判断str字符串中是否全部由数字组成，即有1--n个数字组成
        boolean matches=str.matches("\\d+");
        System.out.println(matches);
        String tel="0510-2345679";
        //判断这是否是杭州固定电话
        boolean result=tel.matches("0510-\\d{7,8}");    //开头0510-,之后有7或8位数字
        System.out.println(result);

        System.out.println("*******************");
        str ="hello|world|java";
        String[] strs=str.split("\\|");
        for(int i=0;i< strs.length;i++){
            System.out.println(strs[i]);
        }
        System.out.println();
        str2="hello.world.java";
        String[] strs2=str2.split("\\.");
        for(int i=0;i<strs2.length;i++){
            System.out.println(strs2[i]);
        }

    }

    @Test
    public void test3(){
        String s1="helloworld";
        //测试此字符串是否以指定的后缀结束
        boolean s2=s1.endsWith("rld");
        System.out.println(s2);
        //测试此字符串是否以指定的前缀开始
        boolean s3=s1.startsWith("hel");
        System.out.println(s3);
        //测试此字符串从指定索引开始的子字符串是否以指定前缀开始
        boolean b3=s1.startsWith("ll",2);
        System.out.println(b3);

        String str1="wor";
        //当且仅当此字符串包含指定的char值序列时，返回true；
        System.out.println(s1.contains(str1));
        //返回指定子字符串中最右边出现处的索引
        System.out.println(s1.indexOf("lo"));

        System.out.println(s1.indexOf("ld",1));

        String str2 = "hellornewworld";
        System.out.println(str2.lastIndexOf("or"));
        System.out.println(str2.lastIndexOf("or",9));

        //当存在唯一的一个str时或不存在str时，indexOf(str)和lastIndexOf(str)返回值相同
    }

    @Test
    public void test2(){
        String s1="HelloWorld";
        String s2="helloWorld";
        System.out.println(s1.equals(s2));//false
        //与equals类似，但忽略大小写
        System.out.println(s1.equalsIgnoreCase(s2));//true

        String s3="abc";
        //连接字符串，等价于“+”
        String s4=s3.concat("def");
        System.out.println(s4);

        String s5="abc";
        String s6=new String("abe");
        //比较两个字符串大小，并返回正负值
        System.out.println(s5.compareTo(s6));//涉及到字符串排序

        String s7="北京天安门";
        //返回一个新字符串，下标2开始
        String s8=s7.substring(2);
        System.out.println(s7);
        System.out.println(s8);

        String s9=s7.substring(2,4);    //左闭右开区间
        System.out.println(s9);


    }

    @Test
    public void test1(){
        String s1="HelloWorld";
        System.out.println(s1.length());
        //返回索引处的字符
        System.out.println(s1.charAt(0));
        System.out.println(s1.charAt(9));
        //判断是否空字符串
        System.out.println(s1.isEmpty());

        //使用默认语言环境，将Sting中的所有字符转换为小写
        String s2=s1.toLowerCase();
        //使用默认语言环境，将Sting中的所有字符转换为小写
        String s3=s1.toUpperCase();
        System.out.println(s2);
        System.out.println(s3);

        String s4="   he  llo  world   ";
        //返回字符串的副本，忽略前导空白和尾部空白
        String s5=s4.trim();
        System.out.println("----"+s4+"----");
        System.out.println("----"+s5+"----");

    }
}
