package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:ArrayList
 * @date 2019/4/12 0012
 */
public class ArrayListDemo {
    public static void main(String[] args) {
        //1.构建ArrayList的方式
        //a. JDK5.0之前,没有引入泛型的概念 - 类型不安全的集合框架
        List list01 = new ArrayList();
        //测试可以添加的元素有哪些呢?
        list01.add(100);//ok
        list01.add("java");//ok
        list01.add(3.14);//ok
        list01.add(true);//ok
        list01.add(null);//ok

        //直接输出的
        System.out.println(list01);

        //b. JDK5.0以后引入了泛型的概念 - JCF - 类型安全的集合框架.
        //只能向集合中添加字符串
        //List<String> strList = new ArrayList<String>();

        //JDK7.0以后,运行时中的<>中的泛型可以省略不写
        List<String> strList = new ArrayList<>();
        strList.add("mysql");
        strList.add("xml");
        strList.add("redis");
        strList.add("xml");
        System.out.println(strList);

        //c. ArrayList<String> list = new ArrayList<>();

        //d. 使用java.util.Arrays类中的asList方法 - "坑"
        //List<String> list03 = Arrays.asList("a","b","b");//Ararys$ArrayList - 代理对象 - 调用remove - java.lang.UnsupportedOperationException
        //System.out.println(list03);

        List<String> list03 = new ArrayList<>(Arrays.asList("a","b","b"));

        System.out.println("==演示方法==");

        //移除集合中出现的第一个元素
        //strList.remove("xml");
        System.out.println(strList);

        //list03.remove("b");

        //根据下标进行查询
        System.out.println(strList.get(1));//集合的下标范围 0~集合大小-1
        //System.out.println(list03.get(1));

        //获取集合的大小
        System.out.println(strList.size());//4

        //判断集合中是否含有元素
        System.out.println(strList.isEmpty());//false

        //判断集合中是否包含某个元素
        System.out.println(strList.contains("redis"));//true

        //根据下标进行删除
        //strList.remove(1);
        //System.out.println(strList);

        //找出元素第一次出现的下标
        System.out.println(strList.indexOf("xml"));

    }
}
