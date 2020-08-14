package create_model.factorymethod.client.factorymethod.client;

import create_model.factorymethod.AirPlaneFactory;
import create_model.factorymethod.Factory;
import create_model.factorymethod.TankFactory;

/**
 * @ClassName Client
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 15:06
 * @Version V1.0
 **/
public class ClientSimpleFactory {

    public static void main(String[] args) {
        Factory factory=new AirPlaneFactory();
        factory.create(100).show();

        Factory tankFactory=new TankFactory();
        tankFactory.create(100).show();
    }
}
