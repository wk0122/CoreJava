package tech.aistar.day08;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:测试类
 * @date 2019/4/3 0003
 */
public class TestEmpBiz {
    public static void main(String[] args) {
        //业务类对象
        EmpBiz biz = new EmpBiz();

        //1.定义一个上司和下属
        //上司是需要设置emp[]
        Emp boss = new Emp(1,"boss",2500.00,new Emp[0]);

        //2.定义一个下属 - 没有添加员工的权限
        Emp e1 = new Emp(2,"tom",1000.00,null);
        Emp e2 = new Emp(3,"jack",2000.00,null);

        //调用添加下属 - 第一个参数代表的是上司,第二个参数代表的是下属
        biz.addEmp(boss,e1);
        biz.addEmp(boss,e2);

        //输出下属的信息
        biz.outEmpInfo(boss);
    }
}
