package tech.aistar.day17;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/22 0022
 */
public class ConstructorDemo {
    public static void main(String[] args) {
        Point p = new Point();
        Class<?> c = p.getClass();

        //获取所有的构造
        Constructor<?>[] constructors = c.getDeclaredConstructors();
        for (Constructor<?> cc:constructors){
            System.out.println(cc);
        }
        System.out.println("=====");
        try {
            //获取空参构造的constructor对象
            Constructor<?> c1 = c.getDeclaredConstructor();

            //反射调用空参构造,方式一
            Point p1 = (Point) c1.newInstance();

            System.out.println("---");
            //调用带参构造
            Constructor<?> c2 = c.getDeclaredConstructor(int.class,String.class);
            Point p2 = (Point) c2.newInstance(25,"tom");
            System.out.println(p2);

            System.out.println("===");

            //调用空参构造
            Point p3 = (Point) c.newInstance();


        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
