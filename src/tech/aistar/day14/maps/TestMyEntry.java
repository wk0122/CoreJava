package tech.aistar.day14.maps;


import java.util.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/15 0015
 */
public class TestMyEntry {
    public static void main(String[] args) {
        MyEntry<Integer, String> e1 = new MyEntry<>(100, "tom");
        System.out.println(e1);
        System.out.println(e1.getKey());
        System.out.println(e1.getValue());

        Map<Integer, String> maps = new HashMap<>();
        maps.put(1, "AAA");
        maps.put(2, "BBB");
        maps.put(3, "CCC");

        Set<MyEntry<Integer,String>> entrySet = entrySet(maps);

        Iterator<MyEntry<Integer,String>> iterator = entrySet.iterator();

        while(iterator.hasNext()){
            MyEntry<Integer,String> myEntry = iterator.next();

            Integer key = myEntry.getKey();

            String value = myEntry.getValue();

            System.out.println(key+":"+value);
        }


    }

    public static Set<MyEntry<Integer,String>> entrySet(Map<Integer,String> maps){
        //创建一个Set集合,用来存放MyEntry对象
        Set<MyEntry<Integer,String>> entrySets = new HashSet<>();

        //将所有的key-value封装到MyEntry对象.
        Set<Integer> setKeys = maps.keySet();
        Iterator<Integer> iterator = setKeys.iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = maps.get(key);

            //创建一个MyEntry对象,并且将key和value放入到对象中去
            MyEntry<Integer,String> entrys = new MyEntry<>(key,value);

            entrySets.add(entrys);

        }
        return entrySets;
    }
}
