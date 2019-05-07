package tech.aistar.day13.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/12 0012
 */
public class DelString {
    public static void main(String[] args) {
        String str = "abcdendeadeabc";

        //String afterStr = delStr(str,"de");

       // System.out.println(afterStr);

        System.out.println(delString(str,"de"));
    }

    /**
     * 递归操作
     * @param str 原字符串
     * @param target 需要删除的字符串
     * @return
     */
    private static String delString(String str,String target){
        //1. 指明递归的出口
        if(!str.contains(target))
            return str;

        //为了使用删除操作 - 需要将String类型转换成StringBuilder类型
        StringBuilder builder = new StringBuilder(str);

        //2. 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            boolean flag = false;
            for (int j = i+1; j <=str.length(); j++) {
                //截取所有有可能性的字符序列
                //"abcdedeadeabc";
                String subStr = str.substring(i,j);
                //System.out.println(subStr);
                if(subStr.equals(target)){//当前某个序列符合删除的要求
                    builder.delete(i,j);
                    //System.out.println(builder);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
        }
        return delString(builder.toString(),target);
    }

    /**
     * 使用正则操作
     * @param str
     * @param de
     * @return
     */
    private static String delStr(String str, String de) {
        return str.replaceAll("de","");
    }
}
