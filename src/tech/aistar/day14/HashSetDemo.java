package tech.aistar.day14;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/15 0015
 */
public class HashSetDemo {
    public static void main(String[] args) {
        //模拟数据
        Book b1 = new Book(1,"aaa","小红",100.0,new Date());


        Book b3 = new Book(3,"ccc","小名",300.0,new Date());
        Book b4 = new Book(4,"ddd","小黄",400.0,new Date());

        Book b2 = new Book(1,"aaa","小红拒绝添加",100.0,new Date());

        //创建一个Set集合
        Set<Book> books = new HashSet<>();//无序不可重复
        books.add(b1);
        books.add(b3);
        books.add(b4);

        books.add(b2);

        //获取集合的大小
        System.out.println(books.size());

        //不能通过下标进行遍历的,它是无序的.

        //集合特有的迭代器.
        Iterator<Book> iter = books.iterator();

        while(iter.hasNext()){
            Book b = iter.next();
            System.out.println(b);
        }

    }
}
