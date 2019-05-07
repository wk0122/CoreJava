package tech.aistar.day11.homework;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/10 0010
 */
public class BookBizImpl implements IBookBiz{

    //图书数组的初始化的容量
    private static final int CAPACITY = 5;

    //代表有效图书数量
    private int count;

    private Book[] books = new Book[CAPACITY];

    @Override
    public void add(Book b) {
        //判断图书的有效图书是否已经到达容器的尾部了.
        if(count == books.length){
            //进行扩容
            System.out.println("扩容...");
            books = Arrays.copyOf(books, books.length*2);
        }
        books[count] = b;
        count++;
    }

    @Override
    public void deleteByName(String name) {
        //进行参数有效性的判断
        if(books[0] == null){
            System.out.println("没有任何图书!");
            return;
        }

        //定义一个计数器
        int pos = 0;

        for(int i = 0;i<count;i++){
            if(books[i].getBookName().contains(name)){
                pos++;
            }
        }
        if(pos == 0){
            System.out.println("不存在!");
            return;
        }

        Book[] temp = new Book[count - pos];

        int index = 0;

        for(int i=0;i<count;i++){
            if(!books[i].getBookName().contains(name)){
                temp[index++] = books[i];
            }
        }
        books = temp;

        count = count - pos;
    }

    @Override
    public void outputAllBooks() {
        //进行参数有效性的判断
        if(books[0] == null){
            System.out.println("没有任何图书!");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(books[i]);
        }
    }
}
