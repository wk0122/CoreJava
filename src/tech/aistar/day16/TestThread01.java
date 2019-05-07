package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/18 0018
 */
public class TestThread01 {
    public static void main(String[] args) {
        //1. 创建一个线程对象
        Thread t1 = new Thread01Test();//默认名称Thread-0

        //2. 创建第二个线程对象
        Thread t2 = new Thread01Test();//默认名称Thread-1

        //设置线程的属性 - 一定是在调用start方法之前进行设置
        //设置线程的名称
        t1.setName("窗口one");
        t2.setName("窗口two");

        //获取线程的优先级 - 默认的就是5,总共是1-10
        //System.out.println(t1.getPriority());
        //System.out.println(t2.getPriority());

        //等级越高 - 只是尽可能保证它率先获取资源被调度,但是不是100%的
        //t1.setPriority(5);

        //t2.setPriority(6);

        t1.setPriority(Thread.MIN_PRIORITY);//1

        t1.setPriority(Thread.MAX_PRIORITY);//10

        //3.启动线程
        //实际上是让jvm去调用run方法 - 最终的调度权限是交给jvm - 计算机
        //启动线程的顺序和它最终执行的先后顺序不一定是一致的.
        t1.start();

        t2.start();
    }
}
