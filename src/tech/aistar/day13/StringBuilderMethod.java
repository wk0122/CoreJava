package tech.aistar.day13;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:和StringBuffer使用方式是一样的
 * @date 2019/4/11 0011
 */
public class StringBuilderMethod {
    public static void main(String[] args) {
        //1. 利用字符串对象来构建一个StringBuilder对象
        //String类型 - >StringBuilder类型
        StringBuilder builder = new StringBuilder("abc");

        //2. 初始容量的概念 - 默认大小是16
        System.out.println(builder.capacity());

        System.out.println(builder.length());//长度

        //可变的对象 - 增append  删delete  改replace
        StringBuilder sb = new StringBuilder("acdvb");
        //根据指定下标来进行删除
        StringBuilder bd = sb.deleteCharAt(2);
        System.out.println(bd);//acvb
        System.out.println(sb);//acvb
        System.out.println(bd == sb);//true

        //删除指定区间的[start,end)
        System.out.println(sb.delete(1,3));//ab

        //在指定位置处插入序列
        System.out.println(sb.insert(1,"cdv"));//acdvb

        //替换
        System.out.println(sb.replace(1,3,"我们"));//a我们vb

        System.out.println(sb.reverse());//bv们我a

        System.out.println(sb);

        //将StringBuilder - > String
        String str = sb.toString();
        System.out.println(str);

        //String- > int
        int t = Integer.parseInt("10");
        System.out.println(t);

        //关于进制换算的
        System.out.println(Integer.toBinaryString(10));//1010
        System.out.println(Integer.toOctalString(26));//032
        System.out.println(Integer.toHexString(176));//0X00b0

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        //Integer - > String
        Integer ii = 10;
        System.out.println(String.valueOf(ii));
    }
}
