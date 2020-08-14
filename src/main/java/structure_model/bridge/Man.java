package structure_model.bridge;

import lombok.AllArgsConstructor;

/**
 * @ClassName Man
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-05 10:10
 * @Version V1.0
 **/
@AllArgsConstructor
public abstract class Man {


    protected KongFu kongFu;


    protected String name;

    public void showKongFu() {

        kongFu.say();

    }
}
