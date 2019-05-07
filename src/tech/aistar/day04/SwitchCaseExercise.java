package tech.aistar.day04;

import tech.aistar.util.DateUtil;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class SwitchCaseExercise {
    public static void main(String[] args) {

    }

    /**
     * 显示分数的区间
     * @param score
     * @return
     */
    public static String score(int score){
        String str = "";

        //取整...
        score = score / 10;

        switch (score){
            case 9:
                str = "优秀";
                break;
            case 8:
                str = "良好";
                break;
            case 7:
                str = "中等";
                break;
            case 6:
                str = "及格";
                break;
            default:
                str = "分数无效!";
                break;
        }

        return str;
    }

    /**
     * 求某年某月最大天数
     * @param year
     * @param month
     * @return
     */
    public static int getMaxDays(int year,int month){
        int days;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 2:
                //判断闰年 - 直接调用util包中的方法
                days = DateUtil.isLeapYear(year) ? 29 : 28;
                break;
            default:
                days = 31;
                break;
        }
        return days;
    }
}
