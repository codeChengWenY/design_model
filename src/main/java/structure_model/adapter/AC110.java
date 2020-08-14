package structure_model.adapter;

/**
 * @ClassName AC110
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 15:01
 * @Version V1.0
 **/
public class AC110 implements  AC {


    public   final  int output=220;
    @Override
    public int outputAC() {
        return output;
    }
}
