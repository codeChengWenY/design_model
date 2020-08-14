package behavior_model.template;

/**
 * @ClassName PM
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-04 18:43
 * @Version V1.0
 **/
public  abstract  class PM {

    protected  abstract void analyze();

    protected  abstract  void design();

    protected  abstract  void develop();

    protected  abstract  boolean test();

    protected  abstract  void release();



    public   final  void  kickoff(){
        analyze();
        design();

        do {
            develop();
        }while (!test());
        release();
    }


}
