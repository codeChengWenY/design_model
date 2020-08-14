package behavior_model.command;

/**
 * @ClassName PlayCommand
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-26 18:07
 * @Version V1.0
 **/
public class PlayCommand implements  Command{

    private  AudioPlayer audioPlayer;


    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.play();

    }
}
