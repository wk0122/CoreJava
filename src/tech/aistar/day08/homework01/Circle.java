package tech.aistar.day08.homework01;

import static java.lang.Math.PI;

/**
 * Created by js on 2019/4/3.
 */
public class Circle extends Shape {
    private double r;//半径 - 特有的属性

    public Circle(){

    }

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double circle(){
        double m=2*PI*r;
        return m;
    }

    @Override
    public double area(){
        double n=PI*r*r;
        return n;
    }
}
