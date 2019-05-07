package tech.aistar.util;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/11 0011
 */
public class TestSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请您输入第一个字符串:>");
        String first = sc.nextLine();
        System.out.println("请您输入第二个字符串:>");
        String two = sc.nextLine();
        StringBuilder builder = method(first,two);
        System.out.println(builder);
    }

    private static StringBuilder method(String first, String two) {
        StringBuilder builder = new StringBuilder();
        int len = first.length();
        int len1 = 0;
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j <=len; j++) {
                String str = first.substring(i,j);
                int length = str.length();
                if(two.contains(str) && length>len1){
                    builder.delete(0,builder.capacity());
                    builder.append(str+" ");
                    len1 = length;
                }else if(two.contains(str) && length == len1){
                    builder.append(str+" ");
                    len1 = length;
                }
            }
        }
        return builder;
    }
}
