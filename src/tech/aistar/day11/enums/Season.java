package tech.aistar.day11.enums;

/**
 * @author success
 * @version 1.0
 * @description:本类用来演示:季节
 * @date 2019/4/9 0009
 */
public enum Season {
    SPRING("春天") {
        @Override
        public Season next() {
            return SUMMER;
        }
    },
    SUMMER("夏天") {
        @Override
        public Season next() {
            return AUTUMN;
        }
    },
    AUTUMN("秋天") {
        @Override
        public Season next() {
            return WINTER;
        }
    },
    WINTER("冬天") {
        @Override
        public Season next() {
            return SPRING;
        }
    };

    private String sign;

    private Season(String sign){
        this.sign = sign;
    }

    public String getSign(){
        return sign;
    }

    //抽象的方法
    //一旦枚举类型中提供了抽象方法,那么每个枚举常量都要去实现该抽象方法.
    public abstract Season next();
}
