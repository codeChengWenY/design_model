package structure_model.facade;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Water
 * @Description: 泡茶需要水
 * @Author CoderCheng
 * @Date 2020-06-08 16:32
 * @Version V1.0
 **/
@Getter
@Setter
public class Water {

    private  int temperature;// 温度

    private  int capacity; // 容量


    public  Water(){

        this.temperature=0;

        this.capacity=10;

    }
}
