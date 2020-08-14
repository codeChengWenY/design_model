package create_model.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @ClassName Pig
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-18 18:17
 * @Version V1.0
 **/
@Getter
@Setter
@AllArgsConstructor
@ToString
public class Pig implements Cloneable {

    private String name;


    private Date date;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig)super.clone();
        return pig;
    }
}
