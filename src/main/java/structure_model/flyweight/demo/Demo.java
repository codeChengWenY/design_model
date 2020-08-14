package structure_model.flyweight.demo;

import structure_model.flyweight.FlyWeightFactory;
import structure_model.flyweight.ITicket;

/**
 * @ClassName demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 10:29
 * @Version V1.0
 **/
public class Demo {

    // 大量用户查询同一个地方时 使用缓存查询。
    public static void main(String[] args) {


        FlyWeightFactory flyWeightFactory = FlyWeightFactory.getInstance();

        ITicket ticket = flyWeightFactory.getTicket("北京", "上海");
        ticket.showInfo();

        ITicket ticket1 = flyWeightFactory.getTicket("北京", "天津");
        ticket1.showInfo();
        ITicket ticket2 = flyWeightFactory.getTicket("北京", "上海");
        ticket2.showInfo();

    }
}
