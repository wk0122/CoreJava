package tech.aistar.day15.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:比字节输入流读取文本文件,效率快
 * @date 2019/4/17 0017
 */
public class ReaderDemo {
    public static void main(String[] args) {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader("src/tech/aistar/day15/io/PrintWriterDemo.java"));

            //读取一行文本
            String line = null;

            while((line = in.readLine())!=null){
                System.out.println(line);
            }

            //单个字符单个字符进行读取
//            int len = -1;
//            while((len = in.read())!=-1){
//                System.out.print((char)len);
//            }

//            while(true){
//                int len = in.read();
//
//                if(len == -1){
//                    break;
//                }
//
//                System.out.print((char)len);
//            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
