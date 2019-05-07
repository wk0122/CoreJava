package tech.aistar.day17;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:反射获取字段信息
 * @date 2019/4/19 0019
 */
public class FieldDemo {
    public static void main(String[] args) {
        //1.获取Point类对应的class实例
        //class实例是类加载器加载Point类的时候,由JVM在内存中创建的
        //我们只能获取class实例
        try {
            //此处的class实例c中存放的就是关于Point类所有的信息
            //class是用来描述Ponit类的类
            Class<?> c = Class.forName("tech.aistar.day17.Point");

            //2. 获取所有的公共的字段[属性]
           // Field[] fields = c.getFields();

            //3. 获取所有的声明的字段[包括私有的]
            Field[] fields = c.getDeclaredFields();
            //System.out.println(fields.length);

            for(Field f:fields){
                //System.out.println(f);
                //获取属性的修饰符
                //System.out.println(f.getModifiers());
                System.out.print(Modifier.toString(f.getModifiers())+"\t");

                //获取属性的数据类型
                Class<?> typeClass = f.getType();
                //System.out.println(typeClass);
                //获取类型的全限定名
               // System.out.println(typeClass.getName());

                //获取类型的简称
                System.out.print(typeClass.getSimpleName()+"\t");

                //获取属性的名称
                System.out.println(f.getName());
            }
            System.out.println("==================获取单个字段==============");
            //获取属性x对应的Field实例
            Field xField = c.getDeclaredField("x");

            System.out.println(xField);

            //反射创建对象
            //Point p = new Point();
            //通过反射调用空参构造方法
            Point p = (Point) c.newInstance();

            //让私有的属性可访问
            xField.setAccessible(true);

            //该给字段设置值
            //私有的属性如果直接进行赋值的话,那么会抛出java.lang.IllegalAccessExcepion非法访问异常
            xField.set(p,23);

            //设置name的值
            Field nameField = c.getDeclaredField("name");
            nameField.setAccessible(true);
            nameField.set(p,"tom");

            System.out.println(p);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }
}
