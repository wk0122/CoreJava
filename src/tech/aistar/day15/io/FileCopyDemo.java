package tech.aistar.day15.io;

import java.io.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:文件的拷贝
 * @date 2019/4/16 0016
 */
@SuppressWarnings("all")
public class FileCopyDemo {

    public static void main(String[] args) {
        copyByte("src/tech/aistar/day15/FileDemo.java","src/tech/aistar/day15/file_copy.txt");
    }

    /**
     * 引入缓冲区的概念 - 暂时将从输入流中读取的字节存放到内存的字节数组中.然后达到字节数组的长度之后,一次性再写出去
     * 减少了程序和磁盘的I/O交互 - 提高了性能.
     * @param src 源头
     * @param target 目标
     */
    public static void copyByte(String src,String target){
        //1. 声明流
        InputStream in = null;
        OutputStream out = null;

        //2. 确定源头和目标
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(target);

            //1. 定义一个字节数组
            byte[] buf = new byte[3*1024];//3kb

            //循环进行读写操作
            while(true){
                int len = in.read(buf);//从输入流中读取一定的字节放入到缓冲字节数组区中.

                if(len == -1){
                    break;
                }
                //写入 - 从byte数组buf中的下标为0的位置,写出去buf.length个
                out.write(buf,0,len);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //无论try是否出现异常都能够顺利执行,所以一般用来进行资源的释放和关闭的操作.
            try {
                if(null != in) {
                    in.close();
                }
                if(null!=out){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 最原始的单个字节单个字节进行读取和写入
     * 增加了java程序和磁盘的IO交互,性能比较低下,不可取
     *
     * @param src 源文件的路径
     * @param target 目标文件的路径
     */
    public static void copyBase(String src,String target){
        //1. 声明一个字节输入流和字节输出流
        InputStream in = null;
        OutputStream out = null;

        //2. 确定源头和目标
        try {
            in = new FileInputStream(src);
            out = new FileOutputStream(target);

            //3. 循环进行读取
            while(true){
                //单个字节单个字节进行读取
                int len = in.read();//如果已到达文件末尾，则返回 -1。

                if(len == -1){
                    break;
                }
                //读入多少个字节,写出去多少个
                out.write(len);
            }

            System.out.println("拷贝成功!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            //无论try是否出现异常都能够顺利执行,所以一般用来进行资源的释放和关闭的操作.
            try {
                //ctrl + alt + t
                if(null != in) {
                    in.close();
                }
                if(null!=out){
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
