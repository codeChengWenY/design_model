package structure_model.bridge.demo;

import structure_model.bridge.*;

/**
 * @ClassName demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-05 10:13
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {


        // 人物与招式解耦
        //招式
        KongFu kongFuA=new KongFuA();
        KongFu kongFuB=new KongFuB();

        //人物
        Man man=new ManA(kongFuA,"乔峰");
        man.showKongFu();

        Man manB=new ManA(kongFuB,"东方不败");
        manB.showKongFu();
    }
}
