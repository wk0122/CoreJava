package tech.aistar.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/12 0012
 */
public class ArrayListNew8Demo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("mysql");
        strList.add("xml");
        strList.add("redis");
        strList.add("xml");

        for(String s:strList){
            System.out.println(s);
        }

        System.out.println("===");
        //普通方式的遍历 - 串行的遍历方式
        for (int i = 0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }

        //forEach(Consumer<? super E> action) - JDK8.0中提供的集合迭代的新的方式
        //JDK8.0以后提供的集合的遍历的方式 - 并行的.
        strList.forEach(new Consumer<String>() {//匿名内部类
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        System.out.println("==");
        //JDK8.0以后提供了lambda的方式 - 将方法传入给参数.
        strList.forEach(s -> System.out.println(s));
        //替代之前方法中传入匿名内部类.
//        strList.forEach(s ->{
//            System.out.println(s);
//            //...
//            //..
//        });

        //最通用的写法:
//        (参数1,参数2 -> { 代码;代码;});
    }
}
