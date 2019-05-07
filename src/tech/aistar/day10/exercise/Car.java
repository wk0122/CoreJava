package tech.aistar.day10.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:实体类
 * @date 2019/4/8 0008
 */
public class Car extends Vehicle implements ICheckSpeeds{

    private String stWheel;//方向盘

    public Car() {
    }

    public Car(int id, String name, int speed, String stWheel) {
        super(id, name, speed);
        this.stWheel = stWheel;
    }

    public String getStWheel() {
        return stWheel;
    }

    public void setStWheel(String stWheel) {
        this.stWheel = stWheel;
    }
}
