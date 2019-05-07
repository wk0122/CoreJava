package tech.aistar.day10.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class Plane extends Vehicle{
    private String wing;

    public Plane() {
    }

    public Plane(int id, String name, int speed, String wing) {
        super(id, name, speed);
        this.wing = wing;
    }

    public String getWing() {
        return wing;
    }

    public void setWing(String wing) {
        this.wing = wing;
    }
}
