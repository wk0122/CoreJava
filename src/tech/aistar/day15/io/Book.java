package tech.aistar.day15.io;

import sun.nio.ch.IOUtil;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/10 0010
 */
public class Book implements Serializable{
    private Integer id;

    private String bookName;

    private String author;

    private double price;

    private Date createDate;

    private int num;//被添加到购物车中的数量

    public Book() {
        //让id进行自增长
        this.id = IdUtils.readIds("src/tech/aistar/day15/book/ids.txt");
    }

    public Book(Integer id, String bookName, String author, double price, Date createDate) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.createDate = createDate;
    }

    public Book(Integer id, String bookName, String author, double price, Date createDate, int num) {
        this.id = id;
        this.bookName = bookName;
        this.author = author;
        this.price = price;
        this.createDate = createDate;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }


    @Override
    public boolean equals(Object o) {
        System.out.println("equals...");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode..." + Objects.hash(id));
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", bookName='").append(bookName).append('\'');
        sb.append(", author='").append(author).append('\'');
        sb.append(", price=").append(price);
        sb.append(", createDate=").append(createDate);
        sb.append(", num=").append(num);
        sb.append('}');
        return sb.toString();
    }
}
