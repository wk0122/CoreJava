package tech.aistar.day14;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:利用比较器接口来进行排序
 * @date 2019/4/15 0015
 */
public class TreeSetSortedDemo {
    public static void main(String[] args) {
        Customer c1 = new Customer(1,"admin",25);
        Customer c2 = new Customer(2,"tom",28);
        Customer c3 = new Customer(3,"success",23);
        Customer c4 = new Customer(3,"jack",23);

        //构建TreeSet的时候,需要在构造中传入一个比较器对象

        //构建一个比较器的接口对象
//        Comparator<Customer> comparator = new Comparator<Customer>() {
//            @Override
//            public int compare(Customer o1, Customer o2) {
//                //根据年龄降序排
//                return o2.getAge() - o1.getAge() ;
//            }
//        };

        //lambda表达式
        //Comparator<Customer> comparator = (o1,o2) -> o2.getAge() - o1.getAge();

        //TreeSet<Customer> customers = new TreeSet<>(comparator);

        TreeSet<Customer> customers = new TreeSet<>((o1, o2) -> o2.getAge() - o1.getAge());

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);

        customers.forEach(System.out::println);
    }
}
