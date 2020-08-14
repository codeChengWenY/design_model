package behavior_model.Iterator;

import java.util.Iterator;

/**
 * @ClassName Client
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-29 16:46
 * @Version V1.0
 **/
public class Client {


    public static void main(String[] args) {

         DrivingRecorder dr= new DrivingRecorder();


        for (int i = 0; i < 1; i++) {
            dr.append("视频_"+i);
        }
     //   dr.display();


        Iterator<String> it= dr.iterator();


        while (it.hasNext()) {
            String video= it.next();
            System.out.println(video);

        }

    }
}
