package structure_model.proxy;

/**
 * @ClassName HouceProxy
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:59
 * @Version V1.0
 **/
public class HourceProxy implements  BuyHource {

    private  Customer customer;

    public HourceProxy(Customer customer) {
        this.customer = customer;
    }

    @Override
    public void buyHource() {
        System.out.println("中介先看房");
        customer.buyHource();
        System.out.println("付完款房子买下");

    }
}
