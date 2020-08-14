package structure_model.proxy.demo;

import structure_model.proxy.Customer;
import structure_model.proxy.HourceProxy;

/**
 * @ClassName demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 17:01
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {

        Customer customer = new Customer("张三", 300000D);

        HourceProxy hourceProxy = new HourceProxy(customer);

        hourceProxy.buyHource();
    }
}
