package behavior_model.iremento.demo;

import behavior_model.iremento.MementoCaretaker;
import behavior_model.iremento.Originator1;

/**
 * @ClassName MementoTest
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 14:12
 * @Version V1.0
 **/
public class MementoTest {

    public static void main(String[] args) {


        MementoCaretaker mementoCaretaker = new MementoCaretaker();

        Originator1 originator1 = new Originator1();
        originator1.showStatus();
        originator1.testStatus1();
        //存档
        mementoCaretaker.saveMemento("originator",originator1.createMemento());
        originator1.showStatus();

        originator1.testStatus2();
        originator1.showStatus();

        // 恢复
        originator1.restoreMemento(mementoCaretaker.retrieveMemento("originator"));

        originator1.showStatus();

    }
}
