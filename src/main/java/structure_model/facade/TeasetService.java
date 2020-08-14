package structure_model.facade;

/**
 * @ClassName TeasetService
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-08 16:39
 * @Version V1.0
 **/
public class TeasetService {

    public  Teawater makeTeaWater(String who, Water water,Tealeaf tealeaf){

             String teawater="一杯容量为"+water.getCapacity()+",温度为"+water.getTemperature()+"的"+tealeaf.getTeaName()+"的茶水";

             return  new Teawater(teawater);
    }
}
