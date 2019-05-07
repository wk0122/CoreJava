package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class TwoForDemo01 {
    public static void main(String[] args) {
      //test01();
        //test02();
       // test03();
        test04();
    }

    /**
     * 输出实心的矩形
     */
    public static void test01(){
        //输出实心的矩形...
        for(int i=0;i<=6;i++){//外层循环控制行数
            for(int j=0;j<=20;j++){//内层循环控制列数
                System.out.print("*");
            }
            System.out.println();//换行
        }
    }

    /**
     * 输出空心的矩形
     */
    public static void test02(){
        for(int i=0;i<=6;i++){//外层循环控制行数
            for(int j=0;j<=20;j++){//内层循环控制列数
                if(i==0 || i==6 || j==0 || j==20) {
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();//换行
        }
    }

    /**
     * 输出实心的直角三角形
     */
    public static void test03(){
        for(int i=0;i<=15;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 输出空心的直角三角形
     */
    public static void test04(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(j==1 || i==9 || i == j)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
