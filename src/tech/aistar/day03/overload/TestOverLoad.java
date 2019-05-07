package tech.aistar.day03.overload;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class TestOverLoad {
    public static void main(String[] args) {
        int result = OverLoadMethod.test01(10);
        System.out.println(result);

        int n = OverLoadMethod.test01(10,20);
        System.out.println(n);

        OverLoadMethod.print("java");

        double money = OverLoadMethod.print(3.14);
        System.out.println(money);

    }

}
