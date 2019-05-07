package tech.aistar.day09.factory;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:通过反射来构建对象
 * @date 2019/4/4 0004
 */
public class ClassDemo {
    public static void main(String[] args) {
        //Car c = new Car();

        //获取类的class实例
        try {
            Class<?> c = Class.forName("tech.aistar.day09.factory.Car");

            //通过反射构建对象
            Car car = (Car) c.newInstance();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
