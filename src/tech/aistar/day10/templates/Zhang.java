package tech.aistar.day10.templates;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class Zhang extends PlayerTemplates{
    @Override
    public void start() {
        System.out.println("Zhang 帅气开幕...");
    }

    @Override
    public void up() {
        System.out.println("Zhang 唱着登台...");
    }

    @Override
    public void show() {
        System.out.println("Zhang 探清水河演唱会...");
    }

    @Override
    public void end() {
        System.out.println("Zhang 潇洒退场...");
    }
}
