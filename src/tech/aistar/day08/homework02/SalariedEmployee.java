package tech.aistar.day08.homework02;

import java.util.Date;

/**
 * 固定工资的
 */
public class SalariedEmployee extends Employee {

    private  double monthSalary;//固定工资

    public SalariedEmployee(){

    }

    public SalariedEmployee(String name, Date birthday, double monthSalary) {
        super(name, birthday);
        this.monthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return monthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        this.monthSalary = monthSalary;
    }

    @Override
    public double getSalary(int month) {
        return super.getSalary(month)+monthSalary;//ok
    }
}
