package tech.aistar.snake.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:动态代理 - 程序运行期间创建的,内存中
 * @date 2019/4/22 0022
 */
public class UserDaoImplHandler implements InvocationHandler{

    private Object obj;

    public UserDaoImplHandler(Object obj){
        this.obj = obj;
    }

    /**
     * 底层通过反射触发调用的
     * @param proxy 在内存中生成的代理对象
     * @param method 当前被代理对象正在执行的方法对应的method
     * @param args 当前被代理对象正在执行的方法对应的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //增加日志功能...
        System.out.println("before...logging....");

        System.out.println("参数列表:"+ Arrays.toString(args));

        //反射进行调用...
        //有返回类型...
        Object result = method.invoke(obj,args);//反射调用真正的业务逻辑代码...

        System.out.println("after...logging....");

        return result;
        //如果后续会使用到proxy - 代理对象
        //那么直接返回...
    }
}
