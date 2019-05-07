package tech.aistar.day13.homework;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:找最大的公串
 * @date 2019/4/12 0012
 */
public class CommonStr {
    public static void main(String[] args) {
        System.out.println(commonStr("ttttttabcdefqqqarrrrrr","ttttttqqqqaeabcnrrrrrr"));
    }

    /**
     * 假设c1长度小于c2长度
     * "abcde"
     * "deabcf"
     * @param c1
     * @param c2
     */
    private static String commonStr(String c1, String c2) {

        int length = 0;

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < c1.length(); i++) {//长度略小的字符串
            for (int j = i+1; j <=c1.length() ; j++) {

                String subStr = c1.substring(i,j);//所有子串的情况
                //每个公串的长度
                int len = subStr.length();

                if(c2.contains(subStr) && len>length){
                    //System.out.println(subStr+" ");
                    //清空builder
                    builder.delete(0,builder.capacity());
                    builder.append(subStr+"\n");
                    length = len;
                }else if(c2.contains(subStr) && len == length){
                    builder.append(subStr+"\n");
                }
            }
        }
        return builder.toString();
    }
}
