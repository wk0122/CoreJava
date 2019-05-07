package tech.aistar.day08.homework02;

import java.util.Date;

/**
 * Created by Administrator on 2019/4/3 0003.
 */
public class SalesEmployee extends Employee{

    private double monthSalesMoney;
    private  double salsePersentage;

    public SalesEmployee(){

    }

    public SalesEmployee(String name, Date birthday, double monthSalesMoney, double salsePersentage) {
        super(name, birthday);
        this.monthSalesMoney = monthSalesMoney;
        this.salsePersentage = salsePersentage;
    }

    public double getMonthSalesMoney() {
        return monthSalesMoney;
    }

    public void setMonthSalesMoney(double monthSalesMoney) {
        this.monthSalesMoney = monthSalesMoney;
    }

    public double getSalsePersentage() {
        return salsePersentage;
    }

    public void setSalsePersentage(double salsePersentage) {
        this.salsePersentage = salsePersentage;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+monthSalesMoney*salsePersentage;
    }
}
