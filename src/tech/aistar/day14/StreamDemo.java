package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:并行的
 * @date 2019/4/12 0012
 */
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(11);

        //anyMatch - 只要存在任意一个元素满足-true
        //allMatch - 必须所有的元素
        System.out.println(list.stream().anyMatch(integer -> integer == 2));

        System.out.println(list.stream().allMatch(integer -> integer<10));

        //集合排重的方式...
        List<Integer> strList = list.stream().distinct().collect(Collectors.toList());
        System.out.println(strList);

        //找出集合前4个元素
        List<Integer> integers = list.stream().limit(4).collect(Collectors.toList());
        System.out.println(integers);

        //返回集合的大小
        System.out.println(list.stream().count());

        //filter - 条件的过滤
//        List<Integer> filters = list.stream().filter(new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer == 3;
//            }
//        }).collect(Collectors.toList());

        List<Integer> filters = list.stream().filter(integer -> integer==3).collect(Collectors.toList());
        System.out.println(filters);

        //找出集合中最大的
//        System.out.println(list.stream().max(new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1 - o2;
//            }
//        }).get());

        Integer max = list.stream().max(((o1, o2) -> o1 - o2)).get();
        System.out.println(max);

        List<Integer> sorts = list.stream().sorted((o1, o2) -> o1-o2).collect(Collectors.toList());
        System.out.println(sorts);


        System.out.println("===========");
        //将集合转换Stream类型
        //Stream<Integer> stream = list.stream();

        //调用排重方法
        //stream has already been operated upon or closed
        //一个stream对象只能使用1次
        //List<Integer> strList = stream.distinct().collect(Collectors.toList());
        //System.out.println(strList);

        //将Stream->集合
        //List<Integer> newList = stream.collect(Collectors.toList());
        //System.out.println(newList);
    }
}
