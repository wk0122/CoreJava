package tech.aistar.day10;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:普通类继承抽象类的话,那么是必须重写抽象方法的.也是可以重写普通方法的.
 * @date 2019/4/8 0008
 */
public class Rect extends Shape02{

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double circle() {
        return 0;
    }

    @Override
    public void test() {
        super.test();
    }
}
