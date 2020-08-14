package create_model.abstractfactory;

/**
 * @ClassName SimpleFactory
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-13 14:06
 * @Version V1.0
 **/
public class PythonCourseFactory implements CourseFactory {

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }

    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
