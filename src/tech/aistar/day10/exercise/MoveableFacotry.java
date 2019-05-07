package tech.aistar.day10.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:一个接口有可能有多个实现类
 *
 * Moveable m = new MoveImpl();
 *
 * @date 2019/4/8 0008
 */
public class MoveableFacotry {

    //面向接口编程 - 方法的返回类型写成接口
    //方法的返回类型 - 接口的实现类
    public static Moveable getInstance(){
        return new MoveImpl();
    }
}
