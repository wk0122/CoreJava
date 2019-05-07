package tech.aistar.day16;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:线程的同步问题
 * @date 2019/4/18 0018
 */
public class AccountDanger implements Runnable{

    //临界资源
    private Account account = new Account();

    public static void main(String[] args) {
        Runnable r = new AccountDanger();

        Thread t1 = new Thread(r,"老婆");
        Thread t2 = new Thread(r,"老公");

        t1.start();
        t2.start();
    }


    @Override
    public void run() {
        for (int i = 0; i <5; i++) {
            get(20);
        }
    }

//    public synchronized void get(double money){//同步方法 - 将整个方法全部锁住了.. 里面的代码 - > 同步代码块. -> 不推荐使用
//        if(money<=account.getBalance()){
//            System.out.println(Thread.currentThread().getName()+",正在取钱...");
//            //为了演示多线程轮流执行 - 并发的问题.
//            try {
//                Thread.sleep(1000);
//                account.setBalance(account.getBalance() - money);
//                System.out.println(Thread.currentThread().getName()+",取款结束,余额为:"+ account.getBalance());
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }else{
//            System.out.println(Thread.currentThread().getName()+"取款的时候,余额不足!");
//        }
//    }

    //同步代码块
    public void get(double money){
        System.out.println("同步代码以外的业务代码...");
        synchronized (account){//锁住是"临界资源"对象
            if(money<=account.getBalance()){
                System.out.println(Thread.currentThread().getName()+",正在取钱...");
                //为了演示多线程轮流执行 - 并发的问题.
                try {
                    Thread.sleep(1000);
                    account.setBalance(account.getBalance() - money);
                    System.out.println(Thread.currentThread().getName()+",取款结束,余额为:"+ account.getBalance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else{
                System.out.println(Thread.currentThread().getName()+"取款的时候,余额不足!");
            }
        }
    }
}
class Account{
    private double balance = 100;

    public double getBalance(){
        return balance;
    }

    /**
     * 取钱的操作
     */
    public void setBalance(double balance){
        this.balance = balance;
    }
}
