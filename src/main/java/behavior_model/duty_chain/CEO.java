package behavior_model.duty_chain;

/**
 * @ClassName Manager
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 15:23
 * @Version V1.0
 **/
public class CEO extends Approver {

    public CEO(String name) {
        super(name);
    }

    @Override
    public void approve(int amount) {
        if (amount <= 20000) {
            System.out.println("审批通过。【CEO：" + name + "】");
        } else {
            System.out.println("驳回申请。【CEO：" + name + "】");
        }
    }
}
