package tech.aistar.day15.io;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
public class ObjDemo {

    public static void main(String[] args) {
        Book b0 = new Book(1,"丰乳肥臀","莫言",100.0,new Date());
        Book b1 = new Book(2,"等一个人的咖啡","九把刀",200.0,new Date());
        Book b2 = new Book(3,"西游记","吴承恩",300.0,new Date());
        Book b3 = new Book(4,"红楼梦","曹雪芹",500.0,new Date());
        Book b4 = new Book(5,"狂人日志","鲁迅",600.0,new Date());
        Book b5 = new Book(6,"茶馆","老舍",300.0,new Date());

        List<Book> books = new ArrayList<>();
        books.add(b2);
        books.add(b3);

        writeBooks(books,"src/tech/aistar/day15/io/books.txt");

        List<Book> bookList = readBooks("src/tech/aistar/day15/io/books.txt");
        bookList.forEach(System.out::println);
    }

    /**
     * 对象的序列化过程 - 内存中的对象写出到磁盘的文件中的过程
     * @param books
     * @param target
     */
    public static void writeBooks(List<Book> books,String target){
        //1. 构建对象类型的文件的字节输出流
        ObjectOutputStream out = null;

        try {
            //默认会覆盖文件中的内容
            //out = new ObjectOutputStream(new FileOutputStream(target));

            //追加写入
            out = new ObjectOutputStream(new FileOutputStream(target,true));

            //写出
            out.writeObject(books);

            System.out.println("对象序列化成功!");

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(null!=out){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 对象的反序列化的过程 - 从文件中读取对象到java的内存
     * @param target
     * @return
     */
    public static List<Book> readBooks(String target){
        //构建一个对象的文件的字节输入流
        ObjectInputStream in = null;

        List<Book> books = null;

        try {
            in = new ObjectInputStream(new FileInputStream(target));

            books = (List<Book>) in.readObject();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(null!=in){
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return books;
    }
}
