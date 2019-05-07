package tech.aistar.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 推荐工具类中的方法 - 使用static来进行修饰
 * @author success
 * @version 1.0
 * @description:本类用来演示:日期工具类 - java.util.Date 以及 java.util.Calendar
 * @date 2019/3/28 0028
 */
public class DateUtil {

    /**
     * 根据某年某月求出最大天数
     * @param year 年份
     * @param month 月份
     * @return 最大天数
     */
    public static int getMaxDays(int year,int month){
        //定义一个变量,用来保存最大的天数
        int days = -1;
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
            days = 31;
        } else if(month == 2){
            //days = 28;
            //判断闰年 - 封装成方法了..方法的返回结果就是boolean
//            boolean flag = isLeapYear(year);
//            if(flag){
//                days++;
//            }

//            if(isLeapYear(year))
//                days++;

            //使用jdk内置的判断闰年的方法
            /*GregorianCalendar cal = new GregorianCalendar();
            boolean flag = cal.isLeapYear(year);
            if(flag)
                days++;*/

//            if(new GregorianCalendar().isLeapYear(year))//链式编程
//                days++;

            days = isLeapYear(year) ? 29 : 28;
            //days = new GregorianCalendar().isLeapYear(year)?29:28;

        }else{
            days = 30;
        }
        return days;
    }

    /**
     * 判断年份是否为闰年
     * @param year 传入的年份
     * @return 是闰年就返回true,否则返回false
     */
    public static boolean isLeapYear(int year){
//        if(year % 400 == 0 || (year%4==0 && year%100!=0)){
//            return true;
//        }else{
//            return false;
//        }

//        if(year % 400 == 0 || (year%4==0 && year%100!=0))
//            return true;
//        else
//            return false;

//        if(year % 400 == 0 || (year%4==0 && year%100!=0))
//            return true;
//        return false;

        return year % 400 == 0 || (year%4==0 && year%100!=0);
    }

    /**
     * 格式化日期->String
     * @param date
     * @param pattern 模板
     * @return
     */
    public static String format(Date date,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String str = sdf.format(date);
        return str;
    }

    /**
     * 以后 - 异常是由方法的最终调用者进行try...catch..[积极处理]
     * 将日期形式的字符串转换成Date类型
     * @param sdate
     * @param pattern
     * @return
     */
    public static Date parse(String sdate,String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d = null;
        try {
          d = sdf.parse(sdate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d ;
    }

    /**
     * 通过指定的年月日来构建一个日期对象
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static Date createDate(int year,int month,int date){
        //必须舍弃Date的带参构造-已经过时的.
        //java.util.Calendar日历 - 没有过时
        //void set(int field,int value);
        //void set(int year,int month,int date);
        //简单工厂的方式来进行构建
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR,year);
        cal.set(Calendar.MONTH,month - 1);
        cal.set(Calendar.DAY_OF_MONTH,date);

        //将日历转化成日期
        return cal.getTime();
    }

    /**
     * 求出某年某月某日是周几
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static int getWeekOfDate(int year,int month,int date){
        Calendar cal = Calendar.getInstance();
        //统一进行赋值操作
        cal.set(year,month - 1,date);
        int week = cal.get(Calendar.DAY_OF_WEEK)-1;
        return week;
    }
}
