package tech.aistar.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 *https://www.jianshu.com/p/d6b45c550782?from=timeline&isappinstalled=0
 * @author success //http://www.imooc.com/article/24862
 * @version 1.0
 * @description:本类用来演示:Stream//https://www.cnblogs.com/CarpenterLee/p/6507161.html
 * @date 2019/4/12 0012
 */
public class StreamDemo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("I", "love", "you", "too","you","love");

        //一个stream只能使用一次
        //stream.forEach(str -> System.out.println(str));

        //过滤条件
        //stream.filter(str -> str.length()==3).forEach(str -> System.out.println(str));
        //List<String> list =  stream.filter(str -> str.length()==3).collect(Collectors.toList());

        //排重
        //List<String> list = stream.distinct().collect(Collectors.toList());
        //System.out.println(list);

        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        ints.add(1);
        ints.add(3);
        ints.add(2);

        //List<Integer> is = ints.stream().sorted((o1, o2) -> {return o2-o1;}).collect(Collectors.toList());
        //System.out.println(is);

        //统计个数
        //System.out.println(ints.stream().count());

        //stream.limit(3).collect(Collectors.toList()).forEach(s-> System.out.println(s));

        //anyMatch - 任何一个
        //System.out.println(stream.anyMatch(s -> s.equals("you")));
    }
}
