package behavior_model.visitor.demo;

import behavior_model.visitor.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 17:27
 * @Version V1.0
 **/
public class Demo {

    public static void main(String[] args) {

        List<Acceptable> products = Arrays.asList(
                new Candy("小白兔奶糖", LocalDate.of(2018, 1, 10), 20.00f),
                new Wine("白酒", LocalDate.of(2018, 1, 10), 20.00f),
                new Fruit("草莓", LocalDate.of(2018, 1, 10), 20.00f)
        );

        Visitor discountVisitor = new DiscountVisitor();
        for (Acceptable acceptable : products) {
            acceptable.accect(discountVisitor);
        }
    }
}
