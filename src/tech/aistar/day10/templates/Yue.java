package tech.aistar.day10.templates;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class Yue extends PlayerTemplates{
    @Override
    public void start() {
        System.out.println("Yue 大脸开幕...");
    }

    @Override
    public void up() {
        System.out.println("Yue 滚上台...");
    }

    @Override
    public void show() {
        System.out.println("Yue 耍贱...");
    }

    @Override
    public void end() {
        System.out.println("Yue 被轰下台...");
    }
}
