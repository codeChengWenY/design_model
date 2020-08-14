package behavior_model.watch.Demo;

import behavior_model.watch.LaoLi;
import behavior_model.watch.LaoWang;
import behavior_model.watch.XiaoMei;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 14:39
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {
        LaoLi laoLi = new LaoLi();
        LaoWang laoWang = new LaoWang();
        XiaoMei xiaoMei = new XiaoMei();
        //注册为观察者
        xiaoMei.addPerson(laoLi);
        xiaoMei.addPerson(laoWang);

       //
        xiaoMei.notificationPerson();

    }
}
