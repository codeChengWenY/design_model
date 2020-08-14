package behavior_model.mediator;

/**
 * @ClassName SyncMediator
 * @Description: 具体中介者
 * @Author CoderCheng
 * @Date 2020-06-03 11:23
 * @Version V1.0
 **/
public class SyncMediator extends  AbstractMediator{


    @Override
    public void sync(String databasename, String data) {

        if(AbstractDatabase.MYSQL.equals(databasename)){
            //mysql  同步到 redis 和 Elasticsearch
            this.redisDatabase.addData(data);
            this.esDatabase.addData(data);
        }else if(AbstractDatabase.REDIS.equals(databasename)){
             //redis 缓存同步 ,不需要同步到其他数据库
        }else  if(AbstractDatabase.ELASTICSEARCH.equals(databasename)){
            //es 同步到mysql
            this.mysqlDatabase.addData(data);
        }
    }
}
