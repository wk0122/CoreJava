package tech.aistar.day13.homework;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:条形码
 * @date 2019/4/12 0012
 */
public class BarCodeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请您输入13位的条形码:>");
        //参数有效性判断
        String line = sc.nextLine();
        if(!line.matches("\\d{13}")){
            System.out.println("输入规范的条形码!");//6901234567892
            return;
        }
        //定义一个变量,用来保存偶数位之和
        int sum1 = 0;
        for (int i = 1; i < line.length()-1; i+=2) {
            //sum1+=line.charAt(i)-'0';//巧用char类型底层计算的时候会自动转换成ascii码来进行计算的.
            //char -> String -> Integer
            sum1+= Integer.parseInt(String.valueOf(line.charAt(i)));
        }

        sum1*=3;

        //计算奇位
        int sum2 = 0;
        for (int i = 0; i < line.length()-2; i+=2) {
            sum2 += line.charAt(i) - '0';
        }
        int result = sum1 + sum2;

        if(result % 10 ==0){
            if(line.charAt(line.length()-1)-'0' == 0){
                System.out.println("正品!");
            }else{
                System.out.println("次品!");
            }
        }else{
            //int n = result/10*10+10;//
            int n = 10 - result%10;
            if(line.charAt(line.length()-1)-'0' == n){
                System.out.println("正品!");
            }else{
                System.out.println("次品!");
            }
        }
    }
}
