package behavior_model.watch.Demo.jdkwatch;

/**
 * @ClassName JdkDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 11:50
 * @Version V1.0
 **/
public class JdkDemo {


    public static void main(String[] args) {


      XiaoMeiProvider xiaoMeiProvider = new XiaoMeiProvider();


        LaoWangCustomer laoWangCustomer = new LaoWangCustomer();
        xiaoMeiProvider.addObserver(laoWangCustomer);
        xiaoMeiProvider.notificationPerson();

    }
}
