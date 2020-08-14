package behavior_model.command;

/**
 * @ClassName PlayCommand
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-26 18:07
 * @Version V1.0
 **/
public class StopCommand implements  Command{

    private  AudioPlayer audioPlayer;


    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.stop();

    }
}
