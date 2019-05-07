package tech.aistar.day08.homework02;

import java.util.Date;

/**
 * Created by Administrator on 2019/4/3 0003.
 */
public class BasedPlusSalesEmployee extends SalesEmployee{

    private double minMoney;//低薪 + 提成

    public BasedPlusSalesEmployee(){

    }

    public BasedPlusSalesEmployee(String name, Date birthday, double monthSalesMoney, double salsePersentage, double minMoney) {
        super(name, birthday, monthSalesMoney, salsePersentage);
        this.minMoney = minMoney;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+minMoney;
    }
}
