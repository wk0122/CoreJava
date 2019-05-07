package tech.aistar.day12;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:判断字符序列是否满则正则
 * @date 2019/4/10 0010
 */
public class PatternDemo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请你输入字符串:>");
        String line = sc.nextLine();
        //用正则进行参数有效性判断
        //用户名必须是小写字母开头,其余单词是由字母或者数字或者下划线组成,总长度在6-8位.
        //java.util.regex.Pattern - static boolean matches(String regex,CharSequence charsequence);

        //String regex = "[a-z]\\w{5,7}";

        //String regex = "1[3|4|5|7|8]\\d{9}";

        //String regex = "1[3|4|5|7|8][0-9]-[0-9]{4}-[0-9]{4}";

        //测试中文
        String regex = "[\\u4e00-\\u9fa5]+";

        //使用String中的matches方法
        if(Pattern.matches(regex,line)){
            System.out.println("ok");
        }else{
            System.out.println("error");
        }
    }

}
