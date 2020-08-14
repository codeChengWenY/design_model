package behavior_model.mediator.Demo;

import behavior_model.mediator.*;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-03 11:27
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {


        AbstractMediator abstractMediator = new SyncMediator();


        MysqlDatabase mysqlDatabase = new MysqlDatabase(abstractMediator);

        RedisDatabase redisDatabase = new RedisDatabase(abstractMediator);
        EsDatabase esDatabase = new EsDatabase(abstractMediator);

        abstractMediator.setMysqlDatabase(mysqlDatabase);
        abstractMediator.setRedisDatabase(redisDatabase);
        abstractMediator.setEsDatabase(esDatabase);

        System.out.println("-------------Mysql中添加数据,同步到 Redis 和Es数据库");
        //Mysql 添加数据

        mysqlDatabase.add("1");
        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("-------------Redis中添加数据,将不同步到 其他数据库");
        //Redis 添加数据
        redisDatabase.add("2");
        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

        System.out.println("-------------Es中添加数据,只同步到Mysql");
        //Es 中添加数据
        esDatabase.add("3");
        mysqlDatabase.select();
        redisDatabase.cache();
        esDatabase.count();

    }
}
