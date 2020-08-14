package structure_model.adapter;

/**
 * @ClassName ChinaPowerAdapter
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 15:02
 * @Version V1.0
 **/
public class ChinaPowerAdapter implements  DC5Adapter  {

    @Override
    public int outputDC5V(AC ac) {
        int outputDC= ac.outputAC()/44;
        System.out.println("使用中国变压器 输入电压"+ac.outputAC()+"V转换后电压"+outputDC+"V");
        return outputDC;
    }
}
