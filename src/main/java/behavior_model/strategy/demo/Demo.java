package behavior_model.strategy.demo;

import behavior_model.strategy.ConcreateStrategy1;
import behavior_model.strategy.ConcreateStrategy2;
import behavior_model.strategy.Context;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 14:56
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {
        Context context;
        System.out.println("执行策略");

        context=new Context(new ConcreateStrategy1());
        context.execute();
        context=new Context(new ConcreateStrategy2());
        context.execute();
    }
}
