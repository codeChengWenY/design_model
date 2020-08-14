package behavior_model.visitor;

import java.time.LocalDate;

/**
 * @ClassName Fruit
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 17:23
 * @Version V1.0
 **/
public class Fruit  extends  Product implements  Acceptable{
    public Fruit(String name, LocalDate productDate, float price) {
        super(name, productDate, price);
    }

    @Override
    public void accect(Visitor visitor) {
        visitor.visit(this);

    }
}
