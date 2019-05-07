package tech.aistar.day08.homework02;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2019/4/3 0003.
 */
public class Employee {

    private String name;

    private Date birth;

    public Employee() {
        //里面是可以做些初始化的工作的.
    }

    public Employee(String name, Date birth) {
        this.name = name;
        this.birth= birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth(){
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    /**
     * 如果是生日,奖励100.00
     * @param month
     * @return
     */
    public double getSalary(int month){
        Calendar calendar= Calendar.getInstance();
        //将Date -> Calendar类型 -> 不想使用Date中的过期的方法.
        calendar.setTime(birth);

        //从传入的生日中获取月份
        int birthMonth = calendar.get(Calendar.MONTH)+1;

        if(birthMonth == month){
            return 100.0d;
        }
        return 0.0d;
    }
}
