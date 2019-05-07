package tech.aistar.day04.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:求阶乘
 * @date 2019/3/29 0029
 */
public class TestFactorialDemo {
    public static void main(String[] args) {
        System.out.println(fac(6));
    }

    /**
     * 求某个数的阶乘
     * @param i
     * @return
     */
    public static int fac(int i){
        //定义一个变量
        int total = 1;
        for (int j = 1; j <=i ; j++) {
            total *= j;//total = total * j;//total = 1
        }
        return total;
    }
}
