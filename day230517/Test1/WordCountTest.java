package day230517.Test1;

import org.junit.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @description:    获取文本上的字符出现的次数，把数据写入文件
 * 思路：
 * 1.遍历文本每一个字符
 * 2.字符出现的次数存在Map中
 *  Map<Character,Integer> map = new HashMap<Character,Integer>();
 *  map.put('a',18);
 *  map.put('你',2);
 *
 *  3.把map中的数据写入文件
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-05-17-21:42
 **/
public class WordCountTest {
    //如果使用的是单元测试，文件相对路径为当前Module
    //如果使用main()测试，文件相对路径为当前工程

    @Test
    public void testWordCount() throws IOException {
        FileReader fr = null;
        BufferedWriter bw = null;
        try {
            //1.创建Map集合
            Map<Character,Integer> map = new HashMap <>();

            //2.遍历每一个字符，每一个字符出现的次数放到map中
            fr = new FileReader("abcd.txt");
            int c = 0;
            while((c = fr.read())!= -1){
                //int 还原 char
                char ch = (char)c;
                //判断char是否在map中第一次出现
                if(map.get(ch) == null){
                    map.put(ch,1);
                }else{
                    map.put(ch,map.get(ch) + 1);
                }
            }

            //3.把map中的数据存在文件count.txt
            //3.1 创建Writer
            bw = new BufferedWriter(new FileWriter("wordcount.txt"));

            //3.2 遍历map，再写出数据
            Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
            for(Map.Entry<Character,Integer> entry : entrySet){
                switch(entry.getKey()){
                    case ' ':
                        bw.write("空格=" + entry.getValue());break;
                    case '\t':  //\t代表tab键字符
                        bw.write("tab键=" + entry.getValue());break;
                    case '\r':  //制表符
                        bw.write("回车=" + entry.getValue());break;
                    case '\n':  //
                        bw.write("换行=" + entry.getValue());break;
                    default:    //字符或汉字
                        bw.write(entry.getKey() + "=" + entry.getValue());
                        break;
                }
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if(bw != null){
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}



