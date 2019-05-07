package tech.aistar.day11.innerclass;

import tech.aistar.day09.supers.Shape;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestOuter {
    public static void main(String[] args) {
        //外部类的对象
        Outer outer = new Outer();

        //1. 演示如何创建成员内部类的对象
        //外部类.内部类 对象 = 外部类对象.new 内部类();
        //Outer.MemberClass memberClass = outer.new MemberClass();
        //memberClass.test();

        Outer.MemberClass m = outer.createMemberClass();
        m.test();

        //2. 测试静态内部类创建对象.
        //外部类.内部类 对象 = new 外部类.内部类();
//        Outer.StaticClass s = new Outer.StaticClass();
//        s.test();

        //静态内部类如果是public修饰的,那么可以上升成为顶级类
        //StaticClass s1 = new StaticClass();
        Outer.StaticClass s1 = new Outer.StaticClass();
        s1.test();

        //局部内部类
        outer.createLocalClass();

        //匿名内部类
        outer.createLoyalClass();

        AA aa = new AA() {
            @Override
            public void test() {

            }
        };
    }
}
