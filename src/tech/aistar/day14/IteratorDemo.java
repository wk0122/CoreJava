package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:迭代器对象
 * @date 2019/4/12 0012
 */
public class IteratorDemo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("mysql");
        strList.add("xml");
        strList.add("redis");
        strList.add("xml");

        //获取迭代器对象
        Iterator<String> iter = strList.iterator();

        while(iter.hasNext()){//如果迭代器中仍有元素可被迭代,则返回true
            //获取下一个可迭代的数据
            String n = iter.next();
            System.out.println(n);
        }

        System.out.println("======");

        //同一个迭代器对象只能顺序迭代一次.
        while(iter.hasNext()){//如果迭代器中仍有元素可被迭代,则返回true
            //获取下一个可迭代的数据
            String n = iter.next();
            System.out.println(n);
        }
    }
}
