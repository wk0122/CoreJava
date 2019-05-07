package tech.aistar.snake.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/22 0022
 */
public class TestUserDaoImplProxy {
    public static void main(String[] args) {

        //创建被代理的类
        IUserDao userDao = new UserDaoImpl();

        InvocationHandler v = new UserDaoImplHandler(userDao);

        //创建代理类对象
       IUserDao proxy = (IUserDao) Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),v);

       String result = proxy.findAll("tom");
        System.out.println("result:"+result);
       System.out.println("============");

       proxy.update();

        System.out.println("====");

        //将内存中生成的代理对象写入到.class字节码文件中
        System.getProperties().put("tech/aistar/day17",true);
    }
}
