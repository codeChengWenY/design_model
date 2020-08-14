package behavior_model.interpreter;

/**
 * @ClassName Context
 * @Description: 环境类
 * @Author CoderCheng
 * @Date 2020-05-26 17:31
 * @Version V1.0
 **/
public class Context {
    private String[] citys = {"上海", "北京"};
    private String[] persons = {"老人", "小孩"};

    private Expression expression = null;

    public Context() {
        Expression city = new TerminalExpression(citys);
        Expression person = new TerminalExpression(persons);
        expression = new AddExpression(city, person);

    }

    public void freeRide(String info) {
        boolean ok = expression.interpret(info);
        if (ok) {
            System.out.println("您是" + info + "本次免费");
        } else {
            System.out.println(info + "您不是免费人员,本次收费2元");
        }

    }


}
