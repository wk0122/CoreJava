package tech.aistar.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/12 0012
 */
public class LambdaDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Java", "love", "you", "Java"));

        list.removeIf(str -> str.equals("Java"));

        list.forEach(str -> System.out.println(str));
    }
}
