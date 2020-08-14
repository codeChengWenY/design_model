package behavior_model.Iterator;

import java.util.Iterator;

/**
 * @ClassName DrivingRecorder
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-29 16:41
 * @Version V1.0
 **/
public class DrivingRecorder {

    private int index = -1; //当前记录位置

    private String[] records = new String[10]; //假设只能存10条记录

    public void append(String record) {

        if (index == 9) {
            index = 0;
        } else {
            index++;
        }

        records[index] = record;


    }


    public void display() {

        for (int i = 0; i < 10; i++) {
            System.out.println(i + ":" + records[i]);
        }
    }

    public  Iterator<String> iterator(){

        return  new Itr();
    }


    private  class  Itr implements Iterator<String>{

          int cursor=index;
          int loopCount=0;

        @Override
        public boolean hasNext() {
            return loopCount<10;
        }

        @Override
        public String next() {
            int i= cursor;
            if(cursor==0){
                cursor=9;
            }else{
                cursor--;
            }
             loopCount++;
            return records[i];
        }
    }

}
