package tech.aistar.day10.exercise;

import static tech.aistar.day10.exercise.IVechicleConsts.CAR;
import static tech.aistar.day10.exercise.IVechicleConsts.PLANE;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:简单工厂类
 * @date 2019/4/8 0008
 */
public class VehicleFactory {
    public static Vehicle getInstance(int type){
        Vehicle v = null;
        switch (type){
            case CAR:
                v = new Car();
                break;
            case PLANE:
                v = new Plane();
                break;
        }
        return v;
    }

}
