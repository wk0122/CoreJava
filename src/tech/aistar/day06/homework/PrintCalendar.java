package tech.aistar.day06.homework;

import tech.aistar.util.DateUtil;

import java.util.Calendar;
import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/2 0002
 */
public class PrintCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请您输入年份:>");
        int year = sc.nextInt();

        System.out.print("请您输入月份:>");
        int month = sc.nextInt();

        //1.某年某月最大的天数
        int maxDays = DateUtil.getMaxDays(year,month);

        //2.某年某月1号是周几
        int week = DateUtil.getWeekOfDate(year,month,1);

        //3.求出今天是几号
        int date = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);

        //java格式化输出printf

        //System.out.println("\t\t"+year+"年"+month+"月");
        System.out.printf("\t\t%d年%d月\n",year,month);//%d代表的是整数的占位符

        System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t%s\n","日","一","二","三","四","五","六");//%s代表的是字符串的占位符

        //定义一个计数器
        int count = 0;

        //在一号之前输出\t
        for (int i = 0; i < week; i++) {
            System.out.print("\t");
            count ++ ;
        }
        
        //输出日历信息
        for (int i = 1; i <= maxDays; i++) {
            System.out.print(i==date?i+"*\t":i+"\t");
            count++;
            if(count == 7){
                count = 0;
                System.out.println();
            }
        }
    }
}
