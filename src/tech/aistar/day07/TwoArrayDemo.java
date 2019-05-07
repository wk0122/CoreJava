package tech.aistar.day07;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/2 0002
 */
public class TwoArrayDemo {
    public static void main(String[] args) {
        //定义一个3行3列 - 规则的二维数组,int[][]
        int[][] arr = new int[3][3];
        //一维数组的时候 - 元素类型[] 变量 = new 元素类型[数组长度];
        //元素类型是可以为基本数据类型和对象类型.
        //对象类型 - 内置对象和自定义对象,枚举,接口,数组[比如int[]]...
        //结论 - 元素的类型决定了数组中可以存放的数据类型.

        //赋值 - 一行一行进行赋值
        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{3,4,5};
        arr[2] = new int[]{6,7,8};

        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[i].length;j++){
//                System.out.print(arr[i][j]+"\t");
//            }
//            System.out.println();

            System.out.println(Arrays.toString(arr[i]));
        }

        //通过增强for循环进行遍历
        for(int[] n:arr){
            for(int t:n){
                System.out.print(t+"\t");
            }
            System.out.println();
        }

        //定义一个不规则的二维数组 - 列是可以省略不写的
        int[][] arr2 = new int[3][];
        arr2[0] = new int[]{1};
        arr2[1] = new int[]{2,3};
        arr2[2] = new int[]{4,5,6};

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
