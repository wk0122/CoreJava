package tech.aistar.day10.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:业务接口
 * @date 2019/4/8 0008
 */
public interface Moveable {
    /**
     * 判断是否超速
     * @param v
     * @return
     */
    boolean getSpeed(Vehicle v);
}
