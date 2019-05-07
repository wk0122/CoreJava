package tech.aistar.day14;

import java.util.TreeSet;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:有序不可重复的
 * @date 2019/4/15 0015
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        User u1 = new User(1,"1001","admin","admin",23);
        User u2 = new User(2,"1002","tom","admin",25);
        User u3 = new User(3,"1003","jack","admin",18);

        User u4 = new User(1,"1006","admin","admin",25);

        //自然排序的规则
        //那么添加到容器中的每个元素应该去实现java.lang.Comparable接口
        TreeSet<User> users = new TreeSet<>();

        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);

        users.forEach(System.out::println);

    }
}
