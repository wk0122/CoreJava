package tech.aistar.day15.io;

import java.io.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:基本类型
 * @date 2019/4/17 0017
 */
public class DataStreamDemo {
    public static void main(String[] args) {
        writeIds("src/tech/aistar/day15/io/ids.txt",100L);

        System.out.println(readIds("src/tech/aistar/day15/io/ids.txt"));
    }

    public static long readIds(String target){
        DataInputStream in = null;

        long  id = 0L;

        try {
            in = new DataInputStream(new FileInputStream(target));

            id = in.readLong();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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

    public static void writeIds(String target,long data){
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream(target));

            out.writeLong(data);

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
