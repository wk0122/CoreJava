package tech.aistar.day10.templates;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:模板的设计模式
 * @date 2019/4/8 0008
 */
public abstract class PlayerTemplates {//模板类
    //1. 定义用来执行业务流程的若干个抽象方法
    //这些抽象方法的具体的细节延迟到子类去完成
    public abstract void start();

    public abstract void up();

    public abstract void show();

    public abstract void end();

    //2.制定"顶级业务流程"的执行的顺序,并且不允许修改
    public final void test(){
        System.out.println(this.getClass().getName());
        start();
        up();
        show();
        end();
    }
}
