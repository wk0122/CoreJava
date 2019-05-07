package tech.aistar.day12;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:非运行时异常
 * @date 2019/4/10 0010
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        //非运行时异常通常是不需要进行手动处理的
        //如果某行出现了非运行时异常,则异常行下方的代码将不会执行.
        //System.out.println(10/0);//java.lang.ArithmeticException

        //System.out.println("非运行时异常");

        //一般而言,需要通过编程的谨慎来断掉非运行时异常
        //有的时候,我们也是希望来处理这个非运行时异常的.

        //场景:程序可以通过日志来记录下异常出现的信息.
        //并且异常行下方的代码能够继续执行.

        //ctrl+alt+t
        try {

            //出现了对应的异常,找到对应的catch
            //支持子类 - 父类
            System.out.println(10/0);
            
        } catch (Exception e) {
            //e.printStackTrace(); //输出异常的堆栈信息
            System.out.println("日志保存了异常信息了..");
        }

        System.out.println("非运行时异常");
    }
}
