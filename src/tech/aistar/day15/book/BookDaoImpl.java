package tech.aistar.day15.book;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/17 0017
 */
@SuppressWarnings("all")
public class BookDaoImpl implements IBookDao{
    public static final String TARGET = "src/tech/aistar/day15/book/books.txt";

    @Override
    public List<Book> findAll() {
        ObjectInputStream in = null;
        List<Book> books = null;
        try {
            in = new ObjectInputStream(new FileInputStream(TARGET));
            books = (List<Book>) in.readObject();
        } catch (IOException e) {
            //e.printStackTrace();
            return books;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            //return books;
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

    @Override
    public void delById(int id) {
        List<Book> oldBooks = findAll();//1 2

        if(null==oldBooks || oldBooks.size()==0){
            System.out.println("sorrr...not exisits!");
            return;
        }

        //普通for 正向遍历 - 变向
        //迭代器
//        Iterator<Book> iter = oldBooks.iterator();
//        while(iter.hasNext()){
//            Book b = iter.next();
//            if(b.getId() == id){
//                iter.remove();
//                break;
//            }
//        }

        oldBooks.removeIf(b -> b.getId() == id);//2

        //清空文件...
        clearFile();

        //删除完毕之后需要写出去
        for(Book b:oldBooks){
            save(b);
        }
    }

    private void clearFile(){
        File file = new File(TARGET);
        file.delete();
    }

    @Override
    public void save(Book book) {
        List<Book> oldBooks = findAll();// 1 2

        //进行判断
        if(oldBooks != null && oldBooks.size()>0){
            //将新增的图书放入到oldBooks中即可
            oldBooks.add(book);
        }else{
            oldBooks = new ArrayList<>();
            oldBooks.add(book);
        }

        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream(TARGET));

            out.writeObject(oldBooks);

        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
