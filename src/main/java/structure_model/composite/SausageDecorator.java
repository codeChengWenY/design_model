package structure_model.composite;

/**
 * @ClassName SausageDecorator
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 14:27
 * @Version V1.0
 **/
public class SausageDecorator extends AbstractDecorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String desc() {
        return super.desc()+" 加一根香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
