package tech.aistar.day08.homework02;

import java.util.Date;

/**
 * Created by Administrator on 2019/4/3 0003.
 */
public class HourlyEmployee extends Employee {
    private  double oneHourMoney;
    private  double hours;

    public HourlyEmployee(){

    }

    public HourlyEmployee(String name, Date birthday, double oneHourMoney, double hours) {
        super(name, birthday);
        this.oneHourMoney = oneHourMoney;
        this.hours = hours;
    }

    public double getOneHourMoney() {
        return oneHourMoney;
    }

    public void setOneHourMoney(double oneHourMoney) {
        this.oneHourMoney = oneHourMoney;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }


    @Override
    public double getSalary(int month) {
        double total = oneHourMoney * hours;//10 * 170

        if(hours>160){//超过的160部分,按照1.5倍工资发放
            total += (hours-160)*0.5;
        }

        return super.getSalary(month) + total;
    }
}
