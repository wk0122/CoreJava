package tech.aistar.day03.transfer;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class MemberAddress {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3};
        System.out.println(arr1);
        int[] arr2 = new int[]{1,2,3};
        System.out.println(arr2);
        //==永远比较的是内存地址
        System.out.println(arr1 == arr2);//false
    }
}
