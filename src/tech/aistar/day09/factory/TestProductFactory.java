package tech.aistar.day09.factory;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/4 0004
 */
public class TestProductFactory {
    public static void main(String[] args) {
       // Product car = ProductFactory.getInstance("tech.aistar.day09.factory.Plane");

        Product car = ProductFactory.getInstance(BeanPropDemo.getValue("plane"));
    }
}
