package behavior_model.strategy;

/**
 * @ClassName ConcreateStrategy1
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 14:54
 * @Version V1.0
 **/
public class ConcreateStrategy1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1");
    }
}
