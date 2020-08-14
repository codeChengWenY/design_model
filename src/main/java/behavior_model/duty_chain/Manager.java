package behavior_model.duty_chain;

/**
 * @ClassName Manager
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 15:23
 * @Version V1.0
 **/
public class Manager extends Approver {

    public Manager(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 10000) {
            System.out.println("审批通过。【Manager：" + name + "】");
        } else {
            System.out.println("经理无权审批 升级为CEO");
            this.nextApprover.approve(amount);

        }
    }
}
