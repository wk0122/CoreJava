package tech.aistar.day09.supers;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:业务类,输出图形的周长和面积
 * @date 2019/4/4 0004
 */
public class ShapeBiz {

    /**
     * 输出矩形的面积
     * @param rect
     */
//    public void printRectArea(Rect rect){
//        System.out.println(rect.area());
//    }

    /**
     * 有多少个子类,那么就需要定义多少个方法.
     * @param circle
     */
//    public void printCircleArea(Circle circle){
//        System.out.println(circle.area());
//    }

    //采用面向父类编程 - 方法的参数类型写成父类,那么可以将父类的子类的对象传入到该方法中
    //然后利用多态的特性 - 真正执行的是子类中重写之后的方法

    /**
     * 输出面积
     * @param shape
     */
    public void printArea(Shape shape){//可以传入类Shape的任何一个子类对象
        System.out.println(shape.area());//1.父类Shape中需要提供area()方法   2.子类中如果重写了area()方法,那么执行的是子类中重写之后的
    }

    /**
     * 输出周长
     * @param shape
     */
    public void printCircle(Shape shape){
        System.out.println(shape.circle());
    }




}
