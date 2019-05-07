package tech.aistar.day13;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/11 0011
 */
public class IntegerDemo {
    public static void main(String[] args) {
        // 如果传入了一个非数字形式的字符,就会抛出java.lang.NumberFormatException: For input string: "a"
        //Integer m1 = new Integer("a");
        //1. 利用字符串来构建一个Integer对象
        //String - > Integer
        Integer m = new Integer("10");
        Integer n = new Integer("10");
        System.out.println(m == n );//false
        System.out.println(m);

        //2. 利用基本类型来构建一个Integer对象
        //int - > Integer
        Integer x = new Integer(10);
        Integer x1 = new Integer(10);
        System.out.println(x == x1);//false

//        JDK5.0以后提供了自动解封箱的功能.
//        封箱:基本类型 - > 包装类型
//        解箱:包装类型 - > 基本类型

          //封箱
        Integer y = 10;//int - > Integer

        //解箱
        int t = y;//Integer - > int

        //基本类型和包装类型比较的时候
        //包装类型会自动转换成基本类型之后再进行比较
        Integer o1 = new Integer(10);
        int o2 = 10;
        System.out.println(o1 == o2);//true

        //Integer - > int
        Integer o3 = new Integer(100);
        int o4 = o3.intValue();
        System.out.println(o4);

        //String -> Integer
        Integer w = Integer.valueOf("100");
        System.out.println(w);

        //int -> Integer
        //当传入的数字范围在[-128~127]之间,底层并没有创建新的对象,而是直接从缓存中获取的.
        Integer s1 = Integer.valueOf(-129);
        Integer s2 = Integer.valueOf(-129);
        System.out.println(s1 == s2);

    }
}
