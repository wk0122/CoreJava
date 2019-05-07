package tech.aistar.day15.book;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public interface IBookDao {
    /**
     * 查询所有的图书
     * @return
     */
    List<Book> findAll();

    /**
     * 根据id进行删除操作
     * @param id
     */
    void delById(int id);

    /**
     * 保存一个图书对象
     * @param book
     */
    void save(Book book);
}
