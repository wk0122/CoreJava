package tech.aistar.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:运行时异常的积极处理方式try..catch...
 * @date 2019/4/10 0010
 */
public class TryCatchDemo {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String s = "2012-09-09";

        try {
            //如果此行代码出现了异常,则会进入到ParseException块中去执行.
            //那么该行try{}中的代码将不再执行.
            sdf.parse(s);
            System.out.println("======分割线1=====");

            Class.forName("java.lang.String");//如果出现了异常,则会进入到ClassNotFoundException
            System.out.println("======分割线2=====");

            return;//结束方法 - 笔试题 - finally块在return语句之前执行.

        } catch (ParseException e) {
            //e.printStackTrace();
            System.out.println("ParseException...");
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("ClassNotFoundException...");
        }finally {
            //通常是用来做一些资源的释放,资源的关闭等操作.
            System.out.println("无论try{}中是否出现异常,finally块中的代码都会执行!");
        }

        System.out.println("结束...");
    }
}
