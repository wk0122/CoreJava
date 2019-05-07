package tech.aistar.day11.obj;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s1 = new Student(1,"tom");
        Student s2 = new Student(2,"toms");

        //System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        //System.out.println(s1.getClass().getName() + "@" + Integer.toHexString(s1.hashCode()));
    }
}
