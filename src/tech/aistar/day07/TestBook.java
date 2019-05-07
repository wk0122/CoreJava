package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/2 0002
 */
public class TestBook {
    public static void main(String[] args) {
        //创建三个图书对象
        Book b1 = new Book(1,"西游记",23);
        Book b2 = new Book(2,"东游记",28);
        Book b3 = new Book(3,"南游击",26);

        //放入到图书数组中
        //元素类型[] 对象 = new 元素类型[3];
        Book[] books = new Book[3];
        books[0] = b1;
        books[1] = b2;
        books[2] = b3;
        //输出...
        //增强for循环
        for(Book b:books){
            System.out.println(b);
        }
        System.out.println("===");
        for (int i = 0; i <books.length ; i++) {
            System.out.println(books[i]);
        }
        System.out.println("===========");

        //根据价格降序排...
        for (int i = 0; i <books.length ; i++) {
            for (int j = i+1; j < books.length; j++) {
                //比较的是价格
                if(books[i].getPrice()<books[j].getPrice()){
                   //中间变量
                    Book[] temp = new Book[1];
                    temp[0] = books[i];
                    books[i] = books[j];
                    books[j] = temp[0];
                }
            }
        }

        for (Book b:books){
            System.out.println(b);
        }
    }
}
