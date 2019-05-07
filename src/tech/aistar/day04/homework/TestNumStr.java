package tech.aistar.day04.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/29 0029
 */
public class TestNumStr {
    public static void main(String[] args) {
        test(6);
        System.out.println("===");
        test01(9);
        System.out.println("===");
        test03();
        System.out.println("===");
        test05();
    }

    /**
     *   1!=1
         2!=2
         3!=6
         4!=24
         5!=120
         6!=720
         7!=5040
         8!=40320
         9!=362880
         10!=3628800

         输出最终结果：
         1!+2!+3!+4!+5!+6!+7!+8!+9!+10!=4037913
     */
    public static void test(int n){//n代表控制显示的行数
        //定义一个变量,用来保存中间的每个数的阶乘的结果
        int sum = 1;
        //定义一个变量,用来保存所有数的阶乘的结果
        int total= 0;
        //定义一个字符串用来拼接最终的表达式1!+2!+3!+4!+5!+6!+7!+8!+9!+10!
        String str = "";
        for(int i=1;i<=n;i++){
            sum*=i;
            System.out.println(i + "!="+sum);
            total+=sum;

            //最后一个比较特殊,数字!=组成,其余的都是由数字!+组成
            str += i!=n ? (i+"!+"):(i+"!=");

        }
        System.out.println(str + total);
    }

    /**
     *   1*8+1= 9
         12*8+2= 98
         123*8+3= 987
         1234*8+4= 9876
         12345*8+5= 98765
         123456*8+6= 987654
         1234567*8+7= 9876543
         12345678*8+8= 98765432
         123456789*8+9= 987654321
     * @param n
     */
    public static void test01(int n){
        //定义一个变量
        int total = 0;
        for(int i=1;i<=n;i++){
            total = total*10 + i;
            System.out.println(total + "*" + 8 + "+" + i + "=" + (total*8+i));
        }
    }

    /**
     * 空心的菱形
     *              *
     *             * *
     *            *   *
     *           *     *
     *          *       *
     *           *     *
     *            *   *
     *             * *
     *              *
     *
     *      左上 - i=0 j=4   i=1  j=3
     *      右上 i = 0 j = 4   i = 1 j=5  i=2 j=6
     *      左下 i=4 j=0  i=5 j=1
     *      右下 i=4 j = 8   i = 5 j = 7
     */
    public static void test03(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(i+j == 4 || j - i == 4 || i - j == 4 || i + j == 12) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /**
     * 实心的菱形
     */
    public static void test05(){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(i+j < 4 || j - i > 4 || i - j > 4 || i + j > 12) {
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
