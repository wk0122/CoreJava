package tech.aistar.day17;

import java.lang.reflect.Array;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:反射操作数组
 * @date 2019/4/22 0022
 */
public class ArrayDemo {
    public static void main(String[] args) {
        Point[] points = new Point[3];
        points[0] = new Point(10,"tom");
        points[1] = new Point(20,"success");
        points[2] = new Point(30,"james");

        printArr(points);

        System.out.println("====");

        Point[] extendsArr = (Point[]) extendsArr(points,3);

        printArr(extendsArr);
    }

    /**
     * 反射数组数组.
     * @param points
     */
    private static void printArr(Point[] points){
        //1. 获取数组的长度
        int len = Array.getLength(points);

        //2. 通过循环,反射获取数组中的元素
        for (int i = 0; i < len; i++) {
            //static Obejct get(Object arr,int index);
            Point p = (Point) Array.get(points,i);
            System.out.println(p);
        }
    }

    /**
     * 反射对数组进行扩容操作.
     * @param points
     * @param newLen 扩容的长度.
     * @return
     */
    private static Object extendsArr(Point[] points,int newLen){
        //反射创建出新的数组 - 元素类型,数组的长度.

        //获取数组的class实例
        Class<?> c = points.getClass();

        //获取数组的组件类型
        Class<?> componentType = c.getComponentType();

        //获取新的数组的长度
        int length = Array.getLength(points);
        int len = length + newLen;

        //反射创建新的数组
        Object objArr = Array.newInstance(componentType,len);

        //将原来数组中的原有的数据存放到新的数组中去
        for (int i = 0; i < length; i++) {
            //根据下标反射获取数组中的元素
            Object v = Array.get(points,i);

            //将该值重新设置到新的数组中去.
            Array.set(objArr,i,v);
        }
        return objArr;
    }
}
