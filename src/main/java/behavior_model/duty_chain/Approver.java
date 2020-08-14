package behavior_model.duty_chain;

/**
 * @ClassName Approver
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 14:56
 * @Version V1.0
 **/

public abstract class Approver {

    protected String name;

    protected Approver nextApprover;


    public  Approver(String name) {
        this.name = name;

    }


    public Approver setNextApprover(Approver nextApprover) {
        this.nextApprover = nextApprover;
        return this.nextApprover;
    }

    public abstract void approve(int amount);

}
