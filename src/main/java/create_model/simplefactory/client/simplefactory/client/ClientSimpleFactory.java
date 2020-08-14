package create_model.simplefactory.client.simplefactory.client;

import create_model.simplefactory.client.simplefactory.SimpleFactory;

/**
 * @ClassName Client
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 15:06
 * @Version V1.0
 **/
public class ClientSimpleFactory {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory(100);
        simpleFactory.create("Airplane").show();
        simpleFactory.create("Tank").show();


    }
}
