package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:交换俩个变量的值
 * @date 2019/3/26 0026
 */
public class ChangeVar {
    public static void main(String[] args) {
        //最挫的写法:使用一个中间变量
        int a = 10;
        int b = 20;

        //定义一个中间变量
        int temp = a;
        a = b;
        b = temp;
        System.out.println("a:"+a);
        System.out.println("b:"+b);

        System.out.println("===========华丽丽的分割线=======");

        int m = 10;
        int n = 20;
        //^ - 一个数连续异或同一个数俩次结果是它本身
        //面试题:交换俩个变量的值,不允许出现第三方变量
        m = m ^ n;// m = 10 ^ 20
        n = m ^ n;// n = 10 ^ 20 ^ 20 = 10
        m = m ^ n;// m = 10 ^ 20 ^ 10 = 20
        System.out.println("m:"+m);
        System.out.println("n:"+n);

        System.out.println("============华丽丽的分割线=========");
        //success_自创的
        int x = 10;
        int y = 20;
        y = x^(x = y) ^ y;
        System.out.println("x:"+x);
        System.out.println("y:"+y);
    }
}
