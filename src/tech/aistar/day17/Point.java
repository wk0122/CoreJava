package tech.aistar.day17;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:反射动态获取类的内部信息
 * @date 2019/4/19 0019
 */
public class Point {
    //属性
    private int x;

    private String name;//2

    public Point(){
        System.out.println("Point()...");
    }

    public Point(int x,String name){
        this.x = x;
        this.name = name;
        System.out.println("带参构造被调用了!");
    }

    public void test01(){
        System.out.println("无参test01()...");
    }

    public void test01(int x){
        System.out.println("x:"+x);
        System.out.println("test01(int x)...");
    }

    public void test01(int x,String name){
        System.out.println("x:"+x);
        System.out.println("name:"+name);
        System.out.println("test01(x,name)...");
    }

    /**
     * 静态方法
     */
    public static void test02(){
        System.out.println("static...");
    }

    /**
     * 私有的方法
     */
    private void test03(){
        System.out.println("private...");
    }

    /**
     * 带有返回类型的
     * @return
     */
    public String getResult(String s){
        return "result...:"+s;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("x=").append(x);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
