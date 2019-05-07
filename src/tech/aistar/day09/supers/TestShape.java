package tech.aistar.day09.supers;

/**
 * Created by js on 2019/4/3.
 */
public class TestShape {
    public static void main(String[] args) {

        Rect rect = new Rect(10,30);

        Circle circle = new Circle(10.0);

        Square square = new Square(10);

        //创建图形的业务类
        ShapeBiz biz = new ShapeBiz();


        biz.printCircle(rect);
        biz.printCircle(circle);
        biz.printCircle(square);
    }
}
