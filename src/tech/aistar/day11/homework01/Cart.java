package tech.aistar.day11.homework01;

import tech.aistar.day11.homework.Book;

import java.util.Arrays;
import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:购物车
 * @date 2019/4/10 0010
 */
public class Cart extends Book{

    //一个购物车对应多本图书
    private Book[] books;

    public Cart(){

    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cart{");
        sb.append("books=").append(Arrays.toString(books));
        sb.append('}');
        return sb.toString();
    }
}
