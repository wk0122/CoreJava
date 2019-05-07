package tech.aistar.util;

import java.util.Arrays;

/**
 * 1. 冒泡
 * 2. 选择
 * 3. 快速
 * 4. 插入
 * 5. 归并
 *
 * @author success
 * @version 1.0
 * @description:本类用来演示:数组排序
 * @date 2019/4/1 0001
 */
public class ArraySort {
    public static void main(String[] args) {
        int[] arr =    {5,2,8,9,2,3,4,9};
        //bubbleSort(null);
        //selectSort(arr);
        //System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));

    }

    /**
     * 快速排序 - 性能要快的 - 体现的是"二分法" - "分治的思想"
     * 1. 找出基准数 - 以它为中间值,数组中比这个基准数小的值,全部放在左边.比这个基准数大的值全部放在右边.
     *                 假设这个基准数是数组中的第一个元素,比如:6
     * 2. 确定中轴数[基准数的下标]
     *
     *          6,8,5,7,1,3,10,2,9
     * 指针     i →           ←j
     *
     * 注意点:每次先移动j
     *        时刻保证i<j
     *
     * 走法:先移动j,找到比基准数小的值,停止
     *           6,8,5,7,1,3,10,2,9
     *      指针 i →        ←j
     *
     *      接着移动i->,直到遇到比基准数大的值停止.
     *           6,8,5,7,1,3,10,2,9
     *      指针  i →       ←j
     *
     *      交换i和j下标对应的位置上的俩个数
     *           6,2,5,7,1,3,10,8,9
     *      指针  i →       ←j
     *
     *           6,2,5,3,1,7,10,8,9
     *          指针  i   j
     *
     *            1,2,5,3,6,7,10,8,9
     *
     *            1,2,5,3  ->假设基准数是1
     *           i-> ←j
     *
     *
     *
     * @param arr
     * @param  low 左边的下标
     * @param high 右边的下标
     */
    public static void quickSort(int[] arr,int low,int high){
        if(null == arr || arr.length==0){
            System.err.println("不是有效的数组");
            return;
        }

        int i,j,temp,t;
        if(low>high)
            return;//递归的出口

        i = low;
        j = high;

        //思路:假设数组中的第一个元素为基准数
        temp = arr[low];

        //{5,2,8,9,2,3,4,9};
        while(i<j){
            //先移动j - 数组右边的指针
            //负责寻找比基准是要小的值,找到就停止.
            //{5,2,8,9,2,3,4,9};
            //temp = 5;arr[j] = 9
            while(temp<=arr[j] && i<j){
                j--;
            }

            //移动i - 数组左边的指针
            //负责寻找比基准数要大的值.
            while(temp>=arr[i] && i<j){
                i++;
            }

            //交换俩个位置上的值[i和j]
            if(i<j){
                t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
            //中轴的位置
           // System.out.println("i"+i);

            //将假设出来的基准值放入到正确的位
        }
        arr[low] = arr[i];
        arr[i] = temp;
        //System.out.println(Arrays.toString(arr));
        //System.out.println("j:"+j);
        quickSort(arr,0,j-1);
        System.out.println("high:"+high);
        quickSort(arr,j+1,high);
    }

    /**
     * 选择算法 - 对冒泡的一个改进 -> O(n2)
     *
     * 依次从数组中取值,然后和后面所有的值进行比较.并不是俩俩进行比较.
     * {5,3,1,2,4}
     *
     * 3,5,1,2,4
     *
     * 1,5,3,2,4
     *
     * 1,2,3,5,4
     *
     * 思路:
     * @param arr
     * @return
     */
    public static void selectSort(int[] arr){
        if(null == arr || arr.length==0){
            System.err.println("不是有效的数组");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    arr[i] = arr[i]^arr[j];
                    arr[j] = arr[i]^arr[j];
                    arr[i] = arr[i]^arr[j];
                }
            }
        }
    }

    /**
     * 冒泡算法:
     *          时间复杂度O(n2)
     *         相邻的位置俩俩比较.劣势 - 比较次数比较多,交换次数也比较
     *
     *         第一次循环 - 最大值可以确定 - 放在数组的最右边
     *
     * 从小到大
     * @param arr
     */
    public static void bubbleSort(int[] arr){

        if(null == arr || arr.length==0){
            System.err.println("不是有效的数组");
            return;
        }

        for (int i = 0; i < arr.length; i++) {//外层循环控制的是循环的次数
            //每次循环 - 最大值可以确定 - 放在数组的最右边
            for (int j = 0; j < arr.length-1; j++) {//内层循环是俩俩进行比较的次数
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                }
            }
        }
    }

}
