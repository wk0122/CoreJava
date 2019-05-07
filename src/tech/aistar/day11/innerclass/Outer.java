package tech.aistar.day11.innerclass;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:内部类
 * @date 2019/4/9 0009
 */
public class Outer {
    //普通属性
    private int id = 1;

    //静态属性
    private static int sid = 100;

    //1. 成员内部类 - 将内部类作为外部类的成员存在.
    public class MemberClass{
        private int id = 10;

        //private static int sid = 200;

        public void test(){
            System.out.println("id:"+id);//内部类自己的
            System.out.println("sid:"+sid);
            System.out.println("outer_id:"+Outer.this.id);//外部类id
        }
    }

    /**
     * 提供一个方法返回成员内部类的对象
     * @return
     */
    public MemberClass createMemberClass(){
        return new MemberClass();
    }

    //2. 静态内部类
    public static class StaticClass{
        private int id = 10;

        private static int sid = 200;

        public void test(){
            System.out.println("id:"+id);
            System.out.println("sid:"+200);

            //访问外部的
            System.out.println("outer_sid:"+Outer.sid);
        }
    }

    //3. 局部内部类
    public void createLocalClass(){
        //局部内部类 - 只存在该方法中.
        class LocalClass{
            public int id = 2;

           public void test(){
               System.out.println("id:"+id);
               System.out.println("outer_id:"+Outer.this.id);
               System.out.println("sid:"+sid);
           }
        }

        //只能在方法中存在
        LocalClass localClass = new LocalClass();
        localClass.test();
    }

    //4. 匿名内部类
    public void createLoyalClass(){
        new IM() {
            @Override
            public void test() {
                System.out.println("匿名内部类...");
            }
        }.test();
    }
}
