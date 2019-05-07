package tech.aistar.day11.enums;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestSeason {
    public static void main(String[] args) {
        //获取所有的枚举常量[每个枚举实例]
        Season[] seasons = Season.values();
        for(Season s:seasons){
            System.out.println(s+":"+s.getSign());
        }
        System.out.println("====");
        Season sn = Season.WINTER;
        for(;;){
            sn = sn.next();
            System.out.println(sn+":"+sn.getSign());

            try {
                Thread.sleep(1000);//alter + enter
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
