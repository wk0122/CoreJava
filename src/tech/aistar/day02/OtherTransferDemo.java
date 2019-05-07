package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/26 0026
 */
public class OtherTransferDemo {
    public static void main(String[] args) {
        //java中默认的整数都是属于int类型.

        //JVM的编译器对待变量和字面量是不同的.

        //此处的是100虽然是一个int类型的.但是由于100是一个字面量
        //JVM中的编译器能够精确判断出100这个字面量永远是100.
        //那么就可以准确判断出100肯定是在byte类型的范围-128~127之间,所以在内部帮助我们进行了类型的转换.
        byte b = 100;
        System.out.println("b:"+b);


        int t = 100;
        //此处是将100放入到变量t中,变量就是不确定的量.它的值是有可能发生变化的.
        //一旦可能发生变化,那么就有可能超出byte类型的范围
        //为了阻止这种风险的发生,需要在编译期间,手动进行强制类型转换.
        byte by = (byte)t;
        System.out.println("by:"+by);
    }
}
