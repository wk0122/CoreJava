package tech.aistar.util;

/**
 * 
 * 本类演示:根据指定的字符串到原字符串中进行删除! 
 * 
 * @author guan
 * 
 * QQ联系方式:849962874
 *
 * 2016-4-14下午9:49:53
 */
public class DelByString {
	public static void main(String[] args) {
		String str = "abcdeedefdsfdsfds";
		System.out.println(delByStr(str, "fds"));
	}

	private static String delByStr(String str, String s) {
		//abcdeede
		if (!str.contains(s)) {
			return str;
		} else {
			//定义一个StringBuilder
			StringBuilder builder = new StringBuilder();
			for (int i = 0; i < str.length(); i++) {
				boolean flag = true;
				for (int j = i + 1; j <= str.length(); j++) {
					String substr = str.substring(i, j);
					if (substr.equals(s)) {
						builder.append(i + "," + j);
						flag = false;
						break;
					}
				}
				if (!flag) {
					break;
				}
			}
			String[] arr = builder.toString().split("\\,");
			StringBuilder b = new StringBuilder(str);
			b.delete(Integer.parseInt(arr[0]), Integer.parseInt(arr[1]));
			return delByStr(b.toString(), s);
		}
	}
}
