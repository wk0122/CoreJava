package tech.aistar.day05;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/29 0029
 */
public class TestFor {
    public static void main(String[] args) {
        int[] arr = {1,2,4};

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] +1;
//        }

        for (int t:arr){
            t = t + 10;
        }

        System.out.println(Arrays.toString(arr));
    }
}
