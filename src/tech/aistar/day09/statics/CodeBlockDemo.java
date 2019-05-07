package tech.aistar.day09.statics;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:代码块
 * @date 2019/4/4 0004
 */
public class CodeBlockDemo {

    //非静态属性
    private int id = 10;

    //静态属性
    private static int ids = 100;

    //构造块
    public CodeBlockDemo(){
        System.out.println("我是一个构造块!");

        System.out.println("id:"+id);
        System.out.println("ids:"+ids);
    }

    //普通代码块
    //只要创建对象,就会执行普通代码块中的程序.
    //执行的时机优先于构造块 - 实际开发中,将此处的代码移植到构造块中
    {
        System.out.println("我是一个普通代码块!");

        System.out.println("id:"+id);

        System.out.println("ids:"+ids);

    }

    //静态代码块
    //执行的时机是最高的 - JVM加载类进内存的时候优先立即执行.并且只会执行一次
    static{
        System.out.println("我是一个静态代码块!");

        System.out.println("ids:"+ids);

        //System.out.println("id:"+id);
    }

    public static void main(String[] args) {
//        CodeBlockDemo c1 = new CodeBlockDemo();
//        CodeBlockDemo c2 = new CodeBlockDemo();
//        CodeBlockDemo c3 = new CodeBlockDemo();
    }

}
