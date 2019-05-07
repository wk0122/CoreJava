package tech.aistar.day03.transfer;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class StringParam {
    public static void main(String[] args) {
        String str = "good";
        add(str);
        System.out.println("str->"+str);//good
    }

    private static void add(String str) {
        str += " hello";
        System.out.println("str:"+str);//good hello
    }
}
