package tech.aistar.day14.homework;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:封装品牌名和总价
 *
 * List<PurcaseVo> vos = ....
 * PurcaseVo vo1 = new PurcaseVo("宝洁",68.9);
 * vos.add(vo1);
 * vos.add(vo2);
 *
 * vos.sort(...)
 *
 * @date 2019/4/16 0016
 */
public class PurcaseVo {
    private String brand;

    private double price;

    public PurcaseVo(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurcaseVo{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
