package behavior_model.watch;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName XIaoMei
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-22 14:36
 * @Version V1.0
 **/
public class XiaoMei {


    List<Person> personList = new ArrayList<>();

    public void addPerson(Person p) {
        personList.add(p);
    }


    public void notificationPerson() {


        personList.forEach(person -> {
            person.getMessage("XiaoMei发布了消息 来找我一起玩");

        });


    }

}
