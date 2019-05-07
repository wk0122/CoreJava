package com.xml.dtd;

import java.util.Scanner;//http://www.imooc.com/article/24862
//https://www.cnblogs.com/CarpenterLee/p/6507161.html

/**找出俩个字符串的最大公chuan**/
public class TestString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请您输入第一个字符串:");
		String first = sc.nextLine();
		System.out.println("请您输入第二个字符串:");
		String two = sc.nextLine();
		StringBuilder builder = method(first,two);
		System.out.println(builder);
	}

	private static StringBuilder method(String first, String two) {
		StringBuilder builder = new StringBuilder();

		//比较俩个字符串的长度.
		if(first.length()>two.length()){
			String s1 = first;
			first = two;
			two = s1;
		}

		//定义一个长度
		int len1 = 0;
		//feeeeesaooooowqwqooooo
		//oooooeewwweeeeepp
		int len = first.length();

		for (int i = 0; i < len; i++) {
			for (int j = i+1; j <=len; j++) {
				String s = first.substring(i,j);
				int length = s.length();
				if(two.contains(s) && length>len1){
					builder.delete(0, builder.capacity());
					builder.append(s+" ");
					len1 = length;
				}else if(two.contains(s) && length==len1){
					builder.append(s+" ");
					len1 =length;
				}
			}
		}
		//对字符串数组进行排重

		return builder;
	}
}