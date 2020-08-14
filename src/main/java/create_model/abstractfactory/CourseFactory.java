package create_model.abstractfactory;

/**
 * @ClassName CourseFactory
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 17:46
 * @Version V1.0
 **/
public interface CourseFactory {

    Article getArticle();

    Video getVideo();

}
