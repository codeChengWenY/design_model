package behavior_model.interpreter;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName TerminalExpression
 * @Description:  终结符表达式
 * @Author CoderCheng
 * @Date 2020-05-26 17:22
 * @Version V1.0
 **/
public class TerminalExpression implements Expression {


    private Set<String> set = new HashSet<>();


    public TerminalExpression(String[] data) {
        for (int i = 0; i < data.length; i++) {
            set.add(data[i]);
        }
    }

    @Override
    public boolean interpret(String message) {
        if (set.contains(message)) {
            return true;
        } else {
            return false;
        }
    }
}
