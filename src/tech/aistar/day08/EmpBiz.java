package tech.aistar.day08;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:业务类
 * @date 2019/4/3 0003
 */
public class EmpBiz {
    /**
     * 添加员工
     *@param boss 上司
     *@param e 普通下属
     */
    public void addEmp(Emp boss,Emp e){
        //判断是否添加自己...
        if(boss == e){
            //...
            System.out.println("不能自己添加自己!");
            return;
        }
        //只有上司才拥有添加下属的权限
        if(null == boss.getEmps()){
            //...
            System.out.println("您本身就是员工");
            return;
        }
        //对上司的数组进行扩容操作...
        Emp[] emps = Arrays.copyOf(boss.getEmps(),boss.getEmps().length+1);
        //放入下属
        emps[emps.length-1] = e;
        //重新设置
        boss.setEmps(emps);
    }

    /**
     * 输出下属的信息
     */
    public void outEmpInfo(Emp boss){
        //只有上司才拥有添加下属的权限
        if(null == boss.getEmps()){
            //...本身就是下属
            System.out.println("本身就是下属!");
            return;
        }

        if(boss.getEmps().length == 0){
            //...没有下属,请先添加
            System.out.println("没有下属信息,先进行添加!");
            return;
        }
        System.out.println("下属信息如下:>");
        for(Emp e:boss.getEmps()){
            //...
            System.out.println("\t"+e);
        }
    }
}
