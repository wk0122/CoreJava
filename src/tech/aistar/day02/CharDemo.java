package tech.aistar.day02;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:char类型
 * @date 2019/3/26 0026
 */
public class CharDemo {
    public static void main(String[] args) {
        int o = 032;//八进制[以0开头]->十进制  3*8^1+2*8^0 = 26
        System.out.println("o:"+o);//26

        int h = 0xffff;
        System.out.println("h:"+h);

        //char c1 = 65535;
        //char c1 = 65;
        char c1 = 060;//八进制
        System.out.println("c1:"+c1);

        //char类型的数据计算的时候,底层都是转换成ascii对应的数值
        char cc = '中'+'国';//计算...
        System.out.println(cc);

        char c2 = '0';

        char c3 = 'a'+1;
        //'a' -> 97
        //97 + 1 = 98
        //char c3 = (char)98;
        //底层char c3 = (char)
        System.out.println("c3:"+c3);//b

        int result = 'a'+1;
        System.out.println("result:"+result);//97

        int m = 1;
        char n = (char) ('a' + m);
        System.out.println("n:"+n);//b

        char name = '\u7ba1';
        System.out.println(name);
        //通过cmd - native2ascii - 查看中文的unicode编码

        //可以存放转义字符
        char sign = '\n';
        System.out.println("好"+sign+"人");


    }
}
