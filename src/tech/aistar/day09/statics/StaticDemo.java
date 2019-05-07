package tech.aistar.day09.statics;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:静态属性和非静态属性的区别
 * @date 2019/4/4 0004
 */
public class StaticDemo {
    //类变量 - 静态属性 - 类拥有,对象是共享的.
    //无论创建多少给对象,jvm加载类的机会只有一次.
    //初始化的时机 - 当jvm加载类进内存的时候,就会给静态属性分配空间以及初始化.并且只会初始化一次.
    private static int ids = 100;

    //成员变量 - 非静态属性 - 对象拥有的 - 但是对象不共享
    //初始化的实际 - [只要创建对象,那么就会进行初始化]当且仅当创建对象的时候,才会给非静态属性分配空间以及初始化.
    private int id = 1;

    //1. 分配空间
    //2. 给静态成员分配空间
    //3. 构造方法
    public StaticDemo(){
        //this.id = id++;
        this.id = ids ++;
    }

    public int getId(){
        return id;
    }
}
