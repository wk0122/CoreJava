package tech.aistar.day05;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:数组长度
 * @date 2019/3/29 0029
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //1.对象类型的默认值都是null
        int[] arr1 = null;//在内存堆中,并没有数组对象
        //2. 初始化一个数组
        //int[] arr2 = {};
        int[] arr3 = new int[0];//在内存中,存在数组对象.

        //java.lang.NullPointerException - 空指针异常 - 使用null.成员的时候
        if(null==arr1 || arr1.length==0){
            System.out.println("数组错误!");
        }else{
            System.out.println("数组正确!");
        }
        //String s = null;String s = "";

        System.out.println("======");

//        String str = new String("hello");
//        System.out.println(str.toString());

        //char[] chars = new char[2];
        //System.out.println(chars);//比较特殊 - 字符串的本质就是字符数组 - 打印char[],底层会转换成String类型进行输出

        //初始化一个数组,长度是3
        int[] arr2 = new int[3];
        System.out.println(arr2);//[I@28d93b30

        //赋值方式 -
        // 1 - 通过下标一一进行赋值
        System.out.println(arr2[0]);//提供给一个默认值的.0

        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;

        //2 - 通过for循环进行赋值
        int[] arr5 = new int[3];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = (int) (Math.random()*100+1);
        }
        System.out.println("arr5:"+Arrays.toString(arr5));

        //3 - 定义数组的同时进行赋值
        int[] arr6 = {4,5,6};
        System.out.println("arr6:"+Arrays.toString(arr6));

        //4 - 同上
        int[] arr7 = new int[]{6,7,8};
        System.out.println("arr7:"+Arrays.toString(arr7));

        //5 - 通过java.util.Arrays数组工具类中的static void fill(boolean[] val);
        boolean[] flags = new boolean[10];
        Arrays.fill(flags,true);
        System.out.println("flags:"+Arrays.toString(flags));

        //数组的遍历方式
        //1. 通过下标一一输出
        //System.out.println(arr2[3]);//java.lang.ArrayIndexOutOfBoundsException - 下标的范围[0,数组长度-1]

        //2. 通过普通for循环进行输出
        //注意点1:如果数组中的数据量比较大的话,那么我们需要提前将arr2.length拎出来.
        //注意点2:数组的下标不允许使用long类型
        int len = arr2.length;
        for (int i = 0; i < len; i++) {
            System.out.println(arr2[i]);
        }
        System.out.println("====");

        //3.jdk5.0提供的foreach语句 - 增强for循环
        //在遍历的时候是不允许进行修改操作的.
        for (int n:arr2){
            //n = 90;
            System.out.println(n);//n代表的就是具体的元素
        }

        //4. 通过java.util.Arrays数组工具类
        //static String toString(int[] val);
        System.out.println(Arrays.toString(arr2));//[10, 20, 30]

        //5. 自定义数组的输出方式 - 输出的方法 - (10,20,30)
    }
}
