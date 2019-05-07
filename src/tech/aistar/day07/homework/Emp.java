package tech.aistar.day07.homework;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:实体类和业务类合二为一
 * @date 2019/4/3 0003
 */
public class Emp {//自关联
    private int id;

    private String empName;

    private double salary;

    //一个上司拥有多个下属
    private Emp[] emps;

    //空参构造
    public Emp(){

    }

    public Emp(int id, String empName, double salary, Emp[] emps) {
        this.id = id;
        this.empName = empName;
        this.salary = salary;
        //构造方法中允许调用setter
        setEmps(emps);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp[] getEmps() {
        return emps;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", empName='").append(empName).append('\'');
        sb.append(", salary=").append(salary);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 添加一个下属
     * @param emp
     */
    public void addEmp(Emp emp){
        //判断是否是上司手误自己添加了自己
        if(this == emp){//this代表的是当前对象[调用addEmp方法的对象]
            System.out.println("sorry,不能自己添加自己!");
            return;
        }

        //只有上司才拥有权限
        if(null == emps){
            System.out.println("sorry,下属是没有权限进行添加的!");
            return;
        }

        //由於給上司一個初始化的數組,但是數組的長度只有0個
        //在添加新的下属之前,需要对数组进行扩容
        emps = Arrays.copyOf(emps,emps.length+1);
        //将emp放入到emps中去
        emps[emps.length-1] = emp;
    }

    /**
     * 输出下属的基本信息
     */
    public void outEmpInfo(){
        if(null == emps){
            System.out.println("sorry,您本身就是下属!");
            return;
        }

        if(emps.length == 0){
            System.out.println("sorry,您暂时没有任何下属!");
            return;
        }

        System.out.println("下属信息如下:>");
        for (Emp e:emps){
            System.out.println("\t"+e);
        }
    }

    /**
     * 根据id进行删除操作
     * @param id
     */
    public void delbyEmpId(int id){
        if(null == emps){
            System.out.println("sorry,您本身就是下属!");
            return;
        }

        if(emps.length == 0){
            System.out.println("sorry,您暂时没有任何下属!");
            return;
        }

        //判断id是否是存在的
        int count = 0;

        for(int i=0;i<emps.length;i++){
            if(emps[i].getId() == id){
                count++;
                break;//因为id是唯一的
            }
        }
        if(count == 0){
            System.out.printf("id为%d的员工是不存在的!\n",id);
            return;
        }

        //存在,则进行删除操作.
        //定义一个新的数组
        Emp[] temp = new Emp[emps.length-1];
        //定义一个下标计数器
        int index = 0;
        for (int i = 0; i < emps.length; i++) {
            if(emps[i].getId()!=id){
                temp[index++] = emps[i];
            }
        }
        emps = temp;
    }

    /**
     * 输出下属的个数
     */
    public void outEmpNum(){
        if(null == emps){
            System.out.println("sorry,您本身就是下属!");
            return;
        }
        if(emps.length == 0){
            System.out.println("sorry,您暂时没有任何下属!");
            return;
        }
        System.out.println("下属个数如下:>"+emps.length);
    }
}
