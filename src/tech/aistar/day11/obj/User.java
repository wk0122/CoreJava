package tech.aistar.day11.obj;

import java.util.Arrays;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class User implements Cloneable{//
    //基本类型
    private int id;

    //字符串类型在clone时候比较特殊
    private String username;

    //对象类型
    private Student student;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", username='").append(username).append('\'');
        sb.append(", student=").append(student);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 默认的是浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }


    /**
     * 深层拷贝 - 所有的类型都拷贝一份给副本.
     * u2.clone()
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //构建一个新的对象
        User u = new User();
        //将原来对象里面的所有值重写设置到新的user对象中
        u.setId(this.id);
        u.setUsername(this.username);

       // u.setStudent(this.student);

        if(this.student != null){
            Student s = new Student();

            s.setId(this.getStudent().getId());
            s.setSname(this.getStudent().getSname());
            s.setBirthday(this.getStudent().getBirthday());
            s.setGender(this.getStudent().getGender());

            u.setStudent(s);
        }
        return u;
    }
}
