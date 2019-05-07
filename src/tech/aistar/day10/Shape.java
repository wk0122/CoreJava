package tech.aistar.day10;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:抽象类
 * @date 2019/4/8 0008
 */
public abstract class Shape {
    //1. 子类公共的属性放在抽象类中
    private int id;

    private String name;

    //2. 可以有构造器
    public Shape(){
        System.out.println("Shape()...");
    }

    public Shape(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //3. 可以有普通方法
    public String getName(){
        return name;
    }

    //普通方法
    public void test(){
        System.out.println("test...普通方法...");
    }

    //4. 定义抽象方法 - 没有方法体的方法
    protected abstract double area();//仅仅拥有方法的签名

    public abstract double circle();

}
