package tech.aistar.day12;

import java.io.FileNotFoundException;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/11 0011
 */
public class ExceptionHandlerDemo02 {
    public static void main(String[] args) {
        try {
            new ExceptionHandlerDemo02().c();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void a() throws ClassNotFoundException {
        Class.forName("java.lang.String");
    }

    public void b() throws FileNotFoundException {
        throw new FileNotFoundException("文件不存在!");
    }

    public void c() throws FileNotFoundException {
        try {
            a();//积极处理..,
            b();//进行了消极处理...
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
