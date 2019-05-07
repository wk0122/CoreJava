package tech.aistar.day07;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:学生实体类 - 数据在Java内存中的载体.
 * @date 2019/4/2 0002
 */
public class Student {
    //定义属性
    //修饰符 数据类型 属性名 [=初始值]
    private int id;//通常情况下,我们都会设定一个id - 对象的标识符 - 确定是否为同一个对象的.

    //定义姓名
    private String name;

    //定义一个年龄
    private int age;

    //定一个数组 - 对象类型
    private String[] hobbies;

    //public Date birthday;

    /**
     * 空参构造...
     * 当实体类中没有提供任何构造的时候,那么系统默认分配一个空参构造.
     */
    public Student(){
        System.out.println("空参构造被调用了...");
    }

    /**
     * 三参构造
     * @param id
     * @param name
     * @param age
     */
    public Student(int id,String name,int age){
        //this();//调用了该对象的空参构造
        System.out.println("三参构造被调用了...");

        //使用this关键字 - 当前对象
        this.id = id;
        this.name = name;
        this.age = age;
    }

    /**
     * 全参构造...
     * @param id
     * @param name
     * @param age
     * @param hobbies
     */
    public Student(int id,String name,int age,String[] hobbies){
        this(id,name,age);//不推荐使用...
        System.out.println("全参构造...");
        //this.id = id;
        //this.name = name;
        //this.age = age;
        this.hobbies = hobbies;
    }

    /**
     * setter方法
     * @param id
     */
    public void setId(int id){
        this.id = id;
    }

    /**
     * getter方法
     */
    public int getId(){
        return id;
    }

    public void setName(String name){
        //可以对name进行参数有效性判断

        //字符串的比较
        if("习大大".equals(name)){//将字面量放在equals的左边
        // if(name.equals("习大大")){
            this.name = "***";
            return;
        }
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    /**
     * 重写toString方法
     * @return
     */
    @Override
    public String toString(){
        return "[id:"+id+",name:"+name+",age:"+age+"]";
    }
}
