package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class ForDemo01 {
    public static void main(String[] args) {
        //1. 死循环 - 三个表达式全部省略
//        for(;;){
//            System.out.println("我是一个死循环");
//        }

        //2. 变态...
        //在开发的第一个版本中故意延迟加载的速度...
        //第二个版本要想提高速度 - 加钱...
        //for(int i=0;i<999999999;i++);

        //3. 常规的使用
//        for(int i =1;i<=10;i++){
//            System.out.println(i);
//        }

//        int i = 1;
//        for(;i<=10;){
//            System.out.println(i);
//            i++;
//        }

        //4. 打印'a' - > 'z'
//        for(char c = 'a';c<='z';c++){
//            System.out.println(c);
//        }

        //逆向
        /*for(char c = 'z';c>='a';c--){
            System.out.println(c);
        }*/

        //打印'A' -> 'Z'
        for(int i=65;i<=90;i++){
            System.out.println((char)i);
        }
    }
}
