package tech.aistar.day14.factory;

import tech.aistar.day14.Customer;

import java.util.Comparator;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:简单工厂设计模式 - 根据传入的参数.来返回具体的实体[比较器接口的对象].
 * @date 2019/4/15 0015
 */
public class SortedFactory {
    public static final int NAME = 1;

    public static final int AGE = 2;

    //先根据年龄降序排,如果年龄一样,则继续根据Name进行降序排.
    public static final int AgeAndName = 3;

    public static Comparator<Customer> getInstance(int type){
        Comparator<Customer> comparator = null;

        switch (type){
            case NAME:
                //根据名称字典顺序降序排
                comparator = (o1, o2) -> o2.getName().compareTo(o1.getName());
                break;
            case AGE:
                //根据年龄进行降序排
                comparator = (o1, o2) -> o2.getAge() - o1.getAge();
                break;
            case AgeAndName:
                comparator = (o1,o2)->{
                    //先根据年龄降序排,如果年龄一样,则继续根据Name进行降序排.
                    if(o2.getAge() > o1.getAge()){
                        return 1;
                    }
                    if(o2.getAge() < o1.getAge()){
                        return -1;
                    }

                    if(o2.getAge() == o1.getAge()){
                        //name降序的条件...
                        return o2.getName().compareTo(o1.getName());
                    }
                    System.out.println("====");
                    return 1;
                };
                break;
            default:
                //为了让框架能够捕捉到异常
                throw new RuntimeException("传入参数不合法!");
        }
        return comparator;
    }
}
