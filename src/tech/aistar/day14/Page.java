package tech.aistar.day14;

import java.util.List;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:封装的是一些分页的数据
 * @date 2019/4/15 0015
 */
public class Page<T> {
    private int pageNow;//当前页

    private int rows;//总的条数

    private int pageSize;//每页显示多少条

    private List<T> datas;

    public Page() {
    }

    public int getPageNow() {
        return pageNow;
    }

    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public List<T> getDatas() {
        return datas;
    }

    public void setDatas(List<T> datas) {
        this.datas = datas;
    }

    public static void main(String[] args) {
        Page<Book> pageBooks = new Page<>();

        Page<User> users = new Page<>();
    }
}
