package tech.aistar.day03;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:java.lang.Math数学类中的常用的的方法
 * @date 2019/3/27 0027
 */
public class MathMethodDemo {
    public static void main(String[] args) {
        //double n = Math.floor(3.5);
        //System.out.println(n);

        //返回最大的（最接近正无穷大）`double` 值，该值小于或者等于参数，并等于某个整小数。
        System.out.println(Math.floor(3.5));//3.0
        System.out.println(Math.floor(-3.5));//-4.0

        System.out.println(Math.round(3.5));// floor((n + 0.5) * 2) = (long)Math.floor(3.5+0.5) = 4

        System.out.println(Math.round(-3.6));//(long)Math.floor(-3.6 + 0.5) -> -4

        //1. 求绝对值
        System.out.println(Math.abs(-3));

        //2. 求出最大值
        System.out.println(Math.max(10,20));//20

        //3. 求出最小值
        System.out.println(Math.min(10,20));//10

        //4. 求出次方
        System.out.println((int)Math.pow(2,3));//8

        //5. 开根
        System.out.println(Math.sqrt(9.0));//3.0

        //6. API - 构造方法摘要  方法摘要  字段摘要
        System.out.println(Math.PI);
    }
}
