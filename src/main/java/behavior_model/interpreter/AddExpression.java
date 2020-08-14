package behavior_model.interpreter;

/**
 * @ClassName AddExpression
 * @Description:  非终结符表达式类
 * @Author CoderCheng
 * @Date 2020-05-26 17:26
 * @Version V1.0
 **/
public class AddExpression implements  Expression {

     private Expression city;

     private  Expression person;




     public  AddExpression(Expression city ,Expression perion){

         this.city=city;
         this.person=perion;

     }


    @Override
    public boolean interpret(String message) {
         String s[]=message.split("的");
         //判断city是否包含存入的信息&&person包含存入的信息
        return city.interpret(s[0])&&person.interpret(s[1]);
    }
}
