package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/15 0015
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        //模拟数据
        Book b1 = new Book(1,"aaa","小红",100.0,new Date());
        Book b3 = new Book(3,"ccc","小名",300.0,new Date());
        Book b4 = new Book(4,"ddd","小黄",400.0,new Date());

        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b3);
        books.add(b4);

        //反转...
        //Collections.reverse(books);

        //随机打乱集合
        //Collections.shuffle(books);

        //排序
        Collections.sort(books,((o1, o2) -> (int)(o2.getPrice() - o1.getPrice())));

        books.forEach(System.out::println);
    }
}
