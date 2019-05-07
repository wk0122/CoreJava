package tech.aistar.day04;

import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:nextInt和nextLine和nextDouble混用注意点
 * @date 2019/3/28 0028
 */
public class ScannerExercise {
    public static void main(String[] args) {
        /*
                ==a==
                10
                ==b==
                ==c==
                3.14
                a:10
                b:
                c:3.14
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("==a==");
        int a = sc.nextInt();
        System.out.println("==b==");
        String b = sc.nextLine();//失效了..
        System.out.println("==c==");
        double c = sc.nextDouble();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
}
