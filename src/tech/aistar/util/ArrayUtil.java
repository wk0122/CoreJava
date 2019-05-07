package tech.aistar.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:数组工具类
 * @date 2019/3/29 0029
 */
public class ArrayUtil {

    /**
     * 认识:数组只要确定了,长度绝对是不能改变的.
     * 插入值,删除值 - 绝对不是对内存中的原来的数组进行直接的操作,所有的操作都是"假象"
     * 思路:由于插入的是单个值,所以新的数组的长度应该比原来的数组的长度大1个.[导致了为什么数组的解法比后面要学JCF框架要烦]
     *      1 2 3
     *      1 5 2 3
     *
     * 在数组的指定位置插入某个值
     * @param arr 即将插入的数组
     * @param pos 下标
     * @param val 插入值
     * @return 插入值之后的新的数组
     */
    public static int[] insertOneElement(int[] arr,int pos,int val){
        //1. 进行参数有效性判断
        if(null == arr || arr.length == 0){
            return arr;//返回一个无效的数据即可.
        }
        //2. 判断下标
        if(pos < 0 || pos > arr.length){
            return arr;
        }
        //3.核心的业务操作....
        //3-1. 定义新的数组,长度比原数组arr大1
        int[] temp = new int[arr.length+1];

        //3-2.{1,2,3,4,5,6} - arr
        // pos - 2 -> val 8
        //遍历原来的数组,将值插入到新的数组中的指定的位置
        //分三段
        //第一段:pos之前
        for(int i=0;i<pos;i++){
            temp[i] = arr[i];
        }
        //第二段:pos位置
        temp[pos] = val;
        //第三段:pos位置之后
        for (int i = pos; i < arr.length; i++) {
            temp[i+1] = arr[i];
        }

        //arr = temp;
        //System.out.println(Arrays.toString(arr)+"==");
        return temp;
    }

    /**
     * 根据下标删除["假象"]
     * 思路:1 2 3 4 5 6
     *
     * @param arr
     * @param pos
     * @return
     */
    public static int[] delByIndex(int[] arr,int pos){
        //1. 进行参数有效性判断
        if(null == arr || arr.length == 0){
            return arr;//返回一个无效的数据即可.
        }
        //2. 判断下标
        if(pos < 0 || pos >= arr.length){
            return arr;
        }
        //3. 下标是唯一的.
        int[] temp = new int[arr.length-1];

        //定义一个下标计数器
        int index = 0;

        //4. 遍历原来的数组,将不是pos下标对应的值赋值给temp
        for (int i = 0; i < arr.length; i++) {
            //判断
            if(i != pos){
                //数组是一块连续的空间
                temp [index++] = arr[i];
            }
        }

        return temp;
    }

    /**
     * 对原来的数组进行直接的操作.
     *
     * 1 2 3 4 5 6 7
     *
     * 1 2 4 4 5 6 7
     *
     * 1 2 4 5 5 6 7
     *
     * 1 2 3 5 6 6 7
     *
     * 1 2 3 5 6 7 7
     *
     * @param arr
     * @param pos
     * @return
     */
    @Deprecated
    private static int[] delByIndex2(int[] arr,int pos){
        //1. 进行参数有效性判断
        if(null == arr || arr.length == 0){
            return arr;//返回一个无效的数据即可.
        }
        //2. 判断下标
        if(pos < 0 || pos >= arr.length){
            return arr;
        }

        //3.从pos处开始遍历,然后pos+1位置的值覆盖前面的一个位置上的数据
        for (int i = pos; i < arr.length - 1; i++) {//pos = 5
            //1 2 3 4 5 6 7
            //1 2 3 5 5 6 7
            //1 2 3 5 6 6 7
            //1 2 3 5 6 7 7
            arr[i] = arr[i + 1];
        }

        return Arrays.copyOf(arr,arr.length-1);
    }


    /**
     * 找出数组中的最大值
     * @param arr
     * @return
     */
    public static int findMaxElenment(int[] arr){
        if(null == arr || arr.length==0){
            return -1;
        }
        //假设数组的第一个位置的值就是最大值
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 找出数组中的最小值
     * @param arr
     * @return
     */
    public static int findMinElenment(int[] arr){
        return 0;
    }

    /**
     * 根据元素进行删除["假象"] - 只能改变数组的值,但是永远不可能该数组的长度.
     * 从数组中删除指定的所有的val
     * 思路:先找出元素的个数 - 确定新的数组的长度.
     * @param arr
     * @param val 需要删除的数据
     * @return
     */
    public static int[] delByElement(int[] arr,int val){
        //1.先进行参数有效性判断,如果不存在该元素,则返回-1
        if(null == arr  || arr.length==0){
            return new int[]{-1};//
        }
        //2.定义一个计数器.
        int count = 0;
        //3.遍历arr,找出所有的val的个数
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == val){
                count++;//需要删除的元素的个数
            }
        }
        //4.判断元素是否存在
        if(count == 0){
            return new int[]{-1};
        }
        //确定一个下标计数器
        int index = 0;

