package tech.aistar.day05;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:递归算法
 * @date 2019/3/29 0029
 */
public class TestRecursionDemo {
    public static void main(String[] args) {
       // System.out.println(fei(4));

        //System.out.println(jie(6));

       // System.out.println(getCommon(20,12));

        //System.out.println(getYangHui(5,3));

        printYangHui(6);
    }

    /**
     * 使用递归实现斐波那契数
     * 1 1 2 3 5 8 13 ....
     */
    public static int fei(int n){
        //2. 一定要指定递归的出口 - 否则java.lang.StackOverflowError堆栈溢出
        if(n ==1 || n==2)
            return 1;

        //1. 方法体中调用自己
        return fei(n-1) + fei(n-2);
        //fei(4) -> return -> fei(3) +              fei(2)
        //                    fei(2) + fei(1)    +   1
        //                     1 + 1 + 1 = 3
    }

    /**
     * 递归求出阶乘
     * @param n
     * @return
     */
    public static int jie(int n){
        if(n ==1 )
            return 1;
        return n*jie(n-1);
        //return 6*5*4*3*2*1
    }

    /**
     * 求出俩个数的最大公约数
     */
    public static int getCommon(int m,int n){
        //1. 递归的出口
        if(m % n == 0)
            return n;
        return getCommon(n,m%n);
        //getComonn(12,8)
        //getCommon(8,4)
    }

    /**
     * 获取坐标x,y的杨辉三角对应的数值
     * @param x
     * @param y
     * @return
     */
    public static int getYangHui(int x,int y){
        //递归的出口
        if(y == 1 || x == y)
            return 1;
        return getYangHui(x-1,y-1) + getYangHui(x-1,y);

        //m(4,2) + m(4,3)
        //m(3,1) + m(3,2) + m(3,2) + m(3,3)
        //1 + m(3,2) + m(3,2) + 1
        //    m(2,1) + m(2,2) +  m(2,1) + m(2,2)
    }

    /**
     *
     * @param n 输出几行
     */
    public static void printYangHui(int n){
        for (int i = 1; i <=n ; i++) {
            for(int j=1;j<=i;j++){
                //System.out.print("*\t");

                System.out.print(getYangHui(i,j)+"\t");
            }
            System.out.println();
        }
    }
}
