package tech.aistar.util;

import java.time.LocalTime;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);//18:20:21.378

        //清除毫秒
        System.out.println(localTime.withNano(0));//18:20:56

        //构造时间
        LocalTime myLocalTime = LocalTime.of(21,9,12);
        System.out.println(myLocalTime);

        //解析字符串
        LocalTime strTime = LocalTime.parse("21:08:12");
        System.out.println(strTime);
    }
}
