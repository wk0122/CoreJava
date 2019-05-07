package tech.aistar.day14;

import java.util.Objects;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/15 0015
 */
public class User implements Comparable<User>{
    private int id;

    private String userNo;

    private String username;

    private String password;

    private int age;

    public User(){

    }

    public User(int id, String userNo, String username, String password,int age) {
        this.id = id;
        this.userNo = userNo;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        System.out.println("hashcode:"+Objects.hash(id));
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", userNo='").append(userNo).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    /**
     * 正数
     * 负数
     * 0 - 相等的
     * @param o
     * @return
     */
    @Override
    public int compareTo(User o) {
        //比如根据user的编号进行降序排列
        //如果比较结果为0,则拒绝添加
        //return o.getUserNo().compareTo(this.getUserNo());

        //根据年龄降序排.
        return o.getAge() - this.age;
    }
}
