package tech.aistar.day07;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:测试类
 * @date 2019/4/2 0002
 */
public class TestStudent {
    public static void main(String[] args) {
        //创建一个学生对象 - 具体的
       // Student s1 = new Student();
        //属性没有封装之前,我们是可以通过对象名.属性名来进行设置和访问的.
        //s1.name = "习大大";
       // System.out.println(s1.name);

        //System.out.println(s1.age);

        //空参的 - 仅仅是创建了对象,并没有给对象的属性赋值
        //Student s1 = new Student();

        //带参的 - 在创建对象的同时可以给对象的属性进行赋值操作.
        //Student s2 = new Student(1,"aistar",23);
        //System.out.println(s2.name);

        //Student s3 = new Student(1,"tom",23,new String[]{"coding","working"});
        //System.out.println(Arrays.toString(s3.hobbies));

        //对属性封装之后,通过getter/setter进行获取和设置

        //创建一个对象
        Student s1 = new Student();
        //通过setter方法进行赋值
        s1.setId(1);
        //通过getter方法访问属性
        System.out.println(s1.getId());

        //可以通过setter方法进行参数有效性的判断
        //s1.setName("习大大");
        //s1.setName(null);
        s1.setName("习大大");
        //setter方法可以对对象的属性进行多次赋值
        s1.setName("彭麻麻");
        System.out.println(s1.getName());

    }
}
