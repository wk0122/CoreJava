package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class WhileDemo {
    public static void main(String[] args) {
        //1.死循环
       /* while(true){
            System.out.println("我是死循环...");
        }*/
        //System.out.println();

        //2.while循环语句中,通常会出现打破循环的语句
        //输出1-10
        int i = 1;
        while(i<=10){
            System.out.println(i++);
        }
        System.out.println("====");
        int n = 1;
        while(true){
            System.out.println(n++);
            if(n==11){
                break;
            }
        }

        System.out.println("====");
        int m = 1;
        boolean flag = true;//标记位...
        while(flag){
            System.out.println(m++);
            if(m==11){
                flag = false;
            }
        }
    }
}
