package tech.aistar.day11.enums;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:枚举类型和字符串之间的相互转换
 * @date 2019/4/9 0009
 */
public class EnumStringTransferDemo {
    public static void main(String[] args) {
        Season s = Season.WINTER;
        System.out.println(s);

        //1. 将枚举类型转成字符串 - 未来数据库的列的类型是没有枚举类型的
        //需要将枚举类型转换成字符串才能够插入到列的类型为varchar这个列中.
        //java.lang.Enum提供了String toString()
        String sea = s.toString();
        System.out.println(sea);

        //2.反之,从db取出来的F,M仍然也是字符串类型.
        String sex = "F";
        Student s1 = new Student();
        //将字符串转换成枚举类型 - Gender
        Gender gender = Enum.valueOf(Gender.class,"F");

        s1.setGender(gender);

        System.out.println(s1);
    }
}
