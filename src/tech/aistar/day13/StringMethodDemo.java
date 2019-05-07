package tech.aistar.day13;

import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:字符串中常用的方法
 * @date 2019/4/11 0011
 */
public class StringMethodDemo {
    public static void main(String[] args) {
        //1. 构建一个长度为0的字符串
        String str = new String("abc");

        //感受字符串是不可变的对象
        //在字符串的末尾添加字符串 - 返回的是一个新的字符串
        String m = str.concat("de");

        System.out.println(m);//abcde

        System.out.println(str);//abc

        //2. charAt
        System.out.println(str.charAt(1));//b StringIndexOutOfBoundsException

        //3. 忽略大小写的比较
        System.out.println("abc".equalsIgnoreCase("aBc"));//true

        //4. 转换成小写
        System.out.println("ABC".toLowerCase());
        //转换成大写
        System.out.println("abc".toUpperCase());

        //以..为后缀
        System.out.println("girls.gif".endsWith(".gif"));//true

        System.out.println("     ".length());//5

        //清空字符串的两边的空格
        System.out.println("  j ava  ".trim().length());//5
        System.out.println("      ".trim().length());//0

        String c = "abcdeaba";
        //返回的是字符第一次出现的下标的位置 - 从左到右
        //System.out.println(c.indexOf(98));//ascii码的
        System.out.println(c.indexOf("b"));//1

        //从下标2开始,后面第一次出现b的索引位置,默认是从0开始
        System.out.println(c.indexOf("b",2));//6

        //lastIndexOf - 从右到左

        System.out.println("abc".matches("[a-z]+"));//返回的是boolean

        //替换字符串 - 返回的是一个新的对象
        String girl = "I Love Java";
        String result = girl.replace("Java","Girl");
        System.out.println("girl:"+girl);//I Love Java
        System.out.println("result:"+result);//I Love Girl

        //字符串的切割
        //String[] split(String regex);
        String ip = "192.168.0.169";//
        String[] ips = ip.split("\\.");
        for (String s:ips){
            System.out.println(s);
        }

        String letters = "I23L98O4343V43E4Y2342O2342U";
        //找出里面所有的字母
        String[] ts = letters.split("\\d+");
        for (String s:ts){
            System.out.print(s);
        }

        System.out.println("====");
        //字符串的截取 - 返回仍然是一个新的字符串
        String n = "hello";
        String sn = n.substring(1);//从下标1开始到末尾截取
        System.out.println(sn);
        System.out.println(sn == "ello");//false

        System.out.println("hello".substring(1,3));//[1,3)

        System.out.println("124355".toCharArray());//124355

        //int - > String
        String ss = String.valueOf(20);
        System.out.println(ss+5);


        //StringBuilder - > String
        StringBuilder builder = new StringBuilder("A");
        //1. 通过构造方法进行转化
        String sb = new String(builder);
        System.out.println(sb);

        //2. static String valueOf(Object obj);
        String bs = String.valueOf(builder);
        System.out.println(bs);

        System.out.println("=====");

        //格式化日期为字符串的形式
       // String sdate = String.format("%tF",new Date());//2019-04-11
        String sdate = String.format("%tT",new Date());//14:29:07
        System.out.println(sdate);//
    }
}
