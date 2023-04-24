package day230423.Test1;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @description:    File练习
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-04-23-22:04
 **/
public class FileDemo {

    @Test
    public void test1() throws IOException {
        File file = new File("D:\\java_code\\haha.txt");
        //创建一个与File同目录下的另一个文件，文件名为haha.txt
        File destFile = new File(file.getParent(),"haha.txt");
        boolean newFile = destFile.createNewFile();
        if (newFile) {
            System.out.println("创建成功");
        }
    }


}
