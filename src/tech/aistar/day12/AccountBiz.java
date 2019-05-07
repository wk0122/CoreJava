package tech.aistar.day12;

import tech.aistar.day08.Account;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:业务类
 * @date 2019/4/3 0003
 */
public class AccountBiz {

    /**
     * 存钱
     * @param acc
     * @param money
     */
    public void addMoney(Account acc, double money) throws MyBalanceNoEnoughException {
        if(money<=0){
            //System.out.println("对不起!金额不能为负数!");
            //return;
            //抛出一个自定义的非运行时异常
            throw new MyBalanceNoEnoughException("余额不能为负数!");
        }
        acc.setBalance(acc.getBalance()+money);
    }
}
