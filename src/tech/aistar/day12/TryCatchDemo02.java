package tech.aistar.day12;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:运行时异常的积极处理方式try..catch...  JDK7.0
 * @date 2019/4/10 0010
 */
public class TryCatchDemo02 {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        String s = "2012-09-09";

        try {
            sdf.parse(s);

            Class.forName("java.lang.Strings");

        } catch (ParseException | ClassNotFoundException e) {
            System.out.println("exception...");
            if(e instanceof ParseException){
                //针对不同的异常进行日志的记录...
            }else if(e instanceof ClassNotFoundException){

            }
        } finally {
            System.out.println("finally...");
        }


        try {
            System.out.println("结束...");
            //System.out.println(10/0);
        } finally {
            System.out.println("final....");
        }
    }
}
