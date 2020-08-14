package structure_model.composite;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 14:11
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {


        ABattercake aBattercake=new Battercake();

        System.out.println(aBattercake.desc() + ", 销售价格: " + aBattercake.cost());


        //加个鸡蛋
        aBattercake=new EggDecorator(aBattercake);

        System.out.println(aBattercake.desc() + ", 销售价格: " + aBattercake.cost());

        // 加个鸡蛋香肠
        aBattercake=new SausageDecorator(aBattercake);
        System.out.println(aBattercake.desc() + ", 销售价格: " + aBattercake.cost());

    }
}
