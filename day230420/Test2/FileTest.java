package day230420.Test2;

import org.junit.Test;

import java.io.File;

/**
 * @description:    File类的使用:File类的3种构造器
 * File类的一个对象，代表一个文件或一个文件目录（俗称；文件夹）
 * File类声明在java.io包下
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-20-22:36
 **/
public class FileTest {

    //如何创建File类的实例
    @Test
    public void test1(){
        //构造器1：
        File file1 = new File("hello.txt");  //相对路径，相对于当前module
        File file2 = new File("D:\\java_code\\workspace\\IDEA_project230306" +
                "\\Project_day230320\\day230420\\src\\day230420\\he.txt");  //绝对路径
        System.out.println(file1);
        System.out.println(file2);

        //构造器2：
        File file3 = new File("D:\\\\java_code\\\\workspace\\\\IDEA_project230306","JavaSenior");
        System.out.println(file3);

        //构造器3：
        File file4 = new File(file3,"hi.txt");
        System.out.println(file4);
    }
}
