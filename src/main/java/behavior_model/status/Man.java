package behavior_model.status;

/**
 * @ClassName Man
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 14:36
 * @Version V1.0
 **/
public class Man {

    private Status status;

    public void setAge(int age) {

        if (age > 10) {
            status = new StatusA();
        } else {
            status = new StatusB();
        }

    }



    public void  doSomething(){

        status.say();

    }

}
