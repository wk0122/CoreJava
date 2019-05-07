package tech.aistar.day03.method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:非静态的,无返回类型的方法
 * @date 2019/3/27 0027
 */
public class NoStaticNoReturnMethod {
    //main方法始终是程序的主入口.
    public static void main(String[] args) {
        //1. 调用非静态方法 - 创建对象  类名 对象名 = new 类名();
        NoStaticNoReturnMethod t = new NoStaticNoReturnMethod();
        //2. 通过对象名.方法名()进行调用.
        t.test01();
    }

    /**
     * 定义一个公有的,无返回类型的,非静态的,并且没有参数的方法
     */
    public void test01(){
        //方法体
        System.out.println("test01...");
    }
}
