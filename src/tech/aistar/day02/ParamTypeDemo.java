package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:变量的分类
 * @date 2019/3/26 0026
 */
public class ParamTypeDemo {
    //类变量 - 对象共享
    private static int age = 100;

    //成员变量
    private String name = "success";

    public static void main(String[] args) {
        //局部变量
        int a = 100;

        //代码块
        //演示变量的生命周期 - 存在于它所在的{}中的
        {
            int b = 200;//此处的变量b仅仅存在于它自己的{}中
            //一旦离开了{},那么b销毁.
            System.out.println("a:" + a);
        }
        //System.out.println("b:"+b);//error
    }
}
