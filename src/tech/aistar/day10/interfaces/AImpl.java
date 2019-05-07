package tech.aistar.day10.interfaces;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class AImpl implements IA{
    @Override
    public void save() {
        System.out.println("Save()...");
    }

    @Override
    public void delete() {
        System.out.println("Delete....");
    }
}
