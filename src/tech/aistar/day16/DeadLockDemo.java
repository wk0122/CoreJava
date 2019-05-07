package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:死锁
 * @date 2019/4/18 0018
 */
public class DeadLockDemo {
    //模拟临界资源

    //静态域容易造成死锁的问题
    public static Object oo1 = new Object();

    public static Object oo2 = new Object();

    public static void main(String[] args) {
        Thread d1 = new D1();
        Thread d2 = new D2();

        d1.start();

        d2.start();
    }
}

class D1 extends  Thread{
    DeadLockDemo dd = new DeadLockDemo();

    @Override
    public void run() {
        synchronized (dd.oo1){
            System.out.println("===11===");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (dd.oo2){
                System.out.println("===22===");
            }
        }
    }
}

class D2 extends Thread{
    DeadLockDemo dd = new DeadLockDemo();

    @Override
    public void run() {
        synchronized (dd.oo2){
            System.out.println("===33===");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (dd.oo1){
                System.out.println("==44===");
            }
        }
    }
}
