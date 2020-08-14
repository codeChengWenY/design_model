package create_model.simplefactory.client;

import create_model.simplefactory.Airplane;
import create_model.simplefactory.Enemy;
import create_model.simplefactory.Tank;

import java.util.Random;

/**
 * @ClassName Client
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 15:06
 * @Version V1.0
 **/
public class Client {

    public static void main(String[] args) {

        int screenWidth = 100;//屏幕宽度
        System.out.println("游戏开始");
        Random random = new Random();//准备随机数
        int x = random.nextInt(screenWidth);//生成敌机横坐标随机数
        Enemy airplan = new Airplane(x, 0);//实例化飞机
        airplan.show();//显示飞机

        x = random.nextInt(screenWidth);//坦克同上
        Enemy tank = new Tank(x, 0);
        tank.show();


    }
}
