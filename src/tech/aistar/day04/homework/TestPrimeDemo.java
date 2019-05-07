package tech.aistar.day04.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/29 0029
 */
public class TestPrimeDemo {
    public static void main(String[] args) {
        test();
    }

    /**
     * 101-199之间
     * 思路:   n ?   -> 质数[只能被1和它本身整除]
     */
    public static void test(){
        //定义一个计数器
        int count = 0;

        for(int i = 101;i<200;i++){
            //定义一个标记位
            boolean flag = true;

            //判断2 - ? 中是否存在一个数能够被i整除.
            for(int j = 2;j<=Math.sqrt(i);j++){
                if(i % j == 0){//存在
                    flag = false;
                    //提高性能,找到一个即可
                    break;
                }
            }

            if(flag){
                System.out.print(i+"\t");
                count ++;
                if(count == 7){
                    System.out.println();
                    count = 0;
                }
            }
        }
    }
}
