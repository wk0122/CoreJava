package tech.aistar.day15.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:字符输出流
 * @date 2019/4/17 0017
 */
public class PrintWriterDemo {
    public static void main(String[] args) {
        //PrintWriter - 自带缓存功能
        //模式 - "装饰器模式"
        PrintWriter out = null;
        try {
           //out = new PrintWriter(new FileWriter("e:/outer.txt"));
           //构建一个自动刷新缓冲区的PrintWriter对象
           //out = new PrintWriter(new FileWriter("e:/outer.txt"),true);

            //构建一个自动刷新缓冲区并且能够进行追加写入的
            //第一个true - 追加写入
            //第二个true - 自动刷新缓存
            out = new PrintWriter(new FileWriter("e:/outer.txt",true),true);

           //print 的底层仍然是write

            //不是调用println就一定立即写入到磁盘中,仅仅是写入到缓存区中
           out.println("success04");
           out.println("詹姆斯05");

           //手动刷新缓冲区 - 将缓冲区的数据持久化到磁盘中
            out.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(out != null){
                out.close();
            }
       }
    }
}
