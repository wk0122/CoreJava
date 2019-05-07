package tech.aistar.util;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        //获取当前日期
        LocalDate now = LocalDate.now();
        System.out.println(now.toString());

        //根据年月日来构建
        LocalDate d2 = LocalDate.of(2019,5,1);
        System.out.println(d2.toString());

        //根据字符串来构建
        LocalDate d3 = LocalDate.parse("2012-02-09");
        System.out.println(d3);

        //获取明天
        LocalDate tomorrow = now.plusDays(1L);
        System.out.println(tomorrow);

        //获取本月的最后一天
        LocalDate lastDay = now.withDayOfMonth(1);

        //获取本年的第三天
        LocalDate thirdDay = now.withDayOfYear(3);
        System.out.println(thirdDay);

        //两个日期之间的天数
        long days = thirdDay.until(now, ChronoUnit.DAYS);
        System.out.println(days);

        //修改年份
        LocalDate dd = now.withYear(1991);
        System.out.println(dd);
        //获取年月日
        System.out.println(now.getYear());
        System.out.println(now.getMonth().getValue());
        System.out.println(now.getDayOfMonth());
    }
}
