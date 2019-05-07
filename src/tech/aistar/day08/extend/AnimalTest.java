package tech.aistar.day08.extend;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/3 0003
 */
public class AnimalTest {
    public static void main(String[] args) {
        //1. 创建一个动物的数组.
        Animal[] animals = new Animal[2];

        //面向父类编程 - 对象的编译时类型写成父类,对象的运行时类型写成子类
        //对象的编译时类型决定了对象的访问能力
        //对象的运行时类型决定了对象的行为能力.
        Animal dog = new Dog("哮天犬","神犬",100.0);

        Animal cat = new Cat("咪咪","吸猫",100.0);

        //使用instanceof关键字来进行类型的判断
        System.out.println(dog instanceof Animal);//true
        System.out.println(dog instanceof Dog);//true
        System.out.println(dog instanceof Cat);//false


        //dog是否能够访问Dog中特有的方法 lookDoor
        //dog.spark();

        //为啥要有方法的重写? - 就是希望编译时类型写成父类.

        //将对象放入到动物的数组中
        animals[0] = dog;
        animals[1] = cat;

        //dog = null;

        //System.gc();//作用是尽可能赶过来回收垃圾对象

       // System.exit(0);//相当于"拔电源" - 强制退出.


        for (Animal animal:animals){
            //调用公共的方法
            animal.sleeping();

            //如果需要访问子类中特有的功能,需要进行强制类型转换
            //为了防止出现java.lang.ClassCastException类型转换失败异常
            //需要进行类型的判断
            if(animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.lookDoor();
            }

            if(animal instanceof Cat) {
                Cat c = (Cat) animal;
                c.catchMouse();
            }

            System.out.println(animal);
        }

    }
}
