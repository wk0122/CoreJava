package tech.aistar.day03.cc;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class TestImport {
    public static void main(String[] args) {
        //java.lang.String
        //java.lang.System
        String s = "hello";
        System.out.println(s);

        //创建一个日期对象
        //java.util.Date
        Date d = new Date();

        //java.text.SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat();

        Random r = new Random();

        System.out.println(Math.pow(2,3));
    }
}
