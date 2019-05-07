package tech.aistar.day11;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:
 * @date 2019/4/9 0009
 */
public class DelImPl implements IM{
    @Override
    public void dml() {
        System.out.println("delete from tbl_user where id = ?");
    }
}
