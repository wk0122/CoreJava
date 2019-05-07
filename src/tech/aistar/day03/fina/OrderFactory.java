package tech.aistar.day03.fina;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:订单的状态
 * @date 2019/3/27 0027
 */
public class OrderFactory {
    public static final int ORDER_FINISHIED = 1;
    public static final int ORDER_UNFINISHIED = 2;
    public static final int ORDER_UNORDER = 3;

    //public static int TT = 100;//可以进行更改的

    public static String getStatus(int n){
        if(n==ORDER_FINISHIED){
            return "已经下单";
        }else if(n==ORDER_UNFINISHIED){
            return "未付款";
        }else if(n==ORDER_UNORDER){
            return "未下单";
        }else{
            return "输入无效";
        }
    }
}
