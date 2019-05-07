package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:数据类型的转换
 * @date 2019/3/26 0026
 */
public class TypeTransferDemo {
    public static void main(String[] args) {
        //低字节 - > 高字节 -> 自动转换
        //byte->short->int->long

        byte b = 100;
        short s = b;
        System.out.println("s:"+s);

        //int->float 错 都是占4个字节
        int t = 123456789;
        float f = t;
        double d = t;//int[4]->double[8]
        System.out.println("f:"+f);//f:1.23456792E8
        System.out.println("d:"+d);//d:1.23456789E8

        //ascii码
        //gb2312
        //gbk
        //unicode
        //utf-8

        //特殊char - > int
        char c1 = '0';//字符'0'对应的ascill码是48这个数字
        int x = c1;//
        System.out.println("x:"+x);//48

        char c2 = 'a';//97
        int y = c2;
        System.out.println("y:"+y);

        char c3 = 'A';//65
        int z = c3;
        System.out.println("z:"+z);

        //高字节 -> 低字节
        double dd = 3.14;
        float ff = (float) dd;//alt + enter

        //double - > float
        float fa = 3.45F;
        System.out.println("fa:"+fa);

        long tt = 123;
        int m = (int) tt;

        //隐式转换 d/D l/L f/F
    }
}
