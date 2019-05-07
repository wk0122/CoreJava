package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/18 0018
 */
public class RunableDemoTest {
    public static void main(String[] args) {
        //构建出Runnable实现类
        Runnable r = new RunnableDemo();

        //利用r来构建第一个线程对象
        //Thread(Runnable r,String name)
        Thread t1 = new Thread(r,"windows01");
        Thread t2 = new Thread(r,"windows02");

        //启动线程
        //start()和run()的区别
        t1.start();//千万不要调用run方法

        t2.start();
    }
}
