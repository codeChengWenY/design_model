package structure_model.decorator;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Item
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-05 10:51
 * @Version V1.0
 **/
@Setter
@Getter
public class Item {

    private String name;

    private List<Item> list = new ArrayList<Item>();

    public Item(String name) {
        this.name = name;
    }
}
