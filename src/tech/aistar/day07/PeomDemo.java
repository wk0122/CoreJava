package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:古诗
 * @date 2019/4/2 0002
 */
public class PeomDemo {
    public static void main(String[] args) {
       String str1 = "白日依山尽";
       String str2 = "黄河入海流";
       String str3 = "欲穷千里目";
       String str4 = "更上一层楼";

       //放入到二维数组中 - 字符串的本质就是字符数组 - 输出arr1不会出现内存地址.
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        char[] arr3 = str3.toCharArray();
        char[] arr4 = str4.toCharArray();

        //定义一个二维数组
        char[][] arr = {arr1,arr2,arr3,arr4};

        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        System.out.println("==========");

        char[][] temp = new char[5][4];

        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++) {
                temp[j][i] = arr[i][j];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            for (int j = 0; j < temp[i].length; j++) {
                System.out.print(temp[i][j]);
            }
            System.out.println();
        }
    }
}
