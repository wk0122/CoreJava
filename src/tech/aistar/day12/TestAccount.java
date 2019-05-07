package tech.aistar.day12;

import tech.aistar.day08.Account;

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

        //积极处理
        try {
            biz.addMoney(acc,-150.0);
        } catch (MyBalanceNoEnoughException e) {
            e.printStackTrace();//输出异常的堆栈信息
            //System.out.println(e.getMessage());
            //进行日志的记录...
        }

        System.out.println(acc.getBalance());
    }
}
