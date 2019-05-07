package tech.aistar.day03.method;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class ParamMethod {
    public static void main(String[] args) {
        String result = test(23,"java");//实参
        System.out.println(result);

        test02(10,30,50,60);
    }

    public static String test(int age,String name){//形参
        age*=10;
        name+="_12345";
        return name+":"+age;
    }

    /**
     * 可以定义一个不定长的参数
     * @param values
     */
    public static void test02(int... values){//value是的类型转换成数组.
       for(int t:values){
           System.out.println(t);
       }
    }
}
