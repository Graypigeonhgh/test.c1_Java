package day230330.Test;

import org.junit.Test;

/**
 * @description:    获取一个字符串在另一个字符串中出现的次数
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-31-12:22
 **/
public class StringDemo1 {
    /**
     * @description:获取subStr在mainStr中出现的次数
     * @param:   [mainStr, subString]
     * @authod:  GreyPigeon mail:2371849349@qq.com
     * @return:  int
     * @date:    2023/3/31 12:23
     **/
    public int getCount(String mainStr,String subStr){
        int mainLength=mainStr.length();
        int subLength=subStr.length();
        int count=0;
        int index=0;
        if(mainLength>=subLength){
            //方式一
            //index=-1说明mainStr中已经没有subStr
//            while((index=mainStr.indexOf(subStr))!= -1){
//                count++;
                //每次循环都将一个mainStr中的subStr后的字符串付给mainStr
//                mainStr=mainStr.substring(index+subStr.length());

            //方式二:对一的改进，原理同上
            while((index=mainStr.indexOf(subStr,index))!=-1){
                count++;
                index+=subLength;
            }

            return count;
        }else{
            return 0;
        }
    }

    @Test
    public void testGetCount(){
        String mainStr="abkkabcaabbliikjbaboi";
        String subStr="ab";
        int count=getCount(mainStr,subStr);
        System.out.println(count);
    }
}
