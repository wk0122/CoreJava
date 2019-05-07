package tech.aistar.day08.homework01;

/**
 * Created by js on 2019/4/3.
 */
public class Rect extends Shape{

    private int len;

    private int width;

    public Rect(){

    }

    public Rect(int len, int width) {
        this.len = len;
        this.width = width;
    }

    @Override
    public double circle(){
        int m=(len+width)*2;
        return m;
    }

    @Override
    public double area(){
        int m=len*width;
        return m;

    }
}
