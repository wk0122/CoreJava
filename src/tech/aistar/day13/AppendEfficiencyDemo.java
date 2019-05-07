package tech.aistar.day13;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:拼接效率问题
 * @date 2019/4/11 0011
 */
public class AppendEfficiencyDemo {
    public static void main(String[] args) {
        testStringBuilder();
        testStringBuffer();
        testString();
    }

    public static void testString(){
        String str = "";

        //利用时间毫秒数
        long time = System.currentTimeMillis();//new Date().getTime()

        for (int i = 0; i < 1000000; i++) {
            str+=i;
        }
        long t = System.currentTimeMillis() - time;
        System.out.println("String->"+t+"ms");
    }

    public static void testStringBuilder(){
        StringBuilder str = new StringBuilder();

        //利用时间毫秒数
        long time = System.currentTimeMillis();//new Date().getTime()

        for (int i = 0; i < 1000000; i++) {
            str.append(i);
        }
        long t = System.currentTimeMillis() - time;
        System.out.println("StringBuilder->"+t+"ms");
    }

    public static void testStringBuffer(){
        StringBuffer str = new StringBuffer();

        //利用时间毫秒数
        long time = System.currentTimeMillis();//new Date().getTime()

        for (int i = 0; i < 1000000; i++) {
            str.append(i);
        }
        long t = System.currentTimeMillis() - time;
        System.out.println("StringBuffer->"+t+"ms");
    }
}
