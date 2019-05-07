package tech.aistar.day16;

/**
 * 共享代码,共享资源
 * @author success
 * @version 1.0
 * @description:本类用来演示:写一个类去实现java.lang.Runnable接口
 * @date 2019/4/18 0018
 */
@SuppressWarnings("all")
public class RunnableDemo implements Runnable{

    private int tickets = 10;

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
