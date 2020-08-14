package behavior_model.visitor;

/**
 * @ClassName Visitor
 * @Description: 访问者接口
 * @Author CoderCheng
 * @Date 2020-06-04 17:24
 * @Version V1.0
 **/
public interface Visitor {


    public void visit(Candy candy);

    public void visit(Wine wine);

    public void visit(Fruit fruit);
}
