package structure_model.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @ClassName FlyWeightFactory
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 10:20
 * @Version V1.0
 **/
public class FlyWeightFactory {


    private FlyWeightFactory() {
    }

    ;

    private static class FlyWeightFactoryHolder {

        private static FlyWeightFactory INSTANCE = new FlyWeightFactory();

    }

    private Map<String, ITicket> ticketMap = new HashMap<>();


    public static FlyWeightFactory getInstance() {

        return FlyWeightFactoryHolder.INSTANCE;
    }


    public ITicket getTicket(String from, String to) {
        String key = from + "->" + to;

        if (ticketMap.containsKey(key)) {
            System.out.println("使用缓存了");
            return ticketMap.get(key);
        }
        System.out.println("第一次使用对象===》" + key);

        ITicket ticket = new TrainTicket(from, to,new Random().nextInt(500));
        ticketMap.put(key, ticket);
        return ticket;
    }


}
