package structure_model.flyweight;

/**
 * @ClassName TrainTicket
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 10:15
 * @Version V1.0
 **/
public class TrainTicket implements ITicket {

    private  String from;

    private  String to;

    private  int price;


    public TrainTicket(String from, String to,int price) {
        this.from = from;
        this.to = to;
        this.price = price;

    }
    @Override
    public void showInfo() {
        System.out.println(String.format("%s->%s:价格:%s元", from,to,price));


    }
}
