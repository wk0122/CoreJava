package tech.aistar.util;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:LocalDateTime 可以同时表示日期和时间
 * @date 2019/3/28 0028
 */
public class LocalDateTimeDemo {
    public static void main(String[] args) {
        //获取当前日期时间
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);//2019-03-28T18:27:48.827
        System.out.println(localDateTime.withNano(0));//2019-03-28T18:27:48 清除毫秒

        long sa = localDateTime.atZone(ZoneId.of("Asia/Shanghai")).toInstant().toEpochMilli();
        //构建日期时间
        System.out.println(sa);

        System.out.println(Instant.ofEpochMilli(sa).atZone(ZoneId.of("Asia/Shanghai")).toLocalDateTime());

//        Date date = new Date();
//        Instant instant = date.toInstant();
//        ZoneId zoneId = ZoneId.systemDefault();
//
//        LocalDateTime t = instant.atZone(zoneId).toLocalDateTime();
//        System.out.println("Date = " + date);
//        System.out.println("LocalDateTime = " + t);

        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime localDateTimes = LocalDateTime.now();
        ZonedDateTime zdt = localDateTime.atZone(zoneId);

        Date date = Date.from(zdt.toInstant());

        System.out.println("LocalDateTime = " + localDateTimes);
        System.out.println("Date = " + date);


    }
}
