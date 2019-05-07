package tech.aistar.day15.book;

import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public class TestBook {
    private IBookDao bookDao = new BookDaoImpl();

    @Test
    public void testFindAll(){
        List<Book> books = bookDao.findAll();

        if(null!=books && books.size()>0){
            books.forEach(System.out::println);
        }else{
            System.out.println("没有发现任何的图书信息!");
        }
    }

    @Test
    public void testSave(){
       Book b0 = new Book("丰乳肥臀3","莫言",100.0,new Date());
       Book b1 = new Book("丰乳肥臀4","莫1",100.0,new Date());

        bookDao.save(b0);
        bookDao.save(b1);
    }

    @Test
    public void delById(){
        bookDao.delById(1);
    }
}
