package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:break和continue
 * @date 2019/3/28 0028
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("==测试断点==");
        System.out.println("==测试断点==");
        System.out.println("==测试断点==");
        for(int i = 0;i<=5;i++){
            if(i==4){
                //break;//跳出循环.
                continue;//跳过本轮循环[continue以下的代码不再执行],继续下一轮循环
            }
            System.out.println(i);
        }
        System.out.println("==测试断点==");

        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                if(j==3){
                    break;//只是跳出所在的内层循环
                }
                System.out.println(i+""+j);
            }
        }
    }
}
