package tech.aistar.day08.extend;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:狗子类
 * @date 2019/4/3 0003
 */
public class Dog extends Animal{
    //特性
    private double loyalty;

    public Dog(double loyalty) {
        this.loyalty = loyalty;
    }

    public Dog(String name, String type, double loyalty) {
        super(name, type);
        this.loyalty = loyalty;
    }

    public Dog(){
        System.out.println("Dog()...");
    }

    /**
     * 特有的方法...
     */
    public void lookDoor(){
        System.out.println("狗会看门...");
    }

    @Override
    protected Animal spark() {
        System.out.println("汪汪~~~");
        return null;
    }

    @Override
    public String toString() {
        return super.toString()+loyalty;
    }
}
