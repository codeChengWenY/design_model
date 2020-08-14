package behavior_model.iremento;

import java.util.HashMap;

/**
 * @ClassName MementoCaretaker
 * @Description: 管理者
 * @Author CoderCheng
 * @Date 2020-06-04 13:59
 * @Version V1.0
 **/
public class MementoCaretaker {


    private HashMap <String ,IMemento> mementoHashMap;


    public  MementoCaretaker(){
        mementoHashMap=new HashMap<>();
    }

     public  IMemento retrieveMemento(String name){

        return mementoHashMap.get(name);
     }


     public  void saveMemento(String name,IMemento iMemento){
        this.mementoHashMap.put(name, iMemento);
     }

}
