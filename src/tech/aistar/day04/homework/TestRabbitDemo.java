package tech.aistar.day04.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:斐波那契数...
 * @date 2019/3/29 0029
 */

public class TestRabbitDemo {
    public static void main(String[] args) {
         //1 1 2 3 5 ...   55
        System.out.println(getNum(1));

    }

    /**
     * 根据位置获取斐波那契数.
     * @param n 位置
     * @return
     */
    public static int getNum(int n){
        //找出特殊的值...
        int start = 1;//n的前2项
        int end = 1;//n的前1项

        //定义一个变量,用来保存前面俩个数相加之和
        int total = 0;

        //由于第一个位置和第二个位置比较特殊
        if(n<=2)
            return 1;
        //从第三个位置开始进行遍历
        for(int i = 3;i<=n;i++){
            total = start + end;//1 + 1 = 2     3
            start = end;//start = 1    2
            end = total;//end = 2  3
        }
        return total;
    }
}
