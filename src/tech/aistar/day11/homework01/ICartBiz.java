package tech.aistar.day11.homework01;


import tech.aistar.day11.homework.Book;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/10 0010
 */
public interface ICartBiz {

    void add(Book b);

    Book[] findIndexAll();

    Cart findCartAll();

    Book getById(int id);
}
