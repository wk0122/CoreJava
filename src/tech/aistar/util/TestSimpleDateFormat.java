package tech.aistar.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * https://blog.csdn.net/weixin_38810239/article/details/79941964
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/3/28 0028
 */
public class TestSimpleDateFormat {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<String> dateStrList =new ArrayList<>();
        dateStrList.add("2018-04-01 10:00:01");
        dateStrList.add("2018-04-02 11:00:02");
        dateStrList.add("2018-04-03 12:00:03");
        dateStrList.add("2018-04-04 13:00:04");
        dateStrList.add("2018-04-05 14:00:05");
        //SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for (String str : dateStrList) {
            executorService.execute(() -> {
                try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                    System.out.println(simpleDateFormat.parse(str));
                TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
            }
            });
        }

    }
}
