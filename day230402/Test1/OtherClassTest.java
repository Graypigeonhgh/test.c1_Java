package day230402.Test1;

import org.junit.Test;

/**
 * @description:    System类的使用
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-02-15:40
 **/
public class OtherClassTest {

    @Test
    public void test(){
        String javaVersion=System.getProperty("java.version");
        System.out.println("java的version:"+javaVersion);    //java的version:1.8.0_341java的version:1.8.0_341

        String javaHome=System.getProperty("java.home");    //java的home:C:\Program Files\Java\jdk1.8.0_341\jre
        System.out.println("java的home:"+javaHome);

        String osName=System.getProperty("os.name");
        System.out.println("os的name:"+osName);  //os的name:Windows 11

        String osVersion=System.getProperty("os.version");
        System.out.println("os的version:"+osVersion);    //os的version:10.0

        String userName=System.getProperty("user.name");
        System.out.println("user的name:"+userName);  //user的name:23718

        String userDir=System.getProperty("user.dir");
        System.out.println("user的dir:"+userDir);
        //user的dir:D:\java_code\workspace\IDEA_project230306\Project_day230320\day230402
    }
}
