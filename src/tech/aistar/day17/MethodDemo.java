package tech.aistar.day17;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:反射操作方法
 * @date 2019/4/19 0019
 */
public class MethodDemo {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //1. 获取class实例
        Class<?> c = Point.class;

        //2. 获取所有的方法实例
        Method[] methods = c.getDeclaredMethods();
        //System.out.println(methods.length);

        for(Method m:methods){
            //System.out.println(m);
            //获取方法的修饰符
            System.out.print(Modifier.toString(m.getModifiers())+"\t");

            //获取方法的返回类型
            Class<?> returnType = m.getReturnType();
            //System.out.println(returnType);
            System.out.print(returnType.getSimpleName()+"\t");

            //获取方法的名称
            System.out.print(m.getName());

            //返回方法的参数列表
            Class<?>[] paramsType = m.getParameterTypes();

            StringBuilder paramsBuilder = new StringBuilder();
            paramsBuilder.append("(");

            //拼接类型
            for (int i = 0; i < paramsType.length; i++) {
                paramsBuilder.append(i!=paramsType.length-1?paramsType[i].getSimpleName()+",":paramsType[i].getSimpleName());
            }
            paramsBuilder.append(")");

            System.out.println(paramsBuilder);
        }
        System.out.println("==========方法的调用========");
        //通过反射来构建对象
        Point p = (Point) c.newInstance();

        //空参
        //根据方法名来获取方法的method对象
        try {
            //默认调用的就是空参的
            //Method m1 = c.getDeclaredMethod("test01");
            //m1.invoke(p);//没有进行传参

            Method m1 = c.getDeclaredMethod("test01",new Class<?>[]{});
            m1.invoke(p,null);

            //一参
//            Method m2 = c.getDeclaredMethod("test01",int.class);
//            m2.invoke(p,23);

            Method m2 = c.getDeclaredMethod("test01",new Class<?>[]{int.class});
            m2.invoke(p,23);

            //两参
            //Method m3 = c.getDeclaredMethod("test01",int.class,String.class);
            //m3.invoke(p,23,"tom");
            //m3.invoke(p,new Object[]{23,"tom"});

            Method m4 = c.getDeclaredMethod("test01",new Class<?>[]{int.class,String.class});
            m4.invoke(p,23,"tom");

            //私有
            Method m5 = c.getDeclaredMethod("test03");
            m5.setAccessible(true);
            m5.invoke(p);//java.lang.IllegalAccessException:

            //静态的
            Method m6 = c.getDeclaredMethod("test02");
            //m6.invoke(p);
            m6.invoke(null);

            //带返回类型的
            Method m7 = c.getDeclaredMethod("getResult",String.class);

            String result = (String) m7.invoke(p,"jack");
            System.out.println(result);

        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
