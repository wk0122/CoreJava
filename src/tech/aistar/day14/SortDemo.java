package tech.aistar.day14;

import tech.aistar.day11.homework.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/12 0012
 */
public class SortDemo {
    public static void main(String[] args) {
        Book b = new Book(1,"丰乳肥臀","莫言",100.0,new Date());
        Book b1 = new Book(2,"等一个人的咖啡","九把刀",200.0,new Date());
        Book b2 = new Book(3,"西游记","吴承恩",300.0,new Date());
        Book b3 = new Book(4,"红楼梦","曹雪芹",500.0,new Date());
        Book b4 = new Book(5,"狂人日志","鲁迅",600.0,new Date());
        Book b5 = new Book(6,"茶馆","老舍",300.0,new Date());

        List<Book> books = new ArrayList<>();

        books.add(b);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);

        //根据价格降序排.

        List<Book> sorts = books.stream().sorted((o1, o2) -> (int)(o2.getPrice() - o1.getPrice())).collect(Collectors.toList());

        //sorts.forEach(s -> System.out.println(s));

        sorts.forEach(System.out::println);

        System.out.println("===");

        books.sort((o1, o2) -> (int)(o2.getPrice() - o1.getPrice()));

        sorts.forEach(System.out::println);
    }
}
