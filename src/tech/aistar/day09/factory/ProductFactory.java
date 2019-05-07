package tech.aistar.day09.factory;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:简单工厂类
 * @date 2019/4/4 0004
 */
public class ProductFactory {

    //根据传入的参数,来返回某个类的具体的实例
    //面向父类编程 - 方法的返回类型写成父类
    public static Product getInstance(String className){
       //获取class实例
        Product p = null;
        try {
            Class<?> c = Class.forName(className);

            p = (Product) c.newInstance();//通过反射构建对象.

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }

        return p;
    }
}
