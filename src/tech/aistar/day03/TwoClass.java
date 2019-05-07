package tech.aistar.day03;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:同一个类文件中,只能出现一个public定义的类
 * @date 2019/3/27 0027
 */
public class TwoClass {

    public static void main(String[] args) {

    }
}

class Test{
    public static void main(String[] args) {
        System.out.println("Test...");
    }
}
