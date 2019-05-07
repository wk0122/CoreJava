package tech.aistar.day05;

import tech.aistar.util.ArrayUtil;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/29 0029
 */
public class ArrayExercise {
    public static void main(String[] args) {
        //在数组的指定位置插入一个值.
        int[] arr = {1,2,3,4,5,6};

        //arr - > {1,2,3,4,5,6}

        //temp - > {1,2,8,3,4,5,6} <-  arr1

        int[] temp = ArrayUtil.insertOneElement(arr,2,8);
        //System.out.println(Arrays.toString(temp));
        //System.out.println(arr.length);
        arr = temp;
        System.out.println(Arrays.toString(arr));
    }

//    /**
//     * 认识:数组只要确定了,长度绝对是不能改变的.
//     * 插入值,删除值 - 绝对不是对内存中的原来的数组进行直接的操作,所有的操作都是"假象"
//     * 思路:由于插入的是单个值,所以新的数组的长度应该比原来的数组的长度大1个.[导致了为什么数组的解法比后面要学JCF框架要烦]
//     *      1 2 3
//     *      1 5 2 3
//     *
//     * 在数组的指定位置插入某个值
//     * @param arr 即将插入的数组
//     * @param pos 下标
//     * @param val 插入值
//     * @return 插入值之后的新的数组
//     */
//    public static int[] insertOneElement(int[] arr,int pos,int val){
//        //1. 进行参数有效性判断
//        if(null == arr || arr.length == 0){
//            return arr;//返回一个无效的数据即可.
//        }
//        //2. 判断下标
//        if(pos < 0 || pos > arr.length){
//            return arr;
//        }
//        //3.核心的业务操作....
//        //3-1. 定义新的数组,长度比原数组arr大1
//        int[] temp = new int[arr.length+1];
//
//        //3-2.{1,2,3,4,5,6} - arr
//        // pos - 2 -> val 8
//        //遍历原来的数组,将值插入到新的数组中的指定的位置
//        //分三段
//        //第一段:pos之前
//        for(int i=0;i<pos;i++){
//            temp[i] = arr[i];
//        }
//        //第二段:pos位置
//        temp[pos] = val;
//        //第三段:pos位置之后
//        for (int i = pos; i < arr.length; i++) {
//            temp[i+1] = arr[i];
//        }
//
//        //arr = temp;
//        //System.out.println(Arrays.toString(arr)+"==");
//        return temp;
//    }

    /**
     * 根据下标删除["假象"]
     * 思路:1 2 3 4 5 6
     *
     * @param arr
     * @param pos
     * @return
     */
    public static int[] delByIndex(int[] arr,int pos){
       return null;
    }
}
