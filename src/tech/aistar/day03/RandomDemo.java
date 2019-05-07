package tech.aistar.day03;

import java.util.Random;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:通过java.util.Random类求随机数
 * @date 2019/3/27 0027
 */
public class RandomDemo {
    public static void main(String[] args) {
        //1.导包
        //2.创建Random对象
        Random r = new Random();//new一个对象的时候,实际上就是去调用这个类中的构造方法[OO]
        //3.通过对象调用方法  int nextInt(int n);//返回的是一个[0,10)之间的一个随机整数
        int n = r.nextInt(10);
        System.out.println("n:"+n);

        //假设:求出3-5之间的随机整数
        //nextInt(3) -> [0,3) + 3 -> [3,6)
        int m = r.nextInt(3)+3;
        System.out.println(m);
    }
}
