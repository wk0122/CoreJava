package tech.aistar.day10.templates;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class TestPlayer {
    public static void main(String[] args) {
        PlayerTemplates yue = new Yue();
        yue.test();
        System.out.println("===");

        PlayerTemplates zhang = new Zhang();
        zhang.test();
    }
}
