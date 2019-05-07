package tech.aistar.day03.method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:方法的定义者和方法的调用者不在同一个类中
 * @date 2019/3/27 0027
 */
public class TestNoStaticNoReturnMethod {
    public static void main(String[] args) {
        //1. 创建对象
        NoStaticNoReturnMethod tt = new NoStaticNoReturnMethod();
        tt.test01();
    }
}
