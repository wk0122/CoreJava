package tech.aistar.day14;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Properties;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:系统内置的配置
 * @date 2019/4/15 0015
 */
public class SystemPropList {
    public static void main(String[] args) {
        //System.out.println(System.getProperty("os.name"));

        //获取系统的属性
        Properties prop = System.getProperties();

        //输出...
        prop.list(System.out);

        try {
            prop.list(new PrintWriter(new FileWriter("e:/prop.txt",true),true));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
