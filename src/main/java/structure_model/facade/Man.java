package structure_model.facade;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Man
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:43
 * @Version V1.0
 **/
@Getter
@Setter
public class Man {
    public Man(String name) {
        this.name = name;
    }

    private  String name ;


    public   void drink(Teawater teawater){

        System.out.println(name+"喝了"+teawater);

    }
}
