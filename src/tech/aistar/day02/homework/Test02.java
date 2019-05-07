
package tech.aistar.day02.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:判断某年某月的天数
 * @date 2019/3/26 0026
 */
public class Test02 {

    public static void main(String[] args) {
        //定义一个变量year
        int year = 2012;

        //定义一个变量month
        int month = 2;

        //进行参数有效性判断
        if(year<0){
            System.out.println("sorry,year is not right!");
            //使用return关键字,来终止代码的运行
            return;
        }
        if(month<1 || month>12){
            System.out.println("sorry,month is not right!");
            return;
        }

        //定义一个变量,用来保存最大的天数
        int days = -1;

        //代码逻辑的处理...
        if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12){
            days = 31;
        }else if(month == 2){
            days = 28;
            //判断闰年...
            //当if语句块中的代码只有一行的时候,那么{}是可以省略不写的
//            if(year % 400 == 0 || (year%4==0 && year%100!=0)){
//                days+=1;
//            }
            if(year % 400 == 0 || (year%4==0 && year%100!=0))
                //一定要缩进四格
                days+=1;
        }else{
            days = 30;
        }
        System.out.println(year+"年"+month+"月,最大天数是:"+days);
    }

}
