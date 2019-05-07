package tech.aistar.day13;

import java.util.StringJoiner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:jdk8.0新的拼接的方式
 * @date 2019/4/11 0011
 */
public class StringJDK8Demo {
    public static void main(String[] args) {
        String[] arr = {"java","mysql","springboot"};
        //出现的结果是java:mysql:springboot

        String str = "";
        //传统的方式
        for (int i = 0; i < arr.length; i++) {
            //涉及到字符串的+拼接操作,性能比较低的
            str+= (i!=arr.length-1?arr[i]+":":arr[i]);
        }
        System.out.println(str);

        //使用jdk8.0中的String中的join方法来进行拼接操作

        //1. 性能
        //2. 简洁
        String appendStr = String.join(":",arr);
        System.out.println(appendStr);

        //java.lang.StringJoiner
        StringJoiner joiner = new StringJoiner("->");
        //joiner.add("java").add("mysql").add("springboot");
        joiner.add("java");
        joiner.add("mysql");
        joiner.add("springboot");
        System.out.println(joiner);

        StringJoiner stringJoiner = new StringJoiner("=","[","]");
        stringJoiner.add("java");
        stringJoiner.add("mysql");
        stringJoiner.add("springboot");

        System.out.println(stringJoiner.toString());//[java=mysql=springboot]
    }
}
