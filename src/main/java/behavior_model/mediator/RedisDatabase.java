package behavior_model.mediator;

import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName RedisDatabase
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-03 11:24
 * @Version V1.0
 **/
public class RedisDatabase extends AbstractDatabase {

    public List<String> dataset = new LinkedList<>();

    public RedisDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {

        System.out.println("Redis 添加数据");
        this.dataset.add(data);

    }

    @Override
    public void add(String data) {
        addData(data);
        this.mediator.sync(AbstractDatabase.REDIS,data);
    }


    public  void cache(){

        System.out.println("redis 缓存的数据" +dataset.toString());
    }
}
