package structure_model.composite;

/**
 * @ClassName EggDecorator
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 14:07
 * @Version V1.0
 **/
public class EggDecorator extends  AbstractDecorator {

    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String desc() {
        return super.desc()+" 加个鸡蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }

    @Override
    protected void doSomething() {

    }


    public  void egg(){

        System.out.println("增加了一个鸡蛋");
    }
}
