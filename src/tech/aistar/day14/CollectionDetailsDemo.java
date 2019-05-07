package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:集合的细节操作
 * @date 2019/4/15 0015
 */
public class CollectionDetailsDemo {
    public static void main(String[] args) {
        List<Book> books01 = new ArrayList<>();

        Book b1 = new Book(1,"aaa","小红",100.0,new Date());
        Book b2 = new Book(3,"ccc","小名",300.0,new Date());
        Book b3 = new Book(4,"ddd","小黄",400.0,new Date());

        books01.add(b1);
        books01.add(b2);
        books01.add(b3);

        List<Book> books03 = new ArrayList<>();
        books03.addAll(books01);//非结构性修改仍然会对books03进行了影响.

        //可以利用一个集合来构建出另外一个集合
        //不是同一个对象
        List<Book> bookList = new ArrayList<>(books01);

        System.out.println(books01 == bookList);//false

        //结构性修改..修改books01,不会对基于books01生成的booksList集合造成任何影响.
        //包含随机打乱,移除,排序
        Collections.shuffle(books01);
        books01.remove(b2);

        //非结构性修改 - 修改元素的属性的值
        //会对bookList造成影响
        books01.get(0).setBookName("Java");

        books01.forEach(System.out::println);

        System.out.println("====");

        //观察bookList
        bookList.forEach(System.out::println);

        System.out.println("===");

        books03.forEach(System.out::println);

    }
}
