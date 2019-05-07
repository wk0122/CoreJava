package tech.aistar.day11.homework01;

import tech.aistar.day11.homework.Book;

import java.util.Arrays;
import java.util.Date;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/10 0010
 */
public class CartBizImpl implements ICartBiz{

    //初始化购物车 - 假设购物车存在一本图书.
    private Cart cart = new Cart();//容器

    private Book[] indexBooks = new Book[4];

    public CartBizImpl(){
        //模拟的是购物车的...
        Book[] books = new Book[1];
        Book b = new Book(1,"丰乳肥臀","莫言",100.0,new Date(),1);
        books[0] = b;
        cart.setBooks(books);

        //模拟的是原来的图书的....
        Book b2 = new Book(2,"等一个人的咖啡","九把刀",200.0,new Date());
        Book b3 = new Book(3,"西游记","吴承恩",300.0,new Date());
        Book b4 = new Book(4,"红楼梦","曹雪芹",500.0,new Date());
        Book b1 = new Book(1,"丰乳肥臀","莫言",100.0,new Date(),1);
        indexBooks[0] = b1;
        indexBooks[1] = b2;
        indexBooks[2] = b3;
        indexBooks[3] = b4;

    }

    /**
     * 添加到购物车
     * @param b
     */
    @Override
    public void add(Book b) {
        //1. 获取购物车中所有的图书 - 判断..
        Book[] cartBooks = cart.getBooks();

        int count = 0;

        //2.加入的b在购物车中是否已经存在.
        for(int i = 0;i<cartBooks.length;i++){
            if(cartBooks[i].equals(b)){
                cartBooks[i].setNum(cartBooks[i].getNum()+1);
                System.out.println("ccc:"+cartBooks[i]);
                System.out.println("====");
                count++;
                break;
            }
        }

        //反之,则对cart的图书数组进行扩容.并且将num设置成1
        if(count == 0){
            //购物车没有即将要添加的b
            cartBooks = Arrays.copyOf(cartBooks,cartBooks.length+1);
            b.setNum(1);
            cartBooks[cartBooks.length-1] = b;
        }
        //重新设置
        cart.setBooks(cartBooks);
    }

    @Override
    public Book[] findIndexAll() {
        return indexBooks;
    }

    @Override
    public Cart findCartAll() {
        return cart;
    }

    /**
     * 根据图书的id进行查找
     * @param id
     * @return
     */
    @Override
    public Book getById(int id) {
        Book b1 = null;

        for(Book b:indexBooks){
            if(b.getId() == id){
                b1 = b;
                break;
            }
        }
        return b1;
    }
}
