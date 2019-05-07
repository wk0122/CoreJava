package tech.aistar.day15.charset;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public class CharSetDemo {
    public static void main(String[] args) {
        String name = "王静静";
        try {
            //GBK下 - 数字,字母,符号 - 占单个字节
            //1个中文占2个字节

            //UTF-8 数字,字母,符号 - 占单个字节
            //1个中文占3个字节
            byte[] gbks = name.getBytes("utf-8");//用GBK的方式进行编码

            System.out.println(Arrays.toString(gbks));
            System.out.println(gbks.length);//如果是gbk,中文是占2个字节

            //解码:字节 -> 字符
            //字节数组 -> 字符串

            //乱码问题:编码和解码的方式不一致
            //String decode = new String(gbks,"gbk");
            String decode = new String(gbks,"utf-8");
            System.out.println(decode);


        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
