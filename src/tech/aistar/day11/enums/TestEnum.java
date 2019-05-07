package tech.aistar.day11.enums;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestEnum {
    public static void main(String[] args) {
        System.out.println(Director.UP);//默认返回的是声明的枚举常量的名称.
        System.out.println(Director.DOWN);

        System.out.println(Director.UP.name());//返回的是枚举的常量的名称.

        System.out.println(Director.UP.getSign());
    }
}
