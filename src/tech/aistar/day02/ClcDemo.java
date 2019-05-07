package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:运算符
 * @date 2019/3/26 0026
 */
public class ClcDemo {
    public static void main(String[] args) {
        //逻辑与
        int a = 10;
        int i = 1;
        System.out.println(a>30 && ++i>2);//false
        System.out.println(i);//1

        //逻辑或
        System.out.println(a<20 || 2<3);//true

        boolean flag = true;
        System.out.println(!flag);//false

        System.out.println(!(2>3));//true

        //按位& - 非短路与
        System.out.println(10 & 8);

        //每个表达式都会执行
        System.out.println(2>1 & 3>4 & 7<8);//false

        //按位或
        System.out.println(10 | 8);//10

        //异或
        System.out.println(10 ^ 8 ^ 8);//10

        String name = "管管";
        //获取字符串的字节数组
//        byte[] arr = name.getBytes();
//
//        for(int j = 0;j<arr.length;j++){
//            arr[j]^=888;//arr[i] = arr[i]^888;
//        }
//
//        //将字节转换成字符串
//        System.out.println(new String(arr));
//
//        for(int j = 0;j<arr.length;j++){
//            arr[j]^=888;//arr[i] = arr[i]^888;
//        }
//
//        System.out.println(new String(arr));

    }
}
