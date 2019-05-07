package tech.aistar.day11.obj;

import java.util.Date;
import java.util.Objects;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:学生实体类
 * @date 2019/4/8 0008
 */
public class Student {
    private int id;

    private String sname;

    private Date birthday;

    private int gender;//1代表男   0代表女

    public Student() {
    }

    public Student(int id, String sname, Date birthday, int gender) {
        this.id = id;
        this.sname = sname;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Student(int id, String sname) {
        this.id = id;
        this.sname = sname;
    }

    public Student(int id, String sname, Date birthday) {
        this.id = id;
        this.sname = sname;
        this.birthday = birthday;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

//    @Override
//    public boolean equals(Object obj){
//        //非空性
//        if(obj == null)
//            return false;
//        //自反性
//        if(this == obj)
//            return true;
//        //一致性
//        //需要进行类型的判断,如果不进行类型的判断
//        //有可能出现java.lang.ClassCastException类型转换失败异常
//        if(obj instanceof Student){
//            Student s = (Student)obj;
//
//            //希望id和sname同时一样的时候,才人会是同一个对象.
//            if(this.id == s.getId() && this.sname.equals(s.getSname()))
//                return true;
//        }
//
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    private void test(){
        System.out.println("私有方法...");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Student{");
        sb.append("id=").append(id);
        sb.append(", sname='").append(sname).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append(", gender=").append(gender);
        sb.append('}');
        return sb.toString();
    }
}
