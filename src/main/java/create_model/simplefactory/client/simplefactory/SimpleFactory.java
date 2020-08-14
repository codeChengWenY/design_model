package create_model.simplefactory.client.simplefactory;

import java.util.Random;

/**
 * @ClassName SimpleFactory
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 14:06
 * @Version V1.0
 **/
public class SimpleFactory {


    private int screenWidth;

    private Random random;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.random = new Random();

    }


    public Enemy create(String type) {
        int x = random.nextInt(screenWidth);//生成敌人横坐标随机数
        Enemy enemy = null;
        switch (type) {
            case "Airplane":
                enemy = new Airplane(x, 0);//实例化飞机
                break;
            case "Tank":
                enemy = new Tank(x, 0);//实例化坦克
                break;
        }
        return enemy;
    }

}
