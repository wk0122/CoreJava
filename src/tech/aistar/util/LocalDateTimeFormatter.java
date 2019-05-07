package tech.aistar.util;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:格式化日期和字符串
 * @date 2019/3/28 0028
 */
public class LocalDateTimeFormatter {
    public static void main(String[] args) {
        String str = "1986-04-08 12:30";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTime = LocalDateTime.parse(str, formatter);
        System.out.println(dateTime);

        DateTimeFormatter formatters = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime dateTimes = LocalDateTime.of(1986, Month.APRIL, 8, 12, 30);
        String formattedDateTime = dateTimes.format(formatters); // "1986-04-08 12:30"
        System.out.println(formattedDateTime);

    }
}
