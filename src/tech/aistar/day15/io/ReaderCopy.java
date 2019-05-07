package tech.aistar.day15.io;

import java.io.*;
import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public class ReaderCopy {

    public static void copy(String src,String target){
        //将申请资源的语句放入在try()中,
        //那么不需要手动进行资源的释放和关闭操作了
        //JDK7.0以后提供的语法糖
        try(BufferedReader in = new BufferedReader(new FileReader(src));
            PrintWriter out = new PrintWriter(new FileWriter(target),true)){//自动刷新

            String line = null;

            while((line = in.readLine())!=null){
                out.println(line);
            }
            System.out.println("拷贝成功!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
