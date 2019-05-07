package tech.aistar.day09.statics;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/4 0004
 */
public class TestStaticDemo {
    public static void main(String[] args) {
        //创建对象
        StaticDemo s1 = new StaticDemo();
        System.out.println(s1.getId());

        StaticDemo s2 = new StaticDemo();
        System.out.println(s2.getId());

        StaticDemo s3 = new StaticDemo();
        System.out.println(s3.getId());
    }
}
