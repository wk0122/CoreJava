package tech.aistar.day06.homework;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:数组中不能出现重复的数据
 * @date 2019/4/2 0002
 */
public class ArrayRandomSetDemo {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            //先随机一个数,放入到arr中
            int n = (int) (Math.random()*6+1);
            arr[i] = n;

            //判断n在这之前是否出现过
            for (int j = 0; j < i; j++) {
                if(arr[j] == n){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
