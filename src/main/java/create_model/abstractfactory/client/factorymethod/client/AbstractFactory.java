package create_model.abstractfactory.client.factorymethod.client;

import create_model.abstractfactory.JavaCourseFactory;
import create_model.abstractfactory.PythonCourseFactory;

/**
 * @ClassName Client
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 15:06
 * @Version V1.0
 **/
public class AbstractFactory {

    public static void main(String[] args) {

         // 一个完整的产品有相关的需要组件时 创建这个产品时 相关的被创建出来
        // Java 产品
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.getArticle().produce();
        javaCourseFactory.getVideo().produce();

        // Python 产品
        PythonCourseFactory pythonCourseFactory=new PythonCourseFactory();
        pythonCourseFactory.getArticle().produce();
        pythonCourseFactory.getVideo().produce();

    }
}
