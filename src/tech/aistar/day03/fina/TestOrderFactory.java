package tech.aistar.day03.fina;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/27 0027
 */
public class TestOrderFactory {
    public static void main(String[] args) {

        //String n = OrderFactory.getStatus(2);//可读性比较差...
        //System.out.println(n);

        System.out.println(OrderFactory.ORDER_FINISHIED);//1


        String n = OrderFactory.getStatus(OrderFactory.ORDER_UNFINISHIED);
        System.out.println(n);
    }
}
