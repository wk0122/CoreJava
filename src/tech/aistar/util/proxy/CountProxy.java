package tech.aistar.util.proxy;

import org.omg.CORBA.portable.InvokeHandler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/19 0019
 */
public class CountProxy implements InvocationHandler {
    private Object obj;

    public CountProxy(){

    }

    public CountProxy(Object obj){
        this.obj= obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object t = null;
        System.out.println("before..."+method);
        System.out.println("参数:"+Arrays.toString(args));
        System.out.println("proxy:"+proxy.getClass());
        t =  method.invoke(obj,args);
        System.out.println("after..."+method);
        return t;
    }
}
