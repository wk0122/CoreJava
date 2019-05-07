package tech.aistar.day03.overload;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class OverLoadMethod {

    public static int test01(int a,int b){
       return a + b;
    }

    public static int test01(int a){
        return a * 10;
    }

    public static void print(String name){
        System.out.println(name);
    }

    public static double print(double money){
        return money;
    }

}
