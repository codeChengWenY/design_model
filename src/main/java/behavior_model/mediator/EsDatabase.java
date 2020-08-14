package behavior_model.mediator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName EsDatabase
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-03 11:30
 * @Version V1.0
 **/
public class EsDatabase extends  AbstractDatabase {

    private List<String> dataset= new CopyOnWriteArrayList<>();

    public EsDatabase(AbstractMediator mediator) {
        super(mediator);
    }

    @Override
    public void addData(String data) {
        System.out.println("es中添加数据");
        dataset.add(data);

    }

    @Override
    public void add(String data) {
        addData(data);
        this.mediator.sync(AbstractDatabase.ELASTICSEARCH, data);

    }

    public  void count(){
        System.out.println("es缓存的数据"+dataset.toString());
    }



}
