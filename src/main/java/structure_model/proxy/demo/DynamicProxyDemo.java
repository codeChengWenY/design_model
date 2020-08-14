package structure_model.proxy.demo;

import structure_model.proxy.BuyHource;
import structure_model.proxy.Customer;
import structure_model.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @ClassName DynamicProxyDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 17:04
 * @Version V1.0
 **/
public class DynamicProxyDemo {

    public static void main(String[] args) {


        Customer customer = new Customer("张三", 300000D);
        DynamicProxy dynamicProxy = new DynamicProxy(customer);
        BuyHource buyHource = (BuyHource) Proxy.newProxyInstance(dynamicProxy.getClass().getClassLoader(), customer.getClass().getInterfaces(), dynamicProxy);
        buyHource.buyHource();
    }
}
