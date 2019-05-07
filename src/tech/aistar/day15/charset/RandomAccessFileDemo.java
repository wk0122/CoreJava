package tech.aistar.day15.charset;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:随机访问流
 * @date 2019/4/17 0017
 */
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        //构建的是一个只读的随机访问流对象
        try(RandomAccessFile in = new RandomAccessFile("src/tech/aistar/day15/charset/abc.txt","r")){

            //获取文件的大小
            long fileSize = in.length();
            //System.out.println(fileSize);
            //定义一个计数器
            int size = 1;

            boolean flag = true;

            while(flag){
                long pos = fileSize - size++;
                in.seek(pos);//定位在4这个位置
                int len = in.read();
                System.out.println("pos:"+pos);
                switch (len){
                    case -1:
                        System.out.println("===-1====");
                        flag = false;
                        break;
                    case '\r':
                        System.out.println("===r====");
                        flag = false;
                        break;
                    case '\n':
                        System.out.println("=====n===");
                        in.seek(pos+1);//定位在4这个位置
                        flag = false;
                        break;
                }
            }
            //读取一整行数据
            String line = in.readLine();
            System.out.println(new String(line.getBytes("iso-8859-1"),"utf-8"));
            System.out.println("光标移动了:"+size+"次!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
