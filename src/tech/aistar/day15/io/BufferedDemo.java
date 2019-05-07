package tech.aistar.day15.io;

import java.io.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:带缓存功能的文件的字节输入流
 * @date 2019/4/16 0016
 */
@SuppressWarnings("all")
public class BufferedDemo {
    public static void main(String[] args) {
        copy("src/tech/aistar/day15/FileDemo.java","src/tech/aistar/day15/FileDemo_副本.java");
    }

    /**
     * BufferedInputStream本身提供了一个缓冲数组,默认的大小8192  byte[] buf = new byte[8192];
     * 1. 如果使用BufferedInputStream的时候,代码中可以不使用byte[] buf = new byte[3*1024];
     *    因为new这个对象的时候,会给我们初始化一个字节数组
     * @param src
     * @param target
     */
    public static void copy(String src,String target){
        //1. 构建出带缓存功能的文件的字节输入流/输出流
        BufferedInputStream in = null;
        BufferedOutputStream out = null;

        try {
            //一定要有节点流 - 才具备真正的读写能力
            //底层 - byte[] buf = new byte[8192];
            in = new BufferedInputStream(new FileInputStream(src));

            out = new BufferedOutputStream(new FileOutputStream(target));

            //定义一个缓存区数组
            byte[] buf = new byte[3*1024];

            while(true){
                //FilterInputStream - read(byte[] buf) - > 调用重写的return read(b, 0, b.length);
                //BufferedInputStream已经重写了read(byte[] buf,int off,int len);
                // int nread = read1(b, off + n, len - n);

                //read1方法的底层 -  System.arraycopy(getBufIfOpen(), pos, b, off, cnt);

                //程序 - 数据 - 内置的缓存区 -> 完全拷贝一份到自定义的缓冲区 -> 写出去
                int len = in.read(buf);

                if(len == -1){
                    break;
                }

                out.write(buf,0,len);//刷新缓存区
            }

            System.out.println("拷贝成功!");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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
}
