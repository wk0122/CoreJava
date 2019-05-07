package tech.aistar.day11;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public void delById(int id) {
        //1. 加载驱动 ...
        //System.out.println("加载驱动...");
        //2. 获取连接
        //System.out.println("获取连接...");

        //个性的东西 - 删除操作
        //System.out.println("delete from tbl_user where id = ?");

        //释放资源
        //System.out.println("释放资源...");

//        JdbcTemplates.execute(new IM() {//匿名内部类
//            @Override
//            public void dml() {
//                System.out.println("delete from tbl_user where id = ?");
//            }
//        });

        JdbcTemplates.execute (()->System.out.println("delete from tbl_user where id = ?"));

//        IM del = new DelImPl();
//        JdbcTemplates.execute(del);

    }

    @Override
    public void findAll() {
        //1. 加载驱动 ...
        System.out.println("加载驱动...");
        //2. 获取连接
        System.out.println("获取连接...");

        //个性的东西 - 删除操作
        System.out.println("select * from tbl_user");

        //释放资源
        System.out.println("释放资源...");
    }
}
