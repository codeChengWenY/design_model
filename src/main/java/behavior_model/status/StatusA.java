package behavior_model.status;

/**
 * @ClassName StatusA
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 14:35
 * @Version V1.0
 **/
public class StatusA implements Status {
    @Override
    public void say() {
        System.out.println("状态a");
    }
}
