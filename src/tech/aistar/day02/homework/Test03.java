package tech.aistar.day02.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示: 条件的互斥
 * @date 2019/3/26 0026
 */
public class Test03 {
    public static void main(String[] args) {
        int score = 88;

//        if(score<0 || score>100)
//            System.out.println("sorry,score is not ok!");
//            return;//不在if的块中

        if(score < 0 || score>100){
            System.out.println("sorry,score is not ok!");
            return;
        }
        //return;
       // System.out.println("====");

        if(score>=90){
            System.out.println("优秀!");
        }else if(score>=80){
            System.out.println("良好!");
        }else if(score>=70){
            System.out.println("中等");
        }else if(score>=60){
            System.out.println("及格");
        }else{
            System.out.println("不及格");
        }

        System.out.println("====");
     /*   int a = 10;
        if(a<20){
            System.out.println(1);
        }else if(a<15){
            System.out.println(2);
        }*/
    }
}
