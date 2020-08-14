package behavior_model.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName MysqlDatabase
 * @Description: 具体同事
 * @Author CoderCheng
 * @Date 2020-06-03 11:18
 * @Version V1.0
 **/
public class MysqlDatabase extends AbstractDatabase {


    private List<String> dataset = new ArrayList<>();

    public MysqlDatabase(AbstractMediator mediator) {
        super(mediator);
    }


    @Override
    public void addData(String data) {

        System.out.println("Mysql 添加数据" + data);
        this.dataset.add(data);

    }

    @Override
    public void add(String data) {
        addData(data);
        this.mediator.sync(AbstractDatabase.MYSQL, data);

    }

    public void select() {

        System.out.println("mysql 查询数据" + this.dataset.toString());
    }
}
