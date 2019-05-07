package tech.aistar.day03.method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class StaticNoReturnMethod {
    public static void main(String[] args) {
        //静态方法可以直接通过类名进行调用
        //原因:静态的成员是类拥有的.
        //类名.方法名();
        StaticNoReturnMethod.test02();

    }

    /**
     * 公有的,静态的,无返回类型的,没有参数的
     */
    public static void test02(){
        System.out.println("test02...");
    }
}
