package tech.aistar.day11.enums;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public enum  Director {//默认会去继承java.lang.Enum
    //常量接口中...
    //public static final Director UP = new Director();

    //多个枚举常量,以逗号隔开
    //最后一个枚举常量结束之后,出现;
    //每个枚举常量都是代表该枚举类型的一个具体的实例

    //UP,//相当于public static final Director UP = new Director();
    //DOWN,
   // LEFT,
   // RIGHT;

    UP("上"),//public static final Director UP = new Director("上");
    DOWN("下");

    //可以存在普通属性
    private String sign;

    public String getSign(){
        return sign;
    }

    //枚举类型中可以出现构造方法 - 只能私有的
    private Director(){
        System.out.println("构造被调用了...");
    }

    private Director(String sign){
        this.sign = sign;
    }

    @Override
    public String toString() {
        return sign;
    }
}
