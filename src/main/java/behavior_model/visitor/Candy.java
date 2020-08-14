package behavior_model.visitor;

import java.time.LocalDate;

/**
 * @ClassName Candy
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 17:22
 * @Version V1.0
 **/
public class Candy extends  Product  implements  Acceptable{
    public Candy(String name, LocalDate productDate, float price) {
        super(name, productDate, price);
    }

    @Override
    public void accect(Visitor visitor) {

        visitor.visit(this);

    }
}
