package tech.aistar.day13;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:面试题
 * @date 2019/4/11 0011
 */
public class StringDemo {
    public static void main(String[] args) {
        String s1 = "a";
        //默认情况下,s2指向的是堆中的"a"
        String s2 = new String("a");//由于串池中已经存在了"a",仅仅创建了一个对象

        //获取串池中的字符串对象,s2指向的是池中的"a"对象
        System.out.println(s1 == s2.intern());//true
        System.out.println(s1 == s2);//false

        //+在进行拼接的时候会产生新的对象
//        String s3 = "a";
//        String s4 = "b";
//        String result = s3 + s4;//通过字符串变量拼接的 - > 产生新的对象 -> 肯定不在串池中 -> 堆里面
//        System.out.println("ab" == result);//false

        final String s3 = "a";//仍然在串池中,始终在串池中.
        final String s4 = "b";
        String result = s3 + s4;//由于s3和s4是不可变的,拼接的结果也是不可变的 -> 扔在"串池"中去了.
        System.out.println("ab" == result);//true

        String s5 = "a"+"b";//因为此处的"a"和"b"是一个精准的常量.所以"a"+"b"虽然得到的是一个新的对象"ab",但是"ab"肯定也是确定的
                            //肯定也是在串池中.
        System.out.println("ab" == s5);//true

        System.out.println("ab" == new StringDemo().getString());//false
    }

    public String getString(){
        String s = "a";
        return s+"b";
    }
}
