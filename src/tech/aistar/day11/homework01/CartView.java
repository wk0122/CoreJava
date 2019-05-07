package tech.aistar.day11.homework01;

import tech.aistar.day11.homework.Book;
import tech.aistar.util.DateUtil;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/10 0010
 */
public class CartView {
    ICartBiz biz = new CartBizImpl();

    public static void main(String[] args) {
        new CartView().index();

    }

    public  void index(){
        System.out.println("===图书首页===");
        System.out.printf("%s\t%-15s\t%s\t%s\t%s\n","id","bookName","author","price","createDate");
        for(Book b:biz.findIndexAll()){
            System.out.printf("%s\t%-15s\t%s\t%s\t%s\n",b.getId(),b.getBookName(),b.getAuthor(),b.getPrice(), DateUtil.format(b.getCreateDate(),"yyyy-MM-dd"));
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("加入购物车:>");
        int checkNo = sc.nextInt();

        //调用加入购物车的方法
        //根据id获取图书
        Book addBook = biz.getById(checkNo);
        System.out.println(addBook);

        biz.add(addBook);

        System.out.println("===购物车界面===");
        System.out.printf("%s\t%-15s\t%s\t%s\t%s\t\t%s\n","id","bookName","author","price","createDate","num");

        //获取购物车的对象
        Cart c = biz.findCartAll();

        Book[] cartBooks = c.getBooks();

        for(Book b:cartBooks){
            System.out.printf("%s\t%-15s\t%s\t%s\t%s\t\t%s\n",b.getId(),b.getBookName(),b.getAuthor(),b.getPrice(), DateUtil.format(b.getCreateDate(),"yyyy-MM-dd"),b.getNum());
        }

        System.out.print("输入enter:>");
        int i = sc.nextInt();
        index();
    }
}
