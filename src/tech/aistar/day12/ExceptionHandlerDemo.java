package tech.aistar.day12;

import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/11 0011
 */
public class ExceptionHandlerDemo {
    public static void main(String[] args) {
        try {
            parse("2012-01-01","yyyy-MM-dd");
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            test();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    /**
     * 最终是由方法的调用者进行积极处理.
     * throws + 异常列表
     * @param sdate
     * @param pattern
     * @return
     * @throws ParseException
     */
    public static Date parse(String sdate, String pattern) throws ParseException, ClassNotFoundException {
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date d = null;

        //对其消极处理 - 将异常抛出去
        d = sdf.parse(sdate);

        Class.forName("java.lang.String");

        return d ;
    }

    public static void test() throws FileNotFoundException {
        //抛出一个运行时异常

        //throw + 非运行时异常.
        //报错的原因是:抛出的是非运行时异常,那么必须要告诉方法的最终调用者
        //需要最终进行积极处理.
        //方法的最终调用者是如何判断出调用的方法确定有尚未处理的异常呢?
        //通过方法的签名后面是否出现了throws语句.
        throw new FileNotFoundException("文件没有找到");//下方的代码将不会执行了

        //System.out.println();

        //throw + 运行时异常.
        //throw new NullPointerException("空指针异常...");
        //System.err.out("...")
    }
}
