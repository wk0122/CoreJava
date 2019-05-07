package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:join方法
 * @date 2019/4/18 0018
 */
public class Mother extends Thread{
    public static void main(String[] args) {
        Thread m = new Mother();

        m.start();
    }

    @Override
    public void run() {
        System.out.println("老妈正在烧菜...");
        System.out.println("发现没有酱油了...");

        Thread s = new Son();

        s.start();//只要这句代码的时候,有俩个线程都是在执行中...
        try {
            s.join();//让老妈的线程进入到阻塞状态.让儿子的线程参与进来
                    //直到儿子的线程运行结束之后,老妈的线程才会继续执行.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("酱油买回来了.老妈继续做饭..");
    }
}

class Son extends Thread{
    @Override
    public void run() {
        System.out.println("儿子屁颠屁颠出去打酱油了...");
        for (int i = 5; i > 0  ; i--) {
            System.out.println("儿子还有"+i+"min就回来了...");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}