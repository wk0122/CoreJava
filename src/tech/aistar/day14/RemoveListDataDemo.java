package tech.aistar.day14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:集合的删除操作.
 * @date 2019/4/12 0012
 */
public class RemoveListDataDemo {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("mysql");
        strList.add("xml");
        strList.add("xml");
        strList.add("xml");
        strList.add("redis");
        strList.add("xml");

        //List<String> temp = delByStrFromList(strList,"xml");
        //List<String> temp = delByStrFromList02(strList,"xml");
        //List<String> temp = delByStrFromList03(strList,"xml");
        //List<String> temp = delByStrFromList04(strList,"xml");
        List<String> temp = delByStrFromList05(strList,"xml");
        System.out.println(temp);
    }

    /**
     * 推荐使用的方式  -JDK8.0提供的删除的方式
     * @param strList
     * @param xml
     * @return
     */
    private static List<String> delByStrFromList05(List<String> strList, String xml) {
        if(null == strList || strList.isEmpty()){
            return strList;
        }
//        strList.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if(s.equals(xml))
//                    return true;
//                return false;
//            }
//        });
//        strList.removeIf(new Predicate<String>() {
//            @Override
//            public boolean test(String s) {
//                if(s.equals(xml))
//                    return true;
//                return false;
//                return s.equals(xml);
//            }
//        });

//        strList.removeIf(s -> {
//            if(s.equals(xml))
//                return true;
//            return false;
//        });

        strList.removeIf(s -> s.equals(xml));
        return strList;
    }

    /**
     * 迭代器的remove操作
     * @param strList
     * @param xml
     * @return
     */
    private static List<String> delByStrFromList04(List<String> strList, String xml) {
        if(null == strList || strList.isEmpty()){
            return strList;
        }
        Iterator<String> iter = strList.iterator();
        while(iter.hasNext()){
            String n = iter.next();
            if(n.equals(xml)){
                //strList.remove(n);//java.util.ConcurrentModificationException
                iter.remove();
            }
        }
        return strList;
    }

    /**
     * 增强for循环中不允许改变
     * @param strList
     * @param xml
     * @return
     */
    private static List<String> delByStrFromList03(List<String> strList, String xml) {
        //参数有效性判断
        if(null == strList || strList.isEmpty()){
            return strList;
        }

        //增强for循环是属于只读的
        for (String s:strList){
            if(s.equals(xml)){
                strList.remove(s);//java.util.ConcurrentModificationException - 线程非安全操作.
            }
        }
        return strList;
    }

    //       boolean remove(int index);
//      boolean remove(Object obj); - List接口中提供的,只能删除第一次出现的元素
    private static List<String> delByStrFromList02(List<String> strList, String xml) {
        //参数有效性判断
        if(null == strList || strList.isEmpty()){
            return strList;
        }
        for (int i = 0; i < strList.size(); i++) {
            if(strList.get(i).equals(xml)){
                //根据下标进行删除操作
                //strList.remove(i);
                //i--;
                strList.remove(strList.get(i));
                i--;
            }
        }

//        for(int i = strList.size()-1;i>=0;i--){
//            if(strList.get(i).equals(xml)){
//                //strList.remove(i);
//                strList.remove(strList.get(i));//根据元素进行删除
//            }
//        }
        return strList;
    }

    /**
     * 根据元素进行删除.
     * @param strList
     * @param xml
     */
    private static List<String> delByStrFromList(List<String> strList, String xml) {
        //参数有效性判断
        if(null == strList || strList.isEmpty()){
            return strList;
        }
        List<String> temp = new ArrayList<>();
        //遍历strList
        Iterator<String> iter = strList.iterator();
        while(iter.hasNext()){
            String s = iter.next();
            if(!s.equals(xml)){
                temp.add(s);
            }
        }
        return temp;
    }
}
