package tech.aistar.day08;

import tech.aistar.util.ArrayUtil;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 *
 * 随机生成1-5之间的一个整数
 * 然后将这些整数存储到一个一维数组中.长度是15.
 * 1. 然后统计出每个随机数出现的次数[随机数有可能不出现]
 * 2. 根据次数进行降序排列
 * @date 2019/4/3 0003
 */
public class TestBaidu {
    public static void main(String[] args) {
        //定义数组,用来保存随机数
        int[] arr = new int[15];
        //进行赋值操作
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*5+1);
        }
        System.out.println("初始的数组:"+Arrays.toString(arr));

        //1. 随机数和次数保存到二维数组中.
        //求俩个数组的差...
        //1-1. 确定二维数组的行数 - 有的随机数是不出现的.
        //数组的去重操作
        int[] rowsArr = ArrayUtil.deleletDoubleElements(arr);
        System.out.println("rowsArr:"+Arrays.toString(rowsArr));
        int rows = rowsArr.length;

        int[][] temp = new int[rows][2];

        //2. 给temp进行赋值
        //2-1. 统计每个随机数出现的次数.

        //定义一个下标计数器
        int index = 0;

        for (int i = 0; i < rowsArr.length; i++) {
            //定义一个计数器
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(rowsArr[i] == arr[j]){
                    count++ ;
                }
            }
            //其中的一个随机数和出现的次数就确定了.
            //System.out.println(rowsArr[i]+":"+count);

            //一行一行进行赋值
            temp[index++] = new int[]{rowsArr[i],count};
        }

        //排序
        for (int i = 0; i < temp.length; i++) {
            for (int j = i+1; j < temp.length; j++) {
                if(temp[i][1]<temp[j][1]){
                    int[] t = temp[i];
                    temp[i] = temp[j];
                    temp[j] = t;
                }
            }
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j <temp[i].length ; j++) {
                System.out.print(temp[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
