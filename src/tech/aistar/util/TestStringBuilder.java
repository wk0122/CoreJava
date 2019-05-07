package tech.aistar.util;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/10 0010
 */
public class TestStringBuilder {
    public static void main(String[] args) {
        String str = "abcdeedefdsfdsfds";
        System.out.println(delByStr(str, "fds"));
    }

    private static String delByStr(String str, String s) {
        if(!str.contains(s)){
            return str;
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            boolean flag = true;
            for (int j = i+1; j <=str.length() ; j++) {
                String subStr = str.substring(i,j);
                if(subStr.equals(s)){
                    builder.append(i+":"+j);
                    flag = false;
                    break;
                }
            }
            if(!flag){
                break;
            }
        }
        StringBuilder sb = new StringBuilder(str);
        String[] index = builder.toString().split(":");
        sb.delete(Integer.parseInt(index[0]),Integer.parseInt(index[1]));
        return delByStr(sb.toString(),s);
    }
}
