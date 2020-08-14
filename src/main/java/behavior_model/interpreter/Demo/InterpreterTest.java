package behavior_model.interpreter.Demo;

import behavior_model.interpreter.Context;

/**
 * @ClassName InterpreterTest
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-26 17:39
 * @Version V1.0
 **/
public class InterpreterTest {


    public static void main(String[] args) {

        Context bus= new Context();
        bus.freeRide("南京的年轻人");
        bus.freeRide("上海的小孩");

    }
}
