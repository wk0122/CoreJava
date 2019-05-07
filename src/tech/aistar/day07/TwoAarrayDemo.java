package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:练习
 * @date 2019/4/2 0002
 */
public class TwoAarrayDemo {

    public static void main(String[] args) {
        printYangHui(5);
    }

    /**
     * @param m 行
     * @return
     */
    public static void printYangHui(int m){
        //定一个二维数组
        int[][] arr = new int[m][];

        //对二维数组进行赋值 - 通过下标一一进行赋值
        for (int i = 0; i < arr.length; i++) {
            //当列省略的情况,在使用之前,一定要先初始化
            arr[i] = new int[i+1];
            //System.out.println(arr[i]);
            for (int j=0;j<arr[i].length;j++){
                if(j == 0 || i == j){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                }
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
