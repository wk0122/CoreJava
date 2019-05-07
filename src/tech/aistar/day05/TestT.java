package tech.aistar.day05;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/29 0029
 */
public class TestT {
    public static void main(String[] args) {
       int[] arr = {1,2,3};
       int[] temp = add(arr);

       //arr -> {2,3,4}  <- arr1

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }

    private static int[] add(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = arr[i] + 1;
//        }

        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < temp.length; i++) {
            temp[i] = temp[i] + 1;
        }

        return temp;
    }
}
