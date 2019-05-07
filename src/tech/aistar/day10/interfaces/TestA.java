package tech.aistar.day10.interfaces;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/8 0008
 */
public class TestA {
    public static void main(String[] args) {
        //1.调用接口中的常量属性
        //还可以通过静态导入的方式import static tech.aistar.day10.IA.*;
        System.out.println(IA.CAR);

        //2. 调用静态方法
        IA.crud();

        //3. 调用接口中的普通方法 - 通过接口的某个实现类对象进行调用
        //面向接口编程 - - 对象的编译时类型可以写成接口,对象的运行时类型可以写成接口的实现类.
        //IA a = new AImpl();
        IA a = new DImpl();
        a.close();
        a.save();
    }
}
