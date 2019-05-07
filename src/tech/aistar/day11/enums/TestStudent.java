package tech.aistar.day11.enums;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestStudent {
    public static void main(String[] args) {
        Student s = new Student(1,"tom",Gender.M);
        System.out.println(s);
        System.out.println(s.getGender());
    }
}
