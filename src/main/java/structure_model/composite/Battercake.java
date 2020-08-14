package structure_model.composite;

/**
 * @ClassName Battercake
 * @Description: 煎饼类
 * @Author CoderCheng
 * @Date 2020-06-08 13:59
 * @Version V1.0
 **/
public class Battercake extends  ABattercake {

    @Override
    protected  String desc() {
        return "煎饼";
    }

    @Override
    protected  int cost() {
        return 8;
    }
}
