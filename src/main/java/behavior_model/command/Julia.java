package behavior_model.command;

/**
 * @ClassName Julia
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-26 18:12
 * @Version V1.0
 **/
public class Julia {

    public static void main(String[] args) {


        // 创建接收者对象
        AudioPlayer audioPlayer= new AudioPlayer();

         //创建命令对象
        Command playCommand= new PlayCommand(audioPlayer);
        Command reWindCommand= new RewindCommand(audioPlayer);
        Command stopCommand= new StopCommand(audioPlayer);


        //创建请求者对象
        KeyCommand keyCommand=new KeyCommand();
        keyCommand.setPlayCommand(playCommand);
        keyCommand.setRewindCommand(reWindCommand);
        keyCommand.setStopCommand(stopCommand);

         //测试
        keyCommand.play();
        keyCommand.rewind();
        keyCommand.stop();

    }


}
