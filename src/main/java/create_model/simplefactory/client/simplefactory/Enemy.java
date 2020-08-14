package create_model.simplefactory.client.simplefactory;

import javax.annotation.PostConstruct;

/**
 * @ClassName Enemy
 * @Description: 以坦克大战中不同的武器类型  飞机 坦克的对象
 * @Author CoderCheng
 * @Date 2020-05-13 14:28
 * @Version V1.0
 **/


public abstract class Enemy {

    // 敌人的坐标，会被子类继承。
    protected int x;
    protected int y;

    public Enemy() {

        System.out.println("父类无参构造执行");
    }

    // 初始化坐标
    public Enemy(int x, int y) {
        System.out.println("父类对象地址"+ Enemy.class.toString());
        this.x = x;
        this.y = y;
        System.out.println("父类有参构造执行");
    }

    @PostConstruct


    public abstract void show();


}
