package tech.aistar.day03.transfer;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:笔试题
 * @date 2019/3/27 0027
 */
public class ExerciseTransfer {
    public static void main(String[] args) {
        /*                                                         方法中的参数
             栈                             堆
             x[对象的内存地址]      ->      {2}                  斜着     x
             y[对象的内存地址]      ->      {5}            <-             y

         */
       int[] x = new int[]{2};
       int[] y = new int[]{3};

       change(x,y);

        System.out.println("x->"+x[0]);//2
        System.out.println("y->"+y[0]);//5

    }

    private static void change(int[] x, int[] y) {
        x = y;//将y的值赋值给x
        y[0] = 5;
        System.out.println("x:"+x[0]);//5
        System.out.println("y:"+y[0]);//5
    }
}
