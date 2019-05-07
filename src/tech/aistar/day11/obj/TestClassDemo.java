package tech.aistar.day11.obj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestClassDemo {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Student s1 = new Student(1,"tom");
        Student s2 = new Student(2,"admin");

        //所有的类在java.lang.Class<T>面前,都是它的对象.
        //类是用来描述对象的.
//        Class<?> c = s1.getClass();//仅仅是获取class实例,JVM才是class实例的创建者.
//        Method m = c.getDeclaredMethod("test");
//        m.setAccessible(true);
//        m.invoke(s1,null);


        //获取class实例
        //一个类无论被实例化多少次,它在JVM中的class实例永远只有1个
        System.out.println(s1.getClass() == s2.getClass());//true
        System.out.println(s1.getClass());//class tech.aistar.day11.obj.Student

//        System.out.println(Student.class);//class tech.aistar.day11.obj.Student
        //2. 类名.class
        System.out.println(Student.class == s1.getClass());//true

        //3. 基本类型.class
        System.out.println(int.class);//int

        //4. 对象类型.class
        System.out.println(Integer.class);//class java.lang.Integer

        //5.Class.forName("类全名");//推荐使用的方式
        try {
            Class<?> cc = Class.forName("tech.aistar.day11.obj.Student");
            System.out.println(cc);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();//输出异常信息...
        }
    }
}
