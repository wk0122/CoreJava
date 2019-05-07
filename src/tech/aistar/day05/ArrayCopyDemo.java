package tech.aistar.day05;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示: 数组的拷贝方式
 * @date 2019/3/29 0029
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int[] temp = Arrays.copyOf(arr,arr.length+1);
        temp[arr.length] = 10;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {4,5,63,2,1};
        Arrays.sort(arr2);//从小到大
        System.out.println(Arrays.toString(arr2));

        System.out.println("============");

        int[] arr3 = {10,20,30,40,50};

        //在下标3这个位置插入一个值100
        int[] caches = new int[arr3.length+1];
        System.arraycopy(arr3,0,caches,0,3);
        caches[3] = 100;//第四个位置
        System.arraycopy(arr3,3,caches,4,2);
        System.out.println(Arrays.toString(caches));

        System.out.println("=========");

        int[] aa = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(insertOneElement(aa,2,100)));

    }

    /**
     * 指定位置插入指定的值
     * @param arr
     * @param pos
     * @param val
     * @return
     */
    public static int[] insertOneElement(int[] arr,int pos,int val){
        int[] temp = new int[arr.length + 1];
        //{1,2,3,4,5,6,7}   pos = 3
        //pos之前
        System.arraycopy(arr,0,temp,0,pos);

        //pos处
        temp[pos] = val;

        //pos之后
        System.arraycopy(arr,pos,temp,pos+1,arr.length - pos);

        return temp;
    }
}
