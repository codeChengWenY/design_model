package behavior_model.mediator;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName AbstractMediator
 * @Description: 抽象中介者
 * @Author CoderCheng
 * @Date 2020-06-03 11:16
 * @Version V1.0
 **/
@Getter
@Setter
public abstract class AbstractMediator {


    protected  MysqlDatabase mysqlDatabase;
    protected  RedisDatabase redisDatabase;

    protected  EsDatabase esDatabase;



    public  abstract  void  sync(String databasename,String data);


}
