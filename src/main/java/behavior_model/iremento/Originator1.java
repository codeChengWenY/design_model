package behavior_model.iremento;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

/**
 * @ClassName Originator1
 * @Description: 发起者
 * @Author CoderCheng
 * @Date 2020-06-04 14:02
 * @Version V1.0
 **/
public class Originator1 {

    private HashMap<String, String> status;

    public Originator1() {

        status = new HashMap<>();
    }


    public  IMemento createMemento(){
        return  new Memento(status);
    }

    public  void restoreMemento(IMemento memento){
        status=((Memento)memento).getState();
    }


    public  void showStatus(){

        System.out.println("now Status"+status.toString());
    }


    public  void testStatus1(){
        status.put("血量", "1000");
        status.put("攻击力", "500");
        status.put("层数", "1");
    }

    public  void testStatus2(){
        status.put("血量", "3000");
        status.put("攻击力", "1500");
        status.put("层数", "10");
    }


    @Setter
    @Getter
    private  class  Memento implements  IMemento{

        private  HashMap<String,String> state;

        private  Memento (HashMap state){
            this.state=new HashMap<>(state);
        }
    }
}
