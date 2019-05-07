package tech.aistar.day11;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class TestUserDao {
    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();

        userDao.delById(10);

        System.out.println("============");

        userDao.findAll();
    }
}
