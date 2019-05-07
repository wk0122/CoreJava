package tech.aistar.day14.factory;

import tech.aistar.day14.Customer;

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
        Customer c2 = new Customer(2,"com",28);
        Customer c3 = new Customer(3,"fuccess",23);
        Customer c5 = new Customer(4,"duccess",23);
        Customer c6 = new Customer(5,"zuccess",23);

        Customer c4 = new Customer(3,"back",23);

        //name
        Comparator<Customer> comparatorName = SortedFactory.getInstance(SortedFactory.NAME);
        //age
        Comparator<Customer> comparatorAge = SortedFactory.getInstance(SortedFactory.AGE);

        //name和age
        Comparator<Customer> comparatorAgeAndName = SortedFactory.getInstance(SortedFactory.AgeAndName);

        TreeSet<Customer> customers = new TreeSet<>(comparatorAgeAndName);

        customers.add(c1);
        customers.add(c2);
        customers.add(c3);
        customers.add(c4);
        customers.add(c5);
        customers.add(c6);

        customers.forEach(System.out::println);
    }
}
