package create_model.factorymethod;

import java.util.Random;

/**
 * @ClassName SimpleFactory
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 14:06
 * @Version V1.0
 **/
public class AirPlaneFactory implements Factory {


    private Random random = new Random();

    @Override
    public Enemy create(int sreenWidth) {
        return new Airplane(random.nextInt(sreenWidth), 0);//实例化飞机

    }
}
