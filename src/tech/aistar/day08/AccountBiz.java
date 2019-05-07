package tech.aistar.day08;

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
    public void addMoney(Account acc,double money){
        if(money<=0){
            System.out.println("对不起!金额不能为负数!");
            return;
        }
       // double d = acc.getBalance();
        //d+=money;

        //一定要重新进行设置
       // acc.setBalance(d);

        acc.setBalance(acc.getBalance()+money);
    }
}
