package tech.aistar.day10.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class MoveImpl implements Moveable{

    @Override
    public boolean getSpeed(Vehicle v) {
        //只检测汽车,飞机直接放行
        if(v instanceof ICheckSpeeds){//是一个car
            if(v.getSpeed()>150){
                return false;
            }
        }
        return true;
    }
}
