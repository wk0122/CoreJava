package tech.aistar.day08.homework02;

import tech.aistar.util.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2019/4/3 0003.
 */
public class TestEmployee {
    public static void main(String[] args) {

        Employee[] employees=new Employee[4];
//        Employee employee1=new SalariedEmployee("前台","4/2",3000.0);
//        Employee employee2=new HourlyEmployee("小时工","11/7",15.0,180);
//        Employee employee3=new SalesEmployee("销售员","5/4",50000,0.1);
//        Employee employee4=new BasedPlusSalesEmployee("高级销售","7/9",30000,0.15,2000);
//        employees[0]=employee1;
//        employees[1]=employee2;
//        employees[2]=employee3;
//        employees[3]=employee4;

        Employee e1 = new SalariedEmployee("tom", DateUtil.createDate(2012,4,5),2800.0);
        System.out.println(e1.getSalary(4));

        System.out.println(DateUtil.format(e1.getBirth(),"yyyy-MM-dd"));
    }
}








