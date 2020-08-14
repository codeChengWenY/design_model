package create_model.abstractfactory;

/**
 * @ClassName SimpleFactory
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 14:06
 * @Version V1.0
 **/
public class JavaArticle extends Article {


    @Override
    public void produce() {
        System.out.println("java文章");
    }
}
