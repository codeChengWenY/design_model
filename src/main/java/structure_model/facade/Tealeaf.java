package structure_model.facade;

import lombok.Getter;
import lombok.Setter;

/**
 * @ClassName Tealeaf
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:34
 * @Version V1.0
 **/
@Getter
@Setter
public class Tealeaf {

    private  String teaName;

    public Tealeaf(String teaName) {
        this.teaName = teaName;
    }
}
