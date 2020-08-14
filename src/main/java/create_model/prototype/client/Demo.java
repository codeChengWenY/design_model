package create_model.prototype.client;

import create_model.prototype.Pig;

import java.util.Date;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-18 18:19
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) throws CloneNotSupportedException {

        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);

        pig1.getDate().setTime(666666666666L);
        pig1.setName("aaa");

        System.out.println(pig1);
        System.out.println(pig2);

    }
}
