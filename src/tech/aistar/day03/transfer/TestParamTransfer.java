package tech.aistar.day03.transfer;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class TestParamTransfer {
    public static void main(String[] args) {
        //争议的理论 - 基本类型是按照值传递的方式 .将值复制一份,想象成文件和文件的副本.
        int a = 10;
        int b = 20;
        
        change(a,b);

        System.out.println("a->"+a);//10
        System.out.println("b->"+b);//20

        System.out.println("===华丽丽的分割线===");
        //引用传递 - 对象类型采用引用[地址]传递的方式.-将地址复制一份给变量.
        int[] arr = new int[]{1,2,3};
        add(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println("arr:"+arr[i]);
        }
    }

    /**
     * 将原数组中的每个值+1
     * @param arr
     */
    private static void add(int[] arr) {
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i] + 1;
        }
    }

    /**
     * 交换俩个变量的值
     * @param a
     * @param b
     */
    private static void change(int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("a:"+a);//20
        System.out.println("b:"+b);//10
    }
}
