package tech.aistar.day14;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/15 0015
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Map<Integer,String> tables = new Hashtable<>();
        Map<Integer,String> maps = new HashMap<>();
        maps.put(null,null);
        System.out.println(maps);

        tables.put(null,"ok");

        System.out.println(tables);


    }
}
