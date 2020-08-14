package behavior_model.visitor;

/**
 * @ClassName DiscountVisitor
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 17:25
 * @Version V1.0
 **/
public class DiscountVisitor implements Visitor {
    @Override
    public void visit(Candy candy) {

        System.out.println("----糖果--------");
    }

    @Override
    public void visit(Wine wine) {

        System.out.println("----酒类--------");

    }

    @Override
    public void visit(Fruit fruit) {

        System.out.println("----水果--------");
    }
}
