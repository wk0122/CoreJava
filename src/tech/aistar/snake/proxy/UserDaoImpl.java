package tech.aistar.snake.proxy;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/22 0022
 */
public class UserDaoImpl implements IUserDao{
    @Override
    public String findAll(String name) {
        System.out.println("findAll..."+name);
        return "success:"+name;
    }

    @Override
    public void update() {
        System.out.println("update...");
    }
}
