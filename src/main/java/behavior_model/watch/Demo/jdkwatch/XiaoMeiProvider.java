package behavior_model.watch.Demo.jdkwatch;

import java.util.Observable;

/**
 * @ClassName XiaoMeiProvider
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 11:51
 * @Version V1.0
 **/
public class XiaoMeiProvider  extends Observable {


    public void notificationPerson() {
        setChanged();
        notifyObservers("小美发送消息了");
    }
}
