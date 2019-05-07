package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/2 0002
 */
public class PeomDemoTest {
    public static void main(String[] args) {
        String str1 = "白日依山尽，黄河入海流。欲穷千里目，更上一层楼。";
        char[] arr = str1.toCharArray();
        //白日依山尽，黄河入海流。欲穷千里目，更上一层楼
        //白黄欲更
        //日河穷上
        //依入千一

        // 行i   列j   arr下标
        // 0      0     0
        // 0      1     6
        //0      2     12
        //0      3     18

        // 行i   列j   arr下标
        // 1      0    1
        // 1     1     7
        // 1     2     13
        //
        //i和j的关系 -> 下标
        //j*6+i


        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[j*6+i]);
            }
            System.out.println();
        }
    }
}
