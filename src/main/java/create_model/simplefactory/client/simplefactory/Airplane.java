package create_model.simplefactory.client.simplefactory;

/**
 * @ClassName Airplane
 * @Description: 飞机
 * @Author CoderCheng
 * @Date 2020-05-13 14:57
 * @Version V1.0
 **/

public class Airplane  extends Enemy {


    public  Airplane(){
        System.out.println("子类无参");
    }
   public  Airplane(int x,int y){
        super(x,y);

   }

    @Override
    public void show() {
        System.out.println("飞机的坐标x"+x+"y"+y);
        System.out.println("飞机出现");

    }
}
