package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/2 0002
 */
public class PrintfDemo {
    public static void main(String[] args) {
        String name = "Carmen";
        double salary = 2500.577d;
        int age = 23;
        String job = "程序员鼓励师";

        //没有进行格式化输出之前
        System.out.println(age+"的"+name+",他的工资是:"+salary+",职位是:"+job);

        //使用格式化输出
        System.out.printf("%d的%s,他的工资是:%f,职位是:%s\n",age,name,salary,job);

        //小数 - 精度 -  .precision
        System.out.printf("%d的%s,他的工资是:%.2f,职位是:%s\n",age,name,salary,job);

        //%s通配
        System.out.printf("%s的%s,他的工资是:%s,职位是:%s\n",age,name,salary,job);

        //占位符的宽度
        System.out.printf("%d的%10s,他的工资是:%15.2f,职位是:%s\n",age,name,salary,job);

        //设置左对齐
        System.out.printf("%d的%10s,他的工资是:%-15.2f,职位是:%s\n",age,name,salary,job);

        //占位符和变量的索引的位置
        System.out.printf("%2$d的%1$10s,他的工资是:%3$-15.2f,职位是:%4$s\n",name,age,salary,job);

        //System.out.printf("%d","hello");//java.util.IllegalFormatConversionException 非法格式化占位符异常
    }
}
