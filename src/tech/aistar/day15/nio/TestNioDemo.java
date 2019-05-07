package tech.aistar.day15.nio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public class TestNioDemo {
    public static void main(String[] args) {
        //Path - 类似于File实例
        //Paths - 作用的就是用来构建Path实例的
        //Files - 工具类
//        Path path = Paths.get("src/tech/aistar/day15/nio/123.txt");
//        try {
//            Files.createFile(path);//创建文件
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

       // readText();

        copy();
    }

    /**
     * 将读取到的数据全部封装到List集合中
     */
    public static void readText(){
        Path path = Paths.get("src/tech/aistar/day15/charset/CharSetDemo.java");
        try {
            List<String> strList = Files.readAllLines(path);

            strList.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void copy(){
        Path src = Paths.get("src/tech/aistar/day15/charset/CharSetDemo.java");
        Path target = Paths.get("src/tech/aistar/day15/charset/CharSetDemo_副本.txt");
        try {
           // Files.copy(src,new FileOutputStream("src/tech/aistar/day15/charset/CharSetDemo_副本.txt"));

            Files.copy(src,target, StandardCopyOption.COPY_ATTRIBUTES);
            System.out.println("拷贝成功!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
