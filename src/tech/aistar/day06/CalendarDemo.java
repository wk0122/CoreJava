package tech.aistar.day06;

import java.util.Calendar;
import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:日历处理类
 * @date 2019/4/1 0001
 */
public class CalendarDemo {
    public static void main(String[] args) {
        //利用简单工厂的模式来构建一个日历对象
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);

        //获取年份
        int year = cal.get(1);
        System.out.println("year:"+year);

        //它里面提供给了大量的公开的静态的常量属性
        System.out.println(Calendar.YEAR);

        int years = cal.get(Calendar.YEAR);//提高了程序的可读性
        System.out.println("years:"+years);

        //范围仍然是[0-11]
        int month = cal.get(Calendar.MONTH)+1;
        System.out.println("month:"+month);

        //获取日期
        int date = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println("date:"+date);

        //根据指定的年月日来构建一个日历对象
        cal.set(2019,3,7);//统一进行赋值

        //获取的是周几
        int week = cal.get(Calendar.DAY_OF_WEEK)-1;
        System.out.println("week:"+week);

        //获取小时 - 12时制
        int hours = cal.get(Calendar.HOUR);
        System.out.println("hours:"+hours);

        System.out.println("=====");
        //void set(int field,int val);
        Calendar cal2 = Calendar.getInstance();
        //cal2.set(1,2018);
        cal2.set(Calendar.YEAR,2018);
        cal2.set(Calendar.MONTH,3);
        cal2.set(Calendar.DAY_OF_MONTH,1);
        System.out.println(cal2);

        //将日历转换成日期
        Date dt = cal2.getTime();
        System.out.println(dt);

        //日期转换成日历
        Date dd = new Date(2010-1900,2,1);
        cal2.setTime(dd);
        System.out.println(cal2);
    }
}
