package tech.aistar.day09.statics;

import java.util.Calendar;

//静态导入
import static java.util.Calendar.YEAR;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/4 0004
 */
public class StaticImport {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        //使用static关键字来导入该类中的所有的静态属性
        System.out.println(cal.get(YEAR));
    }
}
