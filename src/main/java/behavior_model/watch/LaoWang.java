package behavior_model.watch;

/**
 * @ClassName LaoWang
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 14:35
 * @Version V1.0
 **/
public class LaoWang implements  Person {
    @Override
    public void getMessage(String message) {
        System.out.println(String.format("LaoWang收到信息%s", message));

    }
}
