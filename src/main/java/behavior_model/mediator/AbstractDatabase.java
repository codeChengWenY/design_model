package behavior_model.mediator;

/**
 * @ClassName AbstractDatabase
 * @Description: 中介模式 抽象同事
 * @Author CoderCheng
 * @Date 2020-06-03 11:11
 * @Version V1.0
 **/
public abstract class AbstractDatabase {


    public  static  final  String MYSQL="mysql";
    public  static  final  String REDIS="redis";

    public static  final  String ELASTICSEARCH="elasticsearch";


    protected   AbstractMediator mediator;

    public  AbstractDatabase(AbstractMediator mediator){
         this.mediator=mediator;

    }

     public  abstract  void addData(String data);


    public  abstract  void add(String data);
}
