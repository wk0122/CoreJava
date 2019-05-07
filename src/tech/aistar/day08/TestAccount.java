package tech.aistar.day08;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/3 0003
 */
public class TestAccount {
    public static void main(String[] args) {
        //创建一个业务类
        AccountBiz biz = new AccountBiz();

        Account acc = new Account(1,100.0);

        biz.addMoney(acc,50.0);

        System.out.println(acc.getBalance());
    }
}
