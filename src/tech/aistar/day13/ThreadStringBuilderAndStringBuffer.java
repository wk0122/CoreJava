package tech.aistar.day13;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/11 0011
 */
public class ThreadStringBuilderAndStringBuffer {
    public static void main(String[] args) {
        //线程不安全的,效率是高的
        StringBuilder builder = new StringBuilder();

        //线程安全的,效率是低的
        StringBuffer buffer = new StringBuffer();

        //模拟多线程环境分 - 模拟1000个线程.
                           for(int i = 0;i<1000;i++){
                        new Thread(new Runnable() {
                            @Override
                            public void run() {

                    for (int j = 0; j < 1000; j++) {
                        builder.append("1");
                        buffer.append("1");
                    }
                    //998569-1000000
                    System.out.println(builder.length()+"-"+buffer.length());
                }
            }).start();
        }
    }

    //禁止这样写 - 静态成员是属于类拥有的,是对象共享的.
    private static StringBuilder builder = new StringBuilder();

    public void test(){
        StringBuilder builder = new StringBuilder();
    }
}
