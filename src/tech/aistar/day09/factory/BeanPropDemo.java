package tech.aistar.day09.factory;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:读取配置文件
 * @date 2019/4/4 0004
 */
public class BeanPropDemo {
    private static Properties properties = new Properties();

    static{
        //读取配置文件
        InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("tech/aistar/day09/factory/bean.properties");
        try {
            //将配置文件和properties对象进行了映射
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 根据key获取值
     * @param key
     * @return
     */
    public static String getValue(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(getValue("plane"));
    }
}
