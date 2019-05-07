package tech.aistar.day08.homework01;


/**
 * Created by js on 2019/4/3.
 */
public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        Rect rect = new Rect(10,30);

        Circle circle = new Circle(10.0);

        Square square = new Square(10);

        shapes[0] = rect;
        shapes[1] = circle;
        shapes[2] = square;

        for (Shape s:shapes){
            System.out.println(s.area());
            System.out.println(s.circle());
            System.out.println("===");
        }
    }
}
