package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:变量的初始化的几种方式
 * @date 2019/3/26 0026
 */
public class InitDataDemo {
    public static void main(String[] args) {
        //先定义一个变量,然后进行赋值
        //变量在使用之前一定要先进行初始化
        int i;
        i = 100;
        System.out.println(i);

        //链式赋值
        int x,z,y=100;//仅仅是y进行初始化操作了
        System.out.println(y);
        x = 900;
        System.out.println(x);

        //表达式赋值
        int a = 100;
        int b = 200;
        int result = a + b;
        System.out.println("result:"+result);

        //利用方法进行赋值

        //java.lang.Math数学类 - 内置的对象类型
        int n = Math.abs(-10);//求绝对值
        System.out.println(n);//10

    }
}
