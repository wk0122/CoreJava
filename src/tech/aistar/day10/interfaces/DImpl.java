package tech.aistar.day10.interfaces;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:一个类如果实现了某个接口,那么必须实现该接口以及该接口继承过来的所有的抽象的方法,
 *                             除非自己本身是一个抽象类.
 * IA - 单独接口   save() delete()
 * IB - 单独接口 b()
 * IC - 继承IB - c()
 * ID  d() - 继承IA,IC
 *
 * @date 2019/4/8 0008
 */
public class DImpl implements ID{
    @Override
    public void b() {

    }

    @Override
    public void c() {

    }

    @Override
    public void d() {

    }

    @Override
    public void save() {

    }

    @Override
    public void delete() {

    }
}
