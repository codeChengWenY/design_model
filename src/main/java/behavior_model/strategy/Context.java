package behavior_model.strategy;

/**
 * @ClassName Context
 * @Description: 上下文
 * @Author CoderCheng
 * @Date 2020-06-04 14:55
 * @Version V1.0
 **/
public class Context {


    private  Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public  void execute(){

         strategy.doSomething();
     }
}
