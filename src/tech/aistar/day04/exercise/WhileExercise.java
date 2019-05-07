package tech.aistar.day04.exercise;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class WhileExercise {
    public static void main(String[] args) {
//        String s = "";
//        s+=1;
//        s+=2;
//        s+=3;
//
//        StringBuilder builder = new StringBuilder();
//        builder.append(1);
//        builder.append(2);
//        builder.append(3);
//        System.out.println(builder);
        //System.out.println(getMaxCommon(12,20));
        //System.out.println(getMinNum(12,20));
        //System.out.println(getBits(12325));

        //System.out.println(new StringBuilder("12345").reverse());

        //System.out.println(reverse(132));

        //System.out.println(reverseStr(4567));

        //System.out.println(Integer.toBinaryString(10));

        //System.out.println(toBinaryString(10));

        System.out.println(toBinaryString2(10));
    }

    public static int reverseStr(int n){
        //定义一个字符串
        String str = "";
        while(true){
            //1.获取余数
            int y = n % 10;//123 % 10 = 3

            str = str + y;//""+3 = str = "3"

            //2.获取商
            int s = n / 10;//123/10 = 12

            //循环退出的条件
            if(s == 0){
                break;
            }
            n = s;
        }
        //将字符串转换成int类型 - 字符串中的元素一定只能是包含数字的  "abc"
        //通过java.lang.Integer类中的方法
        //return str;
        int result = Integer.parseInt(str);
        return result;
    }

    /**
     * 将数字逆序输出
     * @param n
     * @return
     */
    public static int reverse(int n){
        //定义一个变量,控制次方

        int total = 0;
        while(true){
            //1.获取余数
            int y = n % 10;//123 % 10 = 3

            //拼接余数 0*10 + 3 = 3
            //3*10 + 2 = 32
            total = total*10 + y;

            //2.获取商
            int s = n / 10;//123/10 = 12

            //循环退出的条件
            if(s == 0){
                break;
            }
            n = s;
        }
        return total;
    }

    /**
     * 求出几位数...
     * @param n
     * @return
     */
    public static int getBits(int n){
        //定义一个计数器
        int count = 0;
        while(true){
            n = n / 10;//1234/10 = 123
            count++;
            if(n == 0)
                break;
        }
        return count;
    }


    /**
     * 求出俩个数的最小公倍数 = a * b / (a和b的最大公约数)
     * @param m
     * @param n
     * @return
     */
    public static int getMinNum(int m,int n){
        return m*n/getMaxCommon(m,n);
    }

    /**
     * 求出俩个数的最大公约数
     * @param m
     * @param n
     * @return
     */
    public static int getMaxCommon(int m,int n){
        while(true){
            //获取余数
            int y = m % n;//20 % 12 = 8

            //循环退出的条件
            if(y == 0){
                break;
            }
            m = n;//m = 12
            n = y;//n = 8
        }
        return n;
    }

    /**
     * 十进制转换成二进制...
     * @param n
     * @return
     */
    public static int toBinaryString(int n){
        //定义一个次方的变量
        int pow = 0;
        //定义一个total
        int total = 0;
        while(true){
            //获取商
            int s = n / 2;//10 / 2 = 5
            //获取余数
            int y = n % 2;//10 % 2 = 0

            //total = 0
            //1*10^1 + 0 = 10
            //0 + 10 = 10
            //1*10^3 + 10 = 1010
            total = (int) (y * Math.pow(10,pow++)+total);

            //拼接余数  0 1 0 1
            //          1 0 1 0


            //商是0的时候,循环退出
            if(s == 0)
                break;
            n = s;

        }
        return total;
    }

    public static int toBinaryString2(int n){

        //定义一个java.lang.StringBuilder
        StringBuilder builder = new StringBuilder();

        while(true){
            //获取商
            int s = n / 2;//10 / 2 = 5
            //获取余数
            int y = n % 2;//10 % 2 = 0
            builder.append(y);// 0 1 0 1

            //商是0的时候,循环退出
            if(s == 0)
                break;
            n = s;

        }
        //将StringBuilder对象转换成int类型
        //玩的就是API...
        return Integer.parseInt(builder.reverse().toString());
    }
}
