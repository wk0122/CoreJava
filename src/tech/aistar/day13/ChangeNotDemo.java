package tech.aistar.day13;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:String是不可变的,StringBuffer和StringBuilder是可变的
 * @date 2019/4/11 0011
 */
public class ChangeNotDemo {
    public static void main(String[] args) {
        //没有串池的概念.
        StringBuilder builder = new StringBuilder("A");

        //就是对原来的对象进行直接的拼接操作
        builder.append("B");
        System.out.println(builder);//AB

        String str = new String("A");
        str+="B";//str = str + "B";//原来的"A"成为了一个垃圾对象,导致了拼接的效率比较低.
        System.out.println(str);//AB
    }
}
