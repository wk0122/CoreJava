package tech.aistar.day10.exercise;

import static tech.aistar.day10.exercise.IVechicleConsts.CAR;
import static tech.aistar.day10.exercise.IVechicleConsts.PLANE;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class TestMoveable {
    public static void main(String[] args) {
//        Vehicle car = new Car();
//        System.out.println(car instanceof ICheckSpeeds);
//
//        Vehicle p = new Plane();
//        System.out.println(p instanceof ICheckSpeeds);

        //构建实体对象
        Car car = (Car) VehicleFactory.getInstance(CAR);
        car.setId(1);
        car.setName("宝马");
        car.setSpeed(160);
        car.setStWheel("方向盘");

        Plane plane = (Plane) VehicleFactory.getInstance(PLANE);
        plane.setId(2);
        plane.setName("飞机");
        plane.setWing("螺旋桨");
        plane.setSpeed(800);

        //创建业务接口的对象
        Moveable move = MoveableFacotry.getInstance();

        System.out.println(move.getSpeed(car));

        System.out.println(move.getSpeed(plane));

    }
}
