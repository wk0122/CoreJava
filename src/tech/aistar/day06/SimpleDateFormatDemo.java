package tech.aistar.day06;

import tech.aistar.util.DateUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/1 0001
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        //1.创建一个SimpleDateFormat的对象
        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        //如果传入的是一个非法模板,将会抛出java.lang.IllegalArgumentException - 非法参数异常
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");

        //2.格式化日期对象
        //此处的format方法是父类java.util.DateFormat类中提供的.
        String str = sdf.format(new Date());
        System.out.println(str);

        System.out.println("===解析字符串为日期对象==");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");

        //后台接受到的永远是字符串
        String sdate = "2012-12-01";

        try {
            //如果try中的代码能够正常执行,那么将不会执行catch块中的代码
            //反之,如果try中某行出现了异常,那么进入到catch块中.并且try块出现问题的行的下方的代码将不会执行.
            Date dt = sdf2.parse(sdate);//alt+enter

            System.out.println("dt:"+dt);//dt:Sat Dec 01 00:00:00 CST 2012

        } catch (ParseException e) {//如果模板和日期的形式不一致的话,将会抛出一个解析失败异常java.text.ParseException
            //e.printStackTrace();//打印异常的堆栈信息
            //System.out.println("解析失败异常!可能模板不匹配!");
            //将错误信息写入到日志文件中.
        }

        System.out.println("===DateUtil==");
        String s = DateUtil.format(new Date(),"yyyy-MM-dd");
        System.out.println(s);
    }
}
