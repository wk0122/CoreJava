package tech.aistar.day15.io;

import java.io.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:id自动生成器
 * @date 2019/4/17 0017
 */
@SuppressWarnings("all")
public class IdUtils {
    public static void main(String[] args) {
        writeIds("src/tech/aistar/day15/io/ids.txt",100);

        System.out.println(readIds("src/tech/aistar/day15/io/ids.txt"));
    }

    public static Integer readIds(String target){
        DataInputStream in = null;

        Integer id = 1;

        try {
            in = new DataInputStream(new FileInputStream(target));

            id = in.readInt();//2

            writeIds(target,id+1);

        } catch (IOException e) {
            //e.printStackTrace();
            //有可能是存放id的文件是不存在或者里面是空的
            writeIds(target,id+1);
        } finally {
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return id;
    }

    public static void writeIds(String target,Integer data){
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(target));

            out.writeInt(data);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
