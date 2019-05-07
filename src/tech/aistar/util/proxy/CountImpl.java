package tech.aistar.util.proxy;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/19 0019
 */
public class CountImpl implements Count{
    @Override
    public String query() {
        System.out.println("query...");
        return "我们";
    }

    @Override
    public void delById() {
        System.out.println("delById()...");
    }
}
