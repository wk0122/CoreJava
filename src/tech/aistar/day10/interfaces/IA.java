package tech.aistar.day10.interfaces;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public interface IA {//接口
    //如果一个接口中只拥有常量 - 常量接口[JDK5.0后被enum枚举类型替代]
    //1. 接口中的常量只能是公开的静态的常量属性
    //public static final int CAR = 100;

    //简写成:
    //public int CAR = 100;

    //最精简的方式
    int CAR = 100;

    //2. 接口中不能提供构造器

    //3. JDK8.0之前 - 接口中只能是公开的抽象的方法
    //接口的作用 - 告知需要完成的功能有哪些?
    //public abstract void save();

    //精简[推荐]:
    //public void save();

    void save();//增加

    void delete();//删除

    //3. JDK8.0以后 - 支持静态方法的定义 - 接口名.方法名
    public static void crud(){
        System.out.println("CURD STATIC...");
    }

    //4. JDK8.0以后 - 可以通过default关键字来定义一个普通方法
    //可以通过接口的实现类进行调用
    public default void close(){
        System.out.println("close()...");
    }
}
