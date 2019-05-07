package tech.aistar.day14.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:购买类 - 实体类是数据在内存中的载体
 * @date 2019/4/16 0016
 */
public class Purcase {

    private String brand; //品牌
    private String name; //产品名
    private double cost; // 费用

    public Purcase() {
    }

    public Purcase(String brand, String name, double cost) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Purcase{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
