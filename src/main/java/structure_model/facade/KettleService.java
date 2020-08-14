package structure_model.facade;

/**
 * @ClassName KettleService
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:34
 * @Version V1.0
 **/
public class KettleService {


    public  void waterBurning(String who, Water water,int burnTime){

       int finalTermperatue=Math.min(100,water.getCapacity()+burnTime*20);
        water.setTemperature(finalTermperatue);

        System.out.println(who+"使用水壶烧水,最终温度为"+finalTermperatue);


    }
}
