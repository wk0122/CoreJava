package tech.aistar.day07.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:测试类
 * @date 2019/4/3 0003
 */
public class TestEmp {
    public static void main(String[] args) {
        //1.定义一个上司和下属
        //上司是需要设置emp[]
        Emp boss = new Emp(1,"boss",2500.00,new Emp[0]);

        //2.定义一个下属 - 没有添加员工的权限
        Emp e1 = new Emp(2,"tom",1000.00,null);
        Emp e2 = new Emp(3,"jack",2000.00,null);

        //调用添加下属的方法
        boss.addEmp(e1);
        boss.addEmp(e2);

        //调用根据id进行删除
        boss.delbyEmpId(2);

        //下属的个数
        boss.outEmpNum();

        //输出下属的信息
        boss.outEmpInfo();
    }
}
