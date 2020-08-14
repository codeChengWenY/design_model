package structure_model.proxy;

import lombok.AllArgsConstructor;

/**
 * @ClassName Customer
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:57
 * @Version V1.0
 **/
@AllArgsConstructor
public class Customer implements  BuyHource {



    private  String name;

    private  Double money;
    @Override
    public void buyHource() {
        System.out.println(name+"买房子首付了"+money+"元");

    }
}
