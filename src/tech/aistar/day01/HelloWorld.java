//包的声明一定是出现在类文件中的首行
//包的名称是采用公司域名倒置 + 项目代号
//包的命名全部采用小写字母并且以.隔开
//不推荐使用java或者javax开头
package tech.aistar.day01;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;

/**
 * 文档注释 - 可以通过javadoc命令来生成文档树
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/25 002
 */
public class HelloWorld {

    Workbook workbook = new HSSFWorkbook();

    //快键键 psvm
    //main方法是程序的主入口
    //一旦运行,将会自动进入到main方法体中去执行里面的程序
    public static void main(String[] args) {
//        快速添加多行注释 ctrl + shift + /
//        撤销多行注释 ctrl + shift + /
//
//        快速添加单行注释 ctrl + /
//        快速删除单行注释 ctrl + /
//
//        输出一句话 - 快键键 sout
//        使用的是jdk中的内置的java.lang.System类
//        如何查看内置的类的源码 - 快捷键ctrl + shift + t 输入 类名
        //ctrl + l - 定位到具体的某一行

        //删除单行 ctrl + d
        //快速复制一行 ctrl + alt + DOWN
        System.out.println("HelloWorld");
        System.out.println("Java天下无敌");

        System.out.println("=====华丽丽的分割线====");
        //println()方法的底层调用的是print()方法
        //print本身是不会换行的
        System.out.print("好好学习\n");
        System.out.println("up up day");

        //ctrl + o 查看大纲视图

        //学完方法和OO之后再来探究
        //调用System.out的时候得到是一个PrintStream对象
        //实际上println方法是PrintStream类中的,而不是System直接拥有的.
        System.out.println(10);
        System.out.println(3.14);

        //2 + 3 是一个合理的表达式 - 由变量或者常量或者字面量以及运算符号组成的合理的语句
        System.out.println(2+3.5);

        System.out.println(2+3+""+(5+2));//552
    }
}