        //5.确定新的数组 - 不包含原数组中的val元素
        //一一进行比较,将原数组中不等于val的元素重新赋值到新的数组中.
        int[] temp = new int[arr.length - count];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]!=val){
                temp[index++] = arr[i];
            }
        }
        return temp;
    }

    /**
     * 从数组中找出元素val所有的下标.
     * {1,2,1,2,3,4,2} -> arr
     *
     * @param arr
     * @param val
     * @return
     */
    public static int[] findIndexByElement(int[] arr,int val){
        return null;
    }

    /**
     * 随机打乱一个数组
     * @param arr
     * @return
     */
    public static int[] shuffleArr(int[] arr){
        if(arr==null || arr.length == 0){
            return new int[]{-1};
        }
        //新的数组
        int[] temp = new int[arr.length];
        //定义一个下标计数器
        int index = 0;

        //{1,2,4,5}
        //随机一个下标 -> 新的数组中
        //根据下标删除
        do{
            //随机一个下标
            int n = (int) (Math.random()*arr.length);
            temp[index++] = arr[n];
            //根据下标进行删除
            arr = delByIndex(arr,n);
            if(arr.length == 0){
                break;
            }

        }while(true);



        return temp;
    }

    /**
     * 数组的去重[重复的数据仅仅保留1个] - 数组的排重 - 经典的面试题.
     *
     * 思路:借助于根据元素进行删除的方法.
     *      {1,2,1,1,4,2} - old -> [第二次循环 old->{2,4,2}]
     *      第一步:永远将old中的第一个元素取出来  old[0] = 1;
     *
     *      补充:将第一个元素存放到新的数组中.{1,2,4,0,0,0}
     *
     *      第二步:调用int[] temp = delByElement(old,old[0]);//temp -> {2,4,2} -> {4}
     *
     *      第三步:退出循环的语句,temp中没有元素的时候,跳出

     *      第四步:old = temp;/old原来指向的对象就会变成一个垃圾对象[没有任何引用指向的对象,一个引用只能指向一个对象 - "气球理论"],最终由JVM中的GC进行回收.
     *      int[] t = {1,2,3};
     *      int[] a = {3,4,5}
     *      t = a;
     *
     * @param arr
     * @return
     */
    public static int[] deleletDoubleElements(int[] arr){
        if(arr==null || arr.length == 0){
            return new int[]{-1};
        }
        //1.确定新的数组 - 去完重的数组 - 保险 - 长度和原来的数组相同.
        int[] temp = new int[arr.length];
        //定义一个下标计数器
        int index = 0;
        do{
            //1.将arr中的第一个元素存放到新的数组中
            temp[index++] = arr[0];// {1,2,1,1,4,2} -> temp[0] = 1;
            //2.立即到元素中删除所有的arr[0]
            //并且将删除之后得到的数组的引用重新赋值给arr
            arr = delByElement(arr,arr[0]);//arr = {2,4,2}
            //循环退出的条件
            if(arr.length == 0){
                break;
            }
        }while(true);
        //去除默认的数据 - do not please use any java.util.*
        return Arrays.copyOf(temp,index);
    }

    /**
     * 去重的第二种方式 - 借助于根据下标进行删除.
     *          思路:遍历arr,从数组的第一个元素开始向后遍历并且进行比较.
     *          拿到一个值,和该值后面的所有的值进行比较,如果有相同的,则调用delByIndex方法
     * @param arr
     * @return
     */
    public static int[] delDoubleElements2(int[] arr){
        if(arr==null || arr.length == 0){
            return new int[]{-1};
        }

        //{1,1,1,3,1,2,4,5}
        for(int i = 0; i<arr.length;i++){
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    //根据下标进行删除操作
                    //并且将删除之后的数组的地址重新赋值给arr
                    arr = delByIndex(arr,j);//{1,1,3,1,2,4,5}
                    j --;
                }
            }
        }
        return arr;
    }

    /**
     * 去重方式三 - boolean[]数组
     * arr = {1,2,1,3,1,3};
     * boolean[] flas = {T,T,T,T,T,T}
     * 只要后面和和前面一样的值的时候,就将后面对应的位置的boolean[]的值设置成false
     *             {T,T,F,T,F,F}
     * @param arr
     * @return
     */
    public static int[] delDoubleElements3(int[] arr){
        if(null == arr || arr.length == 0){
            return new int[]{-1};
        }
        //设置一个布尔类型的数组,长度和arr一样,全部设置成true
        boolean[] flags = new boolean[arr.length];
        Arrays.fill(flags,true);//统一进行赋值

        //定义一个count,统计true的个数
        int count = 0;

        //遍历arr,将后边重复位置的值设置成false
        for(int i = 0;i<arr.length;i++){
            for(int j = i + 1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    //将j处的flags数组中的值设置成false;
                    flags[j] = false;
                }
            }
        }

        for(int i=0;i<flags.length;i++){
            if(flags[i]){
                count++;
            }
        }
        //确定新的数组
        int[] temp = new int[count];
        //定义一个下标计数器
        int index = 0;
        for(int i=0;i<arr.length;i++){
            //flags和arr的坐标是一一对应的
            if(flags[i]) {
                temp[index++] = arr[i];
            }
        }
        return temp;

    }

    /**
     * 1. 冒泡排序原理
     * 2. 选择算法原理
     * 3. 快排...算法原理
     */

}
