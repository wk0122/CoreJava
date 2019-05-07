package tech.aistar.day04;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:获取键盘输入
 * @date 2019/3/28 0028
 */
//@SuppressWarnings("all")//抑制所有的警告
public class ScannerDemo {
    public static void main(String[] args) {
        //1.导包java.util.Scanner
        //2.创建对象
        //它是一个昂贵的资源 - 使用之前,需要及时释放空间.
        Scanner sc = new Scanner(System.in);


        System.out.print("请您输入姓名:>");
        String name = sc.nextLine();//获取字符串...
        System.out.println("姓名是:"+name);

        System.out.print("请你输入一个整数:>");
        //3.从键盘获取整数.
        //int nextInt();//只能获取整数
        //对象调用方法
        //当程序运行到此处的时候,将会进入到阻塞状态.
        //等待用户输入,直到用户输入完毕之后,敲enter,才会继续执行
        int n = sc.nextInt();//从键盘输入值保存到变量n中
        //如果输入的是非数字的话,将会抛出异常java.util.InputMismatchException 输入类型不匹配

        System.out.println("您刚刚输入的整数是:"+n);

        //关闭资源
        sc.close();
    }
}
