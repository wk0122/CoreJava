package tech.aistar.day16;

/**
 * 共享代码,但是不共享资源
 * @author success
 * @version 1.0
 * @description:本类用来演示:写一个类去继承java.lang.Thread
 * @date 2019/4/18 0018
 */
@SuppressWarnings("all")
public class Thread01Test extends Thread{

    //非静态的成员 - 创建对象的时候才会给非静态成员分配空间以及初始化
    //private int tickets = 10;//非静态变量 - 是对象拥有的,对象是不共享非静态成员的.每个对象都拥有自己独立的非静态成员.

    //只会在jvm启动类的时候初始化一次.
    private static int tickets = 10;//静态资源 - 类变量,对象共享的

    @Override
    public void run() {
       //业务操作...
        for (int i = 0; i < 10; i++) {
            //当前正在执行的线程的名称
            //系统会默认分配一个名称Thread-数字
            if(tickets>0) {
                System.out.println(Thread.currentThread().getName() + ":" + tickets--);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
