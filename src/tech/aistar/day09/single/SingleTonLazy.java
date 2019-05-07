package tech.aistar.day09.single;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:懒汉模式
 * @date 2019/4/4 0004
 */
public class SingleTonLazy {
    //保证一个类在应用系统中的具体的实例只有一个

    //2. 提供该类的唯一实例
    private static SingleTonLazy instance = null;

    //1.私有化构造 - 不让外界new
    private SingleTonLazy(){
        System.out.println("构造方法被调用了...");
        //比如设置一些连接池的参数.
    }

    //3.提供一个公开的方法来返回这个类的唯一实例
    public static SingleTonLazy getInstance(){
        return instance == null ? instance = new SingleTonLazy():instance;
    }

}
