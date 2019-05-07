package tech.aistar.day04.homework;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:猜数字
 * @date 2019/3/29 0029
 */
public class TestGuessNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //定义一个计数器
        int count = 0;

        //定义一个初始值
        int start = 1;
        int end = 100;

        //随机一个幸运的数字
        int n = (int) (Math.random()*100+1);
        System.out.println("幸运数字:"+n);

        System.out.print("请您猜数,范围[1-100]>");

        do{
            int m = sc.nextInt();//猜的数字
            count++;
            //进行判断
            if(m < n){
                start = m;
                System.out.print("请您猜数,太小了,范围["+start +" - "+end+"]>");
                //count++;
            }else if(m>n){
                end = m;
                System.out.print("请您猜数,太大了,范围["+start +" - "+end+"]>");
                //count++;
            }else{
               // count++;
                System.out.println("恭喜您,猜中了!幸运数字是"+n+",您总共猜了"+count+"次!");
                break;
            }

        }while(true);
        sc.close();
    }
}
