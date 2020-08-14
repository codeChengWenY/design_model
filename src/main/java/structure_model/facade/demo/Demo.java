package structure_model.facade.demo;

import structure_model.facade.*;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:42
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {
        Man man=new Man("张三");

        Water water=new Water();

        Tealeaf tealeaf=new Tealeaf("西湖龙井");
        KettleService kettleService = new KettleService();
        kettleService.waterBurning(man.getName(),water,4);

        TeasetService teasetService=new TeasetService();

        Teawater teawater = teasetService.makeTeaWater(man.getName(), water, tealeaf);

        man.drink(teawater);


    }
}
