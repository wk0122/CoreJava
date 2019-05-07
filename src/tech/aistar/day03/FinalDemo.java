package tech.aistar.day03;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class FinalDemo {
    public static void main(String[] args) {
        int n = 10;
        //普通变量是可以进行多次赋值的
        n = 20;
        System.out.println(n);

        //使用final关键字的定义的变量叫做常量
        final int MAX_DAYS = 100;
        //常量是不允许改动的
       // MAX_DAYS = 365;
        System.out.println(MAX_DAYS);
    }
}
