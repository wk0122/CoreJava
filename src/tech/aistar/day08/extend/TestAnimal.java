package tech.aistar.day08.extend;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/3 0003
 */
public class TestAnimal {
    public static void main(String[] args) {
        //创建子类对象
        Cat c = new Cat(100.00);

        //子类是可以共享父类中的所有的非私有的成员
        c.setName("咪咪");
        c.setType("蓝猫");

        System.out.println(c.getName());
        System.out.println(c.getType());
        System.out.println(c.getMeng());

        System.out.println("===========");

        //利用构造来构建
        Cat c1 = new Cat("邦皮","波斯猫",100.00);

        System.out.println(c1.getName());
        System.out.println(c1.getType());
        System.out.println(c1.getMeng());

        System.out.println("==提供了toString方法==");
        System.out.println(c1);
        //c1.outInfo();

        //调用仅仅存在于父类中的方法
        c1.sleeping();

        //调用自己特有的
        c1.catchMouse();

        c1.spark();
    }
}
