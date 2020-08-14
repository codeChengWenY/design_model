package behavior_model.command;

/**
 * @ClassName PlayCommand
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-26 18:07
 * @Version V1.0
 **/
public class RewindCommand implements  Command{

    private  AudioPlayer audioPlayer;


    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();

    }
}
