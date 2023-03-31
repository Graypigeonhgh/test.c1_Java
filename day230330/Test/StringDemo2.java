package day230330.Test;

import org.junit.Test;

import java.util.Arrays;

/**
 * @description:获取两个字符串中最大相同子串,如果存在多个长度相同的最大相同子串
 * 此时返回String[]，后面可以用集合中的ArrayList替换，较方便
 * @authod: GreyPigeon mail:2371849349@qq.com
 * @date: 2023-03-31-19:00
 **/
public class StringDemo2 {

    public String[] getMaxSameString(String str1,String str2){
        if (str1 != null && str2 != null) {
            StringBuffer sBuffer=new StringBuffer();
            //区分量字符串大小
            String maxStr = (str1.length() >= str2.length()) ? str1 : str2;
            String minStr = (str1.length() < str2.length()) ? str1 : str2;
            int length = minStr.length();

            int len = minStr.length();
            for (int i = 0; i < length; i++) {

                for (int x = 0, y = length - i; y <= length; x++, y++) {
                    String subStr = minStr.substring(x, y);
                    if (maxStr.contains(subStr)) {
                        sBuffer.append(subStr + ",");
                    }
                }

                if(sBuffer.length()!=0){
                    break;
                }
            }
            String[] split=sBuffer.toString().replaceAll(",$","").split("\\,");
            return split;

        }
        return null;
    }

    @Test
    public void testGetMaxSameString(){
        String str1="adjovsddfhellodfsasdfff";
        String str2="rdhellosdfff";
        String[] maxSameString=getMaxSameString(str1,str2);
        System.out.println(Arrays.toString(maxSameString));
    }
}
