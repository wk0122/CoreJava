package tech.aistar.day03;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:求随机数的第二种方式
 * @date 2019/3/27 0027
 */
public class MathDemo {
    public static void main(String[] args) {
        double n = Math.random();//[0.0,1.0)之间的随机小数
        System.out.println(n);

        //求出1-10之间的随机整数.
        //[0.0,1.0)*10 - > [0.0,10.0)+1 ->[1.0,11.0) -> [1,11)
        int m = (int) (Math.random()*10+1);
        System.out.println(m);

        //3-5之间的随机整数
        int x = (int) (Math.random()*3+3);
        System.out.println(x);
    }
}
