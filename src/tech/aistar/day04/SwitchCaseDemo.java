package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class SwitchCaseDemo {
    public static void main(String[] args) {
       //求出1-3之间的随机数
        int n = (int) (Math.random()*3+1);
        System.out.println("随机数:"+n);

        switch (n){//byte short int char Byte Short Integer Character enum(枚举类型)
                  //JDK7.0支持String
            case 1:
                System.out.println("==芙蓉姐姐==");
                //break;//一旦执行到break语句,那么将会跳出switch块...
                //如果没有break语句,那么将会继续执行下面的case块中的程序,直到遇到break语句或者到达switch块的末尾才会跳出.
//            default://如果n没有匹配到任何的一个case块,那么将会进入到default块中去执行
//                System.out.println("==阿纯==");
//                break;
            case 2:
                System.out.println("==凤姐==");
                //break;
            //default可以出现在任何位置,也可以省略不写
            default://如果n没有匹配到任何的一个case块,那么将会进入到default块中去执行
                System.out.println("==阿纯==");
                break;
        }
    }
}
