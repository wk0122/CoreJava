package tech.aistar.day14.exercise;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示: 括号匹配问题
 * @date 2019/4/12 0012
 */
public class LinkedListExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入字符串:>");
        String line = sc.nextLine();
        if(matches(line)){
            System.out.println("匹配!");
        }else{
            System.out.println("不匹配!");
        }
        
    }

    private static boolean matches(String line) {
        //1.将输入的字符串转换成字符数组
        char[] arr = line.toCharArray();

        //2.
        LinkedList<Character> list = new LinkedList<>();

        //3. 将数组中的第一个元素压入栈顶 ()[]
        list.push(arr[0]);//(

        //4. 从数组中的第二个元素开始遍历
        for (int i = 1; i < arr.length; i++) {
            //6. 获取当前遍历的元素
            Character curr = arr[i];//)  ]
            //5. 获取栈顶元素
            //()[]{}
            //处理 - 防止之前就存在了匹配状态,栈顶是没有元素的
            if(list.isEmpty()){
                //没有栈顶元素
                list.push(curr);//[
                continue;
            }

            Character first = list.getFirst();//java.util.NoSuchElementException  [

            //进行比较
            if(first.equals('(') && curr.equals(')') || first.equals('[') && curr.equals(']') || first.equals('{') && curr.equals('}')){
                //7. 如果匹配 - 则弹出栈顶的元素
                list.pop();//
            }else{
                //8. 不匹配 - 则继续将curr压入栈顶
                list.push(curr);
            }
        }
        return list.isEmpty();//当集合中没有元素的时候,则表示匹配成功!
    }
}
