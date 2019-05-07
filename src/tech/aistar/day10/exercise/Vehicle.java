package tech.aistar.day10.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:抽象的父类
 * @date 2019/4/8 0008
 */
public abstract class Vehicle {
    private int id;

    private String name;

    private int speed;

    public Vehicle() {
    }

    public Vehicle(int id, String name, int speed) {
        this.id = id;
        this.name = name;
        this.speed = speed;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
