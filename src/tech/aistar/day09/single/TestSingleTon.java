package tech.aistar.day09.single;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/4 0004
 */
public class TestSingleTon {
    public static void main(String[] args) {
        SingleTon s1 = SingleTon.getInstance();
        SingleTon s2 = SingleTon.getInstance();
        System.out.println(s1 == s2);//true

        SingleTonLazy t1 = SingleTonLazy.getInstance();
        SingleTonLazy t2 = SingleTonLazy.getInstance();
        System.out.println(t1 == t2);
    }
}
