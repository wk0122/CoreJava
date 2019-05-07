package tech.aistar.day03.method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:直接调用的方式
 * @date 2019/3/27 0027
 */
public class MethodTest {
    public static void main(String[] args) {
        //类名.静态方法()
        //MethodTest.test01();

        //所谓的直接调用就是将类名省略..
        //test01();

        MethodTest m = new MethodTest();
        m.test03();

    }

    /**
     * 定义一个静态方法
     */
    public static void test01(){
        //直接调用静态方法
        //方法中是可以调用方法的.
        //静态方法中是可以直接调用静态方法的.
        test02();

        //静态方法中如果想要调用非静态方法,必须是通过对象进行调用的.
        //原因;static修饰的 - jvm加载类的时候,就会立即优先加载静态修饰的成员[方法].
        //非静态的成员是对象拥有的 - 只有在创建对象的时候,才会给非静态成员[方法]分配空间以及初始化.
        MethodTest m = new MethodTest();
        m.test03();
        //test03();//error
        System.out.println("静态方法test01()...");
    }

    public static void test02(){
        System.out.println("静态方法test02()...");
    }

    /**
     * 定义一个非静态方法
     */
    public void test03(){
        //非静态方法中直接去调用静态方法
        //test02();

        //非静态方法中直接调用非静态方法
        //this.test04();
        test04();
        //this代表的是当前对象,可以省略不写的
        //System.out.println(this.getClass().getName());

        System.out.println("非静态方法test03()...");
    }

    /**
     * 定义一个非静态方法
     */
    public void test04(){
        System.out.println("非静态方法test04()...");
    }
}
