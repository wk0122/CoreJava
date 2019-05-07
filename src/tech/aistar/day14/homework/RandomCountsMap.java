package tech.aistar.day14.homework;

import javax.swing.text.html.parser.Entity;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:统计每个随机数出现的次数
 * @date 2019/4/16 0016
 */
public class RandomCountsMap {
    public static void main(String[] args) {
        int[] arr = new int[15];

        for(int i = 0;i<arr.length;i++){
            arr[i] = (int) (Math.random()*5+1);
        }
        System.out.println(Arrays.toString(arr));

        count(arr);
    }

    /**
     * [3, 2, 2, 2, 5, 4, 5, 5, 1, 5, 2, 5, 4, 2, 2]
     * @param arr
     */
    private static void count(int[] arr) {
        //创建一个Map集合,key就是随机数,value就是随机数出现的次数
        Map<Integer,Integer> map = new HashMap<>();

        //2. 遍历数组
        for(int n:arr){
            //判断map集合中是否包含key
            if(map.containsKey(n)){//判断集合中是否已经包含了随机数
                //根据key来获取次数
                map.put(n,map.get(n)+1);
            }else{
                //直接放
                map.put(n,1);
            }
        }

        List<Map.Entry<Integer,Integer>> sortList = new ArrayList<>();

        Set<Map.Entry<Integer,Integer>> set = map.entrySet();
        Iterator<Map.Entry<Integer,Integer>> iter = set.iterator();
        while(iter.hasNext()){
            sortList.add(iter.next());
        }

        sortList.stream().sorted((o1,o2)->o2.getValue() - o1.getValue()).collect(Collectors.toList()).forEach(System.out::println);

    }
}
