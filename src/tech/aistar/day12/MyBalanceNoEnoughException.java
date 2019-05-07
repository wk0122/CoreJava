package tech.aistar.day12;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:自定义异常
 * @date 2019/4/11 0011
 */
public class MyBalanceNoEnoughException extends Exception{

    public MyBalanceNoEnoughException(){

    }

    public MyBalanceNoEnoughException(String message) {
        super(message);
    }
}
