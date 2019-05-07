package tech.aistar.day12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:从一段字符串中,找出符合正则表达式规则的字符串.
 * @date 2019/4/10 0010
 */
public class MatcherDemo {

    private static StringBuilder builder = new StringBuilder();

    //可以用静态代码块来初始化builder
    static{
        builder.append("Java Internet. Java For example, ISO images Java are 5000 very susceptible to erroneous bits. A few wrong ")
                .append("This is the 2000 md5sum checksum that is created ")
                .append("the wrong JavaScript location and the 849962874@qq.com ISO may not be ")
                .append("my job is Java,my salary is 1000");
    }

    /**
     *
     * @param regex 正则表达式
     * @param builder 源头
     */
    public static void matches(String regex,StringBuilder builder){
        //1. 获取一个Pattern对象 - 将给定的正则编译到模式中
        Pattern pattern = Pattern.compile(regex);

        //2. 通过模式对象来获取一个匹配器
        Matcher m = pattern.matcher(builder);

        //3. 迭代匹配器
        while(m.find()){//找不到就返回false.
            //1. 获取成功序列的起始位置
            int start = m.start();

            //2. 获取成功序列的结束位置
            int end = m.end();

            //3. 获取匹配成功的字符序列
            String group = m.group();

            System.out.printf("[%s]在文中的[%d~%d]\n",group,start,end);
        }
    }

    public static void main(String[] args) {
        //matches("\\d+",builder);
        matches("[a-zA-Z0-9_.-]+@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.[a-zA-Z0-9]{2,6}",builder);
    }

}
