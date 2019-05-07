package tech.aistar.day11.obj;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class StudentCloneDemo {
    public static void main(String[] args){
        User u2 = new User();
        u2.setId(1);//基本类型
        u2.setUsername("tom");//String类型特殊
        u2.setStudent(new Student(1,"tom"));//对象类型

        //创建该对象的副本
        try {
            User u3 = (User) u2.clone();

            //修改u2 - 原来对象
            u2.setId(10);//修改的是基本类型
            u2.setUsername("admin");

            //修改对象类型
            Student ss = u2.getStudent();
            ss.setSname("success");
            u2.setStudent(ss);

            System.out.println(u3);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
