package tech.aistar.day06;

import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:日期处理类
 * @date 2019/4/1 0001
 */
public class DateDemo {
    public static void main(String[] args) {
        //1. 获取当前系统的日期对象
        Date d = new Date();
        System.out.println(d);//Mon Apr 01 14:12:25 CST 2019

        //获取日期的字段
        //2.经常使用的 - 获取距离1970年1月1日的一个时间毫秒数

        //2-1. 简单用来测试程序的性能.
        //2-2. 很多自增长或者类似订单号等都是基于毫秒数[唯一性]进行的算法.

        long time = d.getTime();
        System.out.println(time);//1554099287503

        //让程序睡一秒钟.
//        for(;;){
//            System.out.println(new Date().getTime());
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }

        //获取年份...
        int year = d.getYear()+1900;
        System.out.println("年份:"+year);//119

        //获取月份
        int month = d.getMonth()+1;
        System.out.println("月份:"+month);

        //通过指定的年月日来构建一个Date对象
        Date dd = new Date(2019-1900,4-1,7);//构建周日
        System.out.println("dd:"+dd);

        //获取周几
        int week = dd.getDay();//
        System.out.println("week:"+week);//星期日似是数字0

        //关于设置的
        Date d3 = new Date();
        //修改年份为2018.
        d3.setYear(2018-1900);
        //设置月份
        d3.setMonth(4);
        System.out.println("d3:"+d3);
        System.out.println(d3.getYear()+1900);

        System.out.println("=========================");
        //关于时间毫秒数long和Date之间的转换.
        //long->Date
        long times = 1554100473469L;
        //通过毫秒数构建一个Date对象
        Date dt = new Date(times);
        System.out.println(dt);

        Date d4 = new Date();
        d4.setTime(2554100473469L);
        System.out.println(d4);

        System.out.println("=====");
        //构建出三天之后的日期.
        Date d5 = new Date(new Date().getTime() + 3L*24*60*60*1000);

        //分解:
        //今天的毫秒数new Date().getTime();
        //三天的毫秒数3L*24*60*60*1000

        System.out.println(d5);
    }
}
