package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:泛型
 * @date 2019/4/15 0015
 */
public class GenericDemo {
    public static void main(String[] args) {
        //List<Number> n1 = new ArrayList<Integer>();//error
        //List<Number> m1 = new ArrayList<Long>();//error

        //泛型只在编译期间是有效的,在运行期间是无效的
        List<Integer> n1 = new ArrayList<Integer>();//ok
        n1.add(10);
        n1.add(20);
        n1.add(30);
        List<Long> m1 = new ArrayList<Long>();//ok
        m1.add(100L);
        m1.add(200L);
        m1.add(300L);
        System.out.println(n1.getClass().getName());//class java.util.ArrayList
        System.out.println(m1.getClass().getName());//class java.util.ArrayList
        printList(n1);
        System.out.println("===");
        printList(m1);

    }

    /**
     * ? extends T - T对象或者是T的子类
     * @param m1
     */
    private static void printList(List<? extends Number> m1) {
        Iterator<? extends  Number> iter = m1.iterator();
        while(iter.hasNext()){
            Number n = iter.next();
            System.out.println(n);
        }
    }

}
