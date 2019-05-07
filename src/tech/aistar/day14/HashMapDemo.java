package tech.aistar.day14;

import java.util.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/15 0015
 */
public class HashMapDemo {
    public static void main(String[] args) {
        //1.创建一个HashMap对象
        //key只能是Integer类型,value只能是String类型,key是无序不可重复的

        //key的泛型我们都是采取包装类型或者String
        Map<Integer,String> maps = new HashMap<>();

        //2. 存放数据 - 将key和value进行映射

        maps.put(1,"奔驰");
        maps.put(2,"奥迪");
        maps.put(3,"宝马");

        //如果有重复的,则覆盖.
        maps.put(3,"大众");

        //通过key来获取value - key是唯一的
        System.out.println(maps.get(2));//奥迪

        //判断map集合中是否包含某个key
        System.out.println(maps.containsKey(4));//false

        //获取map集合中的所有的value.
        Collection<String> collections = maps.values();
        System.out.println(collections);

        //清空集合
//        maps.clear();

        //根据key来做移除操作
       // maps.remove(2);

//        maps.forEach(new BiConsumer<Integer, String>() {
//            @Override
//            public void accept(Integer integer, String s) {
//                System.out.println(integer+":"+s);
//            }
//        });

        //JDK8.0的迭代的方式
        maps.forEach((k,v) -> System.out.println(k+"->"+v) );

        //3. 直接输出
        System.out.println(maps);

        System.out.println("=====JDK8.0 脱手写出map集合特有的迭代方式=====");

        //第一种方式 - 将所有的key全部获取封装到set集合中
        Set<Integer> keySets = maps.keySet();
        //使用set集合的迭代器 - 迭代出所有的key
        Iterator<Integer> iterSet = keySets.iterator();
        while(iterSet.hasNext()){
            Integer key = iterSet.next();
            //根据key来获取value
            String value = maps.get(key);
            System.out.println(key+"="+value);
        }

        System.out.println("===第二种方式===");

        //第二种方式 - 返回key,value,封装到一个Entry对象中
        Set<Map.Entry<Integer,String>> entrySets = maps.entrySet();

        //迭代set集合,每次拿出来的都是Entry对象
        Iterator<Map.Entry<Integer,String>> entryIterator = entrySets.iterator();
        while(entryIterator.hasNext()){
            Map.Entry<Integer,String> entry = entryIterator.next();
            //获取key
            Integer key = entry.getKey();
            //获取value
            String value = entry.getValue();
            System.out.println(key+"-->"+value);
        }
    }
}
