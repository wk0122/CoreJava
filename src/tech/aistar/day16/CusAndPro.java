package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:生产者和消费者
 * @date 2019/4/18 0018
 */
public class CusAndPro {
    public static void main(String[] args) {
        Box box = new Box();

        //处理不共享代码,如何共享资源
        Thread t1 = new Productor(box);

        Thread t2 = new Customer(box);

        t1.start();

        t2.start();
    }
}

//临界资源
class Box{
    private int content;//盘子中的鸡腿

    private boolean has;//判断盘子中是否有鸡腿

    //给消费者获取的
    public synchronized int getContent() {
        //不能允许消费者线程连续走俩次
        if(has == false){
            //等待...
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        has = false;
        notifyAll();//唤醒所有的线程
        return content;
    }

    //给生产者放
    public synchronized void setContent(int content) {
        //不能允许生产者线程连续走俩次
        if(has){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        has = true;
        notifyAll();
        this.content = content;
    }
}

//生产者
class Productor extends Thread{
    private Box box;

    private int i = 0;

    public Productor(Box box){
        this.box = box;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("放->"+(++i)+"个");
            box.setContent(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

//消费者
class Customer extends Thread{
    private Box box;

    public Customer(Box box){
        this.box = box;
    }

    @Override
    public void run() {
        while(true){
            System.out.println("取->"+box.getContent()+"个");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}