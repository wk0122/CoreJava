package tech.aistar.day08;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:实体类和业务类分开
 * @date 2019/4/3 0003
 */
public class Emp {//自关联
    private int id;

    private String empName;

    private double salary;

    //一个上司拥有多个下属
    private Emp[] emps;

    //空参构造
    public Emp(){

    }

    public Emp(int id, String empName, double salary, Emp[] emps) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
        //构造方法中允许调用setter
        setEmps(emps);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp[] getEmps() {
        return emps;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }
}
