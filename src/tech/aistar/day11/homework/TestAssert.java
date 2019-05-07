package tech.aistar.day11.homework;

import org.junit.Test;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:断言
 * @date 2019/4/10 0010
 */
public class TestAssert {

    @Test
    public void test(){
        String s = "Hello";

        assert s.startsWith("Hs");
    }
}
