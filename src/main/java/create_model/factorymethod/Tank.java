package create_model.factorymethod;

/**
 * @ClassName Tank
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 15:01
 * @Version V1.0
 **/
public class Tank extends Enemy {


    public  Tank(int x,int y){
        super(x,y);
    }


    @Override
    public void show() {
        System.out.println("坦克的坐标x"+x+"y"+y);
        System.out.println("坦克出现");

    }
}
