package behavior_model.duty_chain.Demo;

import behavior_model.duty_chain.Approver;
import behavior_model.duty_chain.CEO;
import behavior_model.duty_chain.Manager;
import behavior_model.duty_chain.Staff;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 15:25
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {

        Approver approver=new Staff("张三");
        approver.setNextApprover(new Manager("Manager")).setNextApprover(new CEO("CEO"));

        approver.approve(20000);

    }
}
