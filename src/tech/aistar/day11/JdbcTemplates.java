package tech.aistar.day11;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class JdbcTemplates {

    //1.注册接口
    public static void execute(IM im){//可以传入该接口的任何一个实现类
        //1. 加载驱动 ...
        System.out.println("加载驱动...");
        //2. 获取连接
        System.out.println("获取连接...");

        im.dml();//真正调用的是实现类中重写之后的dml()方法

        //释放资源
        System.out.println("释放资源...");
    }
}
