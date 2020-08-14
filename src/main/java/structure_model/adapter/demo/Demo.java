package structure_model.adapter.demo;

import structure_model.adapter.AC;
import structure_model.adapter.AC110;
import structure_model.adapter.ChinaPowerAdapter;

/**
 * @ClassName demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 15:05
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {
        AC aC = new AC110();
        ChinaPowerAdapter chinaPowerAdapter = new ChinaPowerAdapter();
        int outputDC5V = chinaPowerAdapter.outputDC5V(aC);
        System.out.println("输出电压" + outputDC5V+"V");
    }
}
