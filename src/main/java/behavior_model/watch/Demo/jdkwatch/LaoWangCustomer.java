package behavior_model.watch.Demo.jdkwatch;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName LaoWang
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 11:52
 * @Version V1.0
 **/
public class LaoWangCustomer implements Observer {
    @Override
    public void update(Observable observable, Object o) {

        String message = (String) o;
        System.out.println(String.format("LaoWang收到信息%s", message));

    }
}
