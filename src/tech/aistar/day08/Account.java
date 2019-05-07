package tech.aistar.day08;

import java.util.UUID;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:银行账户类
 * @date 2019/4/3 0003
 */
public class Account {

    private int id;//唯一的

    private String accno;//应该是唯一的.

    private double balance;

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;

        //账号自动生成
        this.accno = UUID.randomUUID().toString();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccno() {
        return accno;
    }

    public void setAccno(String accno) {
        this.accno = accno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("id=").append(id);
        sb.append(", accno='").append(accno).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
