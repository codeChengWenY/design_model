package behavior_model.template;

/**
 * @ClassName AutoTestPM
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 18:46
 * @Version V1.0
 **/
public class AutoTestPM extends  PM {
    @Override
    protected void analyze() {
        System.out.println("进行业务沟通，需求分析");

    }

    @Override
    protected void design() {

    }

    @Override
    protected void develop() {

    }

    @Override
    protected boolean test() {
        return false;
    }

    @Override
    protected void release() {

        System.out.println("发布");
    }
}
