package tech.aistar.day04;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:三层for循环
 * @date 2019/3/28 0028
 */
public class ForDemo03 {
    public static void main(String[] args) {
        //定义一个计数器,变量
        int count = 0;

        for(int x = 1;x<=4;x++){//第一个数
            for(int y = 1;y<=4;y++){
                for(int z=1;z<=4;z++) {
                    //System.out.println(x+""+y+z);
                    //让先出来的值,放到左边
                    if(x!=y && x!=z && y!=z){
                        System.out.print(x * 100 + y * 10 + z+"\t");
                        count++;
                        //每6个换一行
//                        if(count%6==0){
//                            System.out.println();
//                        }

                        if(count == 6){
                            System.out.println();
                            count = 0;
                        }
                    }
                }
            }
        }
    }
}
