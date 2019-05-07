package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:守护线程
 * @date 2019/4/18 0018
 */
public class DaemonDemo {
    public static void main(String[] args) {
        Thread t1 = new T1();
        Thread t2 = new T2();

        //设置t2线程为后台守护线程

        //当后台只剩下守护线程的时候,那么jvm就可以退出
        //退出的时机是不需要关心守护线程是否运行结束的
        t2.setDaemon(true);

        t1.start();

        t2.start();
    }
}

//用户线程
class T1 extends  Thread{
    @Override
    public void run() {

        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread().getName()+"->i am user thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//后台守护线程
class T2 extends Thread{
    @Override
    public void run() {
        for (char i = 'a'; i < 'o'; i++) {
            System.out.println(Thread.currentThread().getName()+"->i am daemon thread"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
