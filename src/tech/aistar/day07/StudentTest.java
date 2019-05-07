package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/2 0002
 */
public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student(1,"tom",23);
        //打印对象的时候,默认会去调用该对象的toString方法
        //当一个类没有指定父类的时候,那么这个类默认会去继承java.lang.Object
        //如果某个对象中没有提供toString方法,Student的父类就是Object类
        //那么就会去调用父类中的toString方法[this.getClass().getName() + "@" + Integer.toHexString(this.hashCode());]
        System.out.println(s1);//tech.aistar.day07.Student@28d93b30
        System.out.println(s1.toString());
        //如果本类中提供了toString - 重写了Object中的toString方法的时候,那么调用自己的 - "就近原则".

        System.out.println("myAddress:"+s1.getClass().getName()+"@"+Integer.toHexString(s1.hashCode()));

        Student s2 = new Student(1,"tom",23);
        System.out.println(s2);//tech.aistar.day07.Student@1b6d3586
        // == 永远比较的是内存地址
        System.out.println(s1 == s2);//false
    }
}
