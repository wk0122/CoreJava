package tech.aistar.day08.extend;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:子类猫
 * @date 2019/4/3 0003
 */
public class Cat extends Animal{
    //属性 - 应该是子类"特有"的属性.
    private double meng;//萌度

    public Cat(){
        //如果类的构造器中没有显式地写super语句的话,那么系统会默认分配一个super()
        //supers() - 调用父类的构造方法 - 也是必须出现在构造块的首行的位置.
        super();
        System.out.println("Cat...");
        System.out.println("meng:"+meng);
    }

    public Cat(double meng){
        System.out.println("Cat带参构造被调用了..");
        this.meng = meng;
    }

    public Cat(String name,String type,double meng){
        super(name,type);//其实就是在调用父类的带参构造
        System.out.println("Cat的全参构造...");
        //setName(name);//调用父类的
        //setType(type);
        this.meng = meng;
    }

    /**
     * 子类特有的方法
     */
    public void catchMouse(){
        System.out.println("猫会捉老鼠...");
    }

    public double getMeng() {
        return meng;
    }

    public void setMeng(double meng) {
        this.meng = meng;
    }

    /**
     * 子类重写父类的方法
     */
    @Override
    public Dog spark() {
        System.out.println("喵喵~~~");
        return null;
    }

    @Override
    public String toString() {
       return super.toString() + " meng:"+meng;
    }
}
