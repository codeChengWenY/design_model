package create_model.Singleton;

/**
 * @ClassName Singleton
 * @Description: 单例模式(线程安全)
 * @Author CoderCheng
 * @Date 2020-05-18 17:44
 * @Version V1.0
 **/
public class Singleton {


    //内部类
    private static class MySingletonHandler{
        private static Singleton instance = new Singleton();
    }
    private Singleton() {
    }

    ;


    public static Singleton getInstance() {
      return   MySingletonHandler.instance;
    }
}
