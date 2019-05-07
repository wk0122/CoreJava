package tech.aistar.day10.staticmethod;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class TestSup {
    public static void main(String[] args) {
        Sup s = new Sub();
        s.test();
    }
}
