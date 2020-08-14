package structure_model.composite;

/**
 * @ClassName AbstractDecorator
 * @Description:  抽象装饰类
 * @Author CoderCheng
 * @Date 2020-06-08 14:00
 * @Version V1.0
 **/
public abstract class AbstractDecorator extends  ABattercake {

    private  ABattercake aBattercake;


    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    @Override
    protected String desc() {
        return this.aBattercake.desc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }

    protected  abstract  void doSomething();
}
