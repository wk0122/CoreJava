package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:for循环的复合形态
 * @date 2019/3/28 0028
 */
public class ForDemo02 {
    public static void main(String[] args) {
        /*
          j   i
          1 * 1=1
          1 * 2=2  2 * 2 = 4
          1 * 3=3
         */
        for(int i=1,j=1;i<=9;j++){
            System.out.print(j + "*" + i + "=" + j*i +"\t");

            //当行和列一样的时候,才进行换行
            if(j == i){
                //换行
                System.out.println();
                i++;
                j = 0;
            }
        }
    }
}
