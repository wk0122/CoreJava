package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:线程之间的礼让
 * @date 2019/4/18 0018
 */
public class YieldDemo {
    public static void main(String[] args) {
        T3 t1 = new T3();
        T3 t2 = new T3();
        t1.setName("t1");
        t2.setName("t2");

        t1.start();

        t2.start();
    }
}

class T3 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);

            if(i==3) {
                //会暂停本线程,让其他线程先执行.
                this.yield();//线程之间的礼让 - 并不是100%成功的
            }
        }
    }
}
