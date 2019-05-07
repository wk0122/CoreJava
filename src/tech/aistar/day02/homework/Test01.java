package tech.aistar.day02.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/26 0026
 */
public class Test01 {
    public static void main(String[] args) {
        //double类型的数据在计算的时候会有精度的丢失.
        //System.out.println(0.05 + 0.07);//0.12000000000000001

        //1. 定义一个变量 - 杯数
        int cup = 5;

        //2.定义价格
        double price = 10.0d;

        //3.定义一个变量 - 用来保存总的价格
        double total = 0.0d;

        //10 5 10 5 10
        //4.无论奇数还是偶数杯
        total = (cup/2)*price+(cup/2)*(price/2);

        //5.判断杯数的奇偶性
        if(cup % 2 != 0){
            total += price;//加上整杯的价格即可
        }

        System.out.println("总价是:"+total);

    }
}
