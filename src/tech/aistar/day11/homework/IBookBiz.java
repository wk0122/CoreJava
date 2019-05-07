package tech.aistar.day11.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:业务接口
 * @date 2019/4/10 0010
 */
public interface IBookBiz {
    //添加图书
    void add(Book b);
    //根据图书name 来删除指定图书
    void deleteByName(String name);
    //打印出所有的图书信息
    void outputAllBooks();
}
