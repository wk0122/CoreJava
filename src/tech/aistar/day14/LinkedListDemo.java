package tech.aistar.day14;

import java.util.LinkedList;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:LinkedList
 * @date 2019/4/12 0012
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        //其余构建方式参考ArrayList
        LinkedList<String> list = new LinkedList<>();
        //队列 - 先进先出
        //栈列 - 先进后出

        //add添加方式 - 队列的数据结构
        list.add("python");
        list.add("java");
        list.add("c");

        //将元素添加到第一个位置
        list.addFirst("go");

        //boolean offer(E e);//尾部添加
        //boolean offerFirst(E e);//头部添加
        //boolean offerLast(E e)//尾部添加

        //获取第一个元素,但是不移除
        //String firstElement = list.element();
        //System.out.println(firstElement);

        //String firstElement = list.getFirst();
        //System.out.println(firstElement);

        //获取最后一个元素
        //String lastElement = list.getLast();
        //System.out.println(lastElement);

        //System.out.println(list.peek());//头
        //System.out.println(list.peekFirst());//头
        //System.out.println(list.peekLast());//尾部

        //弹出栈顶元素 - 获取第一个元素,但是并且移除了
        //System.out.println(list.pop());

        //压入栈顶
        //list.push("ruby");

        //push和pop -> 栈列的实现方式
        //add和getFirst - > 队列的实现方式

        //System.out.println(list.poll());//pollFirst pollLast

        //移除第一个元素,并且返回
        //System.out.println(list.removeFirst());

        //移除最后一个元素,并且返回
        System.out.println(list.removeLast());

        System.out.println("=========");
        //遍历方式和之前的一模一样
        list.forEach(System.out::println);
    }
}
