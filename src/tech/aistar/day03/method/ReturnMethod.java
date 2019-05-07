package tech.aistar.day03.method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:带有返回类型的
 * @date 2019/3/27 0027
 */
public class ReturnMethod {
    public static void main(String[] args) {
        //1.非静态
        //创建对象
        ReturnMethod m = new ReturnMethod();
        //方法的返回类型是什么,就用什么类型去存储

        //将test()方法的执行结果赋值[保存到]给了double类型的变量result中.
        double result = m.test();//变量的赋值方式 - 利用方法进行赋值.
        //m.test();
        System.out.println("result:"+result);

        //可以使用比返回类型更大的类型去存储
        double r = m.test03();
        System.out.println("r:"+r);
    }

    public double test(){
        int a = 10;
        double d = 3.14;
        return a + d;//返回出结果的类型应该和方法的返回类型保持一致
        //return "ok";
        //return a;//返回的结果类型可以小于方法的返回类型[满足自动类型转换]
    }

    /**
     * 返回结果类型大于方法的返回类型
     * @return
     */
    public int test03(){
        return (int) 100.54;//如果返回的结果的类型大于方法定义时的返回类型,需要进行类型的强制转换
    }

    public String test02(){
        int a = 0;
        if(a<0){
            return "ok";
        }
        return "false";
    }
}
