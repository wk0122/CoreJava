package tech.aistar.day14;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:读取属性文件
 * @date 2019/4/15 0015
 */
public class PropDemo {
    //1. 声明一个Propeties对象
    private static Properties prop = new Properties();

    //2. 一般推荐使用静态代码块来进行资源文件的加载
    //优先加载 , 只加载一次
    static{
        //利用IO流来读取属性文件
        //InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream("tech/aistar/day14/db.properties")

        //将该文件对应的字节流映射到prop对象中.
        try {
            InputStream in = PropDemo.class.getResourceAsStream("/tech/aistar/day14/db.properties");
            prop.load(in);//将.propeties属性文件和Propeties对象进行了映射
        } catch (Exception e) {
            //静态代码块的异常需要积极处理,不能消极处理[将会把异常抛给jvm]
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        System.out.println(prop.getProperty("user.name"));
    }
}
