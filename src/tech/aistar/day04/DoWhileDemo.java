package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class DoWhileDemo {
    public static void main(String[] args) {
        int i = 0;
        do{
            //无论条件是否成立,优先执行一次.
            //循环体
            System.out.println("前置循环...");
        }while(i>3);
    }
}
