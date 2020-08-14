package behavior_model.visitor;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * @ClassName Product
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 17:21
 * @Version V1.0
 **/
@Getter
@Setter
@AllArgsConstructor
public abstract class Product {

    protected String name;

    protected LocalDate productDate;


    protected float price;



}
