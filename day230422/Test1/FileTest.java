package day230422.Test1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * @description:    File的常用方法
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-22-16:51
 **/
public class FileTest {

    @Test
    public void test1(){
        File file1 = new File("hello.txt");
        File file2 = new File("d:\\io\\hi.txt");

        System.out.println(file1.getAbsoluteFile());//获取绝对路径
        System.out.println(file1.getPath());        //获取相对路径
        System.out.println(file1.getName());        //获取名称
        System.out.println(file1.getParent());      //获取上层文件目录路径。若无，返回null
        System.out.println(file1.length());         //获取文件长度（字节数）
        System.out.println(new Date(file1.lastModified()));   //获取最后一次的修改时间，毫秒值

    }

    @Test
    public void test2(){
        //以下方法适用于文件目录
        File file = new File("D:\\java_code\\workspace\\IDEA_project230306");

        String[] list = file.list();
        for(String s:list){
            System.out.println(s);  //打印文件名
        }

        System.out.println();

        File[] files = file.listFiles();
        for(File f : files){
            System.out.println(f);  //打印路径
        }
    }

    @Test
    public void test3(){
        File file1 = new File("hello.txt"); //file1要存在
        File file2 = new File("D:\\java_code\\workspace\\" +
                "IDEA_project230306\\Project_day230422\\day230422\\hi.txt");    //file2要不存在
        boolean renameTo = file2.renameTo(file1);
        System.out.println(renameTo);
    }

    @Test
    public void test4(){
        File file1 = new File("hello.txt");

        System.out.println(file1.isDirectory());//是否是文件目录
        System.out.println(file1.isFile());     //是否是文件
        System.out.println(file1.exists());     //是否存在
        System.out.println(file1.canRead());    //是否可读
        System.out.println(file1.canWrite());   //是否可写
        System.out.println(file1.isHidden());   //是否隐藏

        System.out.println();

        File file2 = new File("D:\\java_code\\workspace\\IDEA_project230306");

        System.out.println(file2.isFile());     //是否是文件
        System.out.println(file2.exists());     //是否存在
        System.out.println(file2.canRead());    //是否可读
        System.out.println(file2.canWrite());   //是否可写
        System.out.println(file2.isHidden());   //是否隐藏
    }

    @Test
    public void test5() throws IOException {
         //文件的创建
        File file1 = new File("hi.txt");
        if(!file1.exists()){
            file1.createNewFile();
            System.out.println("创建成功");
        }else{  //文件存在
            file1.delete();
            System.out.println("删除成功");
        }
    }

    @Test
    public void test6(){
        //文件目录的创建
        File file1 = new File("D:\\java_code\\io1");

        boolean mkdir = file1.mkdir();  //如果此文件目录的上层目录不存在,则不创建
        if (mkdir) {
            System.out.println("创建成功1");
        }

        File file2 = new File("D:\\java_code\\io\\io1\\io2");

        boolean mkdir1 = file2.mkdirs();    //如果此文件目录的上层目录不存在,则一并创建上层目录
        if (mkdir1) {
            System.out.println("创建成功2");
        }
        //要想删除成功，Io4文件目录不能有子目录或文件
        File file3 = new File("D:\\java_code\\io\\io1\\io2");
        System.out.println(file3.delete());
    }
}
