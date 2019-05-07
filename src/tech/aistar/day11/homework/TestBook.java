package tech.aistar.day11.homework;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:使用单元测试类进行测试 - 程序员
 *                             作用:就是用它进行接口中的方法的测试,提高自信心!
 *
 *                             Junit4 - TestNg[测试人员专门使用的,自动化测试]
 * @date 2019/4/10 0010
 */
public class TestBook {

    private IBookBiz bookBiz = new BookBizImpl();

    @Before
    public void testBefore(){
        System.out.println("无论测试哪个方法,在测试该方法之前执行!");
        //模拟数据 - 图书对象
        Book b = new Book(1,"丰乳肥臀","莫言",100.0,new Date());
        Book b1 = new Book(2,"等一个人的咖啡","九把刀",200.0,new Date());
        Book b2 = new Book(3,"西游记","吴承恩",300.0,new Date());
        Book b3 = new Book(4,"红楼梦","曹雪芹",500.0,new Date());
        Book b4 = new Book(5,"狂人日志","鲁迅",600.0,new Date());
        Book b5 = new Book(6,"茶馆","老舍",300.0,new Date());

        //调用保存图书的方法
        bookBiz.add(b);
        bookBiz.add(b1);
        bookBiz.add(b2);
        bookBiz.add(b3);
        bookBiz.add(b4);
        bookBiz.add(b5);

        //bookBiz.outputAllBooks();
    }

    /**
     * 单元测试的注意点:
     * 1. 修饰符必须是public - 必须的
     * 2. 无返回类型 - 必须的
     * 3. test+接口定义的方法(首字母大写) - 推荐的
     * 4. 方法中不要传任何的参数
     * 测试保存图书的方法
     */
    @Test
    public void testAdd(){
//        //模拟数据 - 图书对象
//        Book b = new Book(1,"丰乳肥臀","莫言",100.0,new Date());
//        Book b1 = new Book(2,"等一个人的咖啡","九把刀",200.0,new Date());
//        Book b2 = new Book(3,"西游记","吴承恩",300.0,new Date());
//        Book b3 = new Book(4,"红楼梦","曹雪芹",500.0,new Date());
//        Book b4 = new Book(5,"狂人日志","鲁迅",600.0,new Date());
//        Book b5 = new Book(6,"茶馆","老舍",300.0,new Date());
//
//        //调用保存图书的方法
//        bookBiz.add(b);
//        bookBiz.add(b1);
//        bookBiz.add(b2);
//        bookBiz.add(b3);
//        bookBiz.add(b4);
//        bookBiz.add(b5);
//
//        bookBiz.outputAllBooks();
    }

    @Test
    public void testDeleteByName(){
       bookBiz.deleteByName("人");

       bookBiz.outputAllBooks();
    }

    /**
     * 测试输出图书的信息
     */
    @Test
    public void test0utputAllBooks(){
        bookBiz.outputAllBooks();
    }

    @After
    public void testAfter(){
        System.out.println("无论测试哪个方法,在测试该方法之后执行!");
    }
}
