package tech.aistar.day14.homework;

import java.util.*;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/16 0016
 */
@SuppressWarnings("all")
public class TestPurcase {
    public static void main(String[] args) {
        List<Purcase> list = new ArrayList<>();

        Purcase p1 = new Purcase("宝洁","洗手粉",18.5);
        Purcase p2 = new Purcase("联合利华","肥皂",4.5);
        Purcase p3 = new Purcase("宝洁","牙膏",32.5);
        Purcase p4 = new Purcase("宝洁","毛巾",14.5);
        Purcase p5 = new Purcase("洁利","洗面奶",26.0);
        Purcase p6 = new Purcase("好迪","洗发水",27.5);
        Purcase p7 = new Purcase("多芬","沐浴露",38.5);
        Purcase p8 = new Purcase("宝洁","洗洁精",3.4);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);

        //test01(list);

        test02(list);
    }

    /**
     * 使用使用map集合自带的entry对象 - 碰巧而已 - 结果展示的只有两列
     * @param list
     */
    private static void test02(List<Purcase> list) {
        //1.创建一个Map集合
        //key - 品牌名;value - 该品牌对应的所有的Purcase的集合
        Map<String,List<Purcase>> map = new HashMap<>();
        //2.遍历list,分类
        //根据不同的品牌进行分类存储.
        for (Purcase p:list){
            //获取品牌名
            String brand = p.getBrand();
            //判断map集合中是否已经包含brand
            if(map.containsKey(brand)){
                //应该根据key获取集合
                List<Purcase> oldPurcase = map.get(brand);
                oldPurcase.add(p);
            }else{
                //新建一个集合s
                List<Purcase> pList = new ArrayList<>();
                pList.add(p);
                //放入到map集合中
                map.put(brand,pList);
            }
        }
        //创建一个Map集合,用来封装brand - total;
        Map<String,Double> countMaps = new HashMap<>();

        //使用map集合的迭代器进行遍历
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext()){
            String brand = iter.next();//品牌名
            //该品牌对应的所有的Purcase对象
            List<Purcase> brands = map.get(brand);

            //定义一个变量,用来保存每个品牌的总价
            double total = 0.0d;

            for (Purcase p:brands){
                total += p.getCost();
            }
            //brand和total封装到map中
            countMaps.put(brand,total);
        }

        //使用map集合的特有的第二种迭代方式 - entry
        Set<Map.Entry<String,Double>> mapSets = countMaps.entrySet();

        Iterator<Map.Entry<String,Double>> mapIter = mapSets.iterator();

        //创建一个集合 - 存放entry对象
        List<Map.Entry<String,Double>> sortedList = new ArrayList<>();

        while(mapIter.hasNext()){
            Map.Entry<String,Double> entry = mapIter.next();

            sortedList.add(entry);
        }

        //排序
//        sortedList.sort(new Comparator<Map.Entry<String, Double>>() {
//            @Override
//            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
//                return 0;
//            }
//        });

        sortedList.sort((e1,e2)->(int)(e2.getValue() - e1.getValue()));

        sortedList.forEach(System.out::println);
    }

    /**
     * ArrayList - HashSet - HashMap -> 使用频率
     * 直接使用第三方实体类[封装性 - 封装数据 - 数据在内存中的载体] - 来存储我们统计得到的数据
     * @param list
     */
    private static void test01(List<Purcase> list) {
        //1.创建一个Map集合
        //key - 品牌名;value - 该品牌对应的所有的Purcase的集合
        Map<String,List<Purcase>> map = new HashMap<>();

        //2.遍历list,分类
        //根据不同的品牌进行分类存储.
        for (Purcase p:list){
            //获取品牌名
            String brand = p.getBrand();
            //判断map集合中是否已经包含brand
            if(map.containsKey(brand)){
                //应该根据key获取集合
                List<Purcase> oldPurcase = map.get(brand);
                oldPurcase.add(p);
            }else{
                //新建一个集合
                List<Purcase> pList = new ArrayList<>();
                pList.add(p);
                //放入到map集合中
                map.put(brand,pList);
            }
        }
        //定义一个PurcaseVo的集合 - 为排序做准备的
        List<PurcaseVo> sortVos = new ArrayList<>();

        //使用map集合的迭代器进行遍历
        Set<String> keySet = map.keySet();
        Iterator<String> iter = keySet.iterator();
        while(iter.hasNext()){
            String brand = iter.next();//品牌名
            //该品牌对应的所有的Purcase对象
            List<Purcase> brands = map.get(brand);

            //定义一个变量,用来保存每个品牌的总价
            double total = 0.0d;

            for (Purcase p:brands){
                total += p.getCost();
            }
            //创建一个排序的对象
            PurcaseVo vo = new PurcaseVo(brand,total);
            //放入到排序的集合中
            sortVos.add(vo);
        }

        //JDK8.0
        //1. List本身的sort方法
        //2. Stream中的sort方法 - > 转换成List
        //3. Collections中的sort方法
        sortVos.sort((o1, o2) -> (int)(o2.getPrice() - o1.getPrice()));

        //遍历
        sortVos.forEach(s -> System.out.println(s));
    }
}
