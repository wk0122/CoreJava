package tech.aistar.util.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/19 0019
 */
public class TestCountProxy {
    public static void main(String[] args) {
        Count c = new CountImpl();

        InvocationHandler cp = new CountProxy(c);

        Count impl = (Count) Proxy.newProxyInstance(c.getClass().getClassLoader(),c.getClass().getInterfaces(),cp);
        System.out.println(impl.getClass());

        String result = impl.query();

        System.out.println("result:"+result);
        
    }
}
