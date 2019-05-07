package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:变量的定义和使用
 * @date 2019/3/26 0026
 */
public class DataTypeDemo {
    public static void main(String[] args) {
        //定义一个byte类型变量,并且进行赋值
        //变量赋值的第一种方式 - 在声明变量的同时进行赋值
        //赋值的时候,需要注意类型的范围
        byte b = 100;
        System.out.println("b:"+b);

        //定义一个short类型变量
        short s = 20;
        System.out.println("s:"+s);

        //定义一个int类型的变量
        int i = 200;
        System.out.println("i:"+i);

        //定义一个长整型的变量
        long o = 300;//ok

        //long类型推荐的赋值方式
        //在整数后面加上L/l
        long oo = 500L;//500l
        System.out.println("o:"+o);
        System.out.println("oo:"+oo);

        //JDK7.0以后,支持_
        long balance = 1_234_567L;//提高可读性
        System.out.println("balance:"+balance);

        //定义一个double类型都变量
        double money = 100.56;
        System.out.println("money:"+money);

        //推荐在小数后面加上D/d
        double m = 3.14d;
        System.out.println("m:"+m);

        //定义一个float类型的变量
        //看到一个小数,默认就是double类型
        //在小数后面加上F/f
        float f = 128.9F;
        System.out.println("f:"+f);

        //定义布尔类型
        boolean flag = true;
        System.out.println("flag:"+flag);

        //定义char类型 - 重点
        //使用的是单引号包裹,里面只能出现单个字符.
        char c = '我';
        System.out.println("c:"+c);
    }
}
