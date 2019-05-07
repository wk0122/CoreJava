package tech.aistar.day03.cc;

//import tech.aistar.day03.aa.AA;//导入具体的包下的具体的类
//import tech.aistar.day03.aa.CC;

import tech.aistar.day03.aa.*;//将包下的所有的类全部导入,不推荐大家使用的

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class TestAA {
    public static void main(String[] args) {
//        tech.aistar.day03.aa.AA aa = new tech.aistar.day03.aa.AA();
//        aa.test();
//
//        tech.aistar.day03.bb.AA bb = new tech.aistar.day03.bb.AA();
//        bb.test();

        //自动提示alt+enter
        AA aa = new AA();
        aa.test();
    }

    public void test(){
        AA aa = new AA();
        aa.test();

        CC cc = new CC();
    }
}
