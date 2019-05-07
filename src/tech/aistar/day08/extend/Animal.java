package tech.aistar.day08.extend;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:动物的父类
 * @date 2019/4/3 0003
 */
public class Animal {
    //父类中放子类公共的"特性"

    //动物的名字
    private String name;

    //动物的类型
    private String type;

    public Animal(){
        System.out.println("Animal空参构造被调用了...");
    }

    public Animal(String name,String type){
        System.out.println("Animal的带参构造...");
        this.name = name;
        this.type = type;
    }

    //共性的方法
    public void sleeping(){
        System.out.println("动物正在睡觉...");
    }

    public String getName() {
        return name;
    }

    //共性的方法
    protected Animal spark(){
        System.out.println("动物在叫...");
        return null;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
