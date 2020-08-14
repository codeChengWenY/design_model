package behavior_model.command;

/**
 * @ClassName KeyCommand
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-26 18:09
 * @Version V1.0
 **/
public class KeyCommand {


    public Command playCommand;
    public Command rewindCommand;
    public Command stopCommand;

    public void setPlayCommand(Command playCommand) {
        this.playCommand = playCommand;
    }

    public void setRewindCommand(Command rewindCommand) {
        this.rewindCommand = rewindCommand;
    }


    public void setStopCommand(Command stopCommand) {
        this.stopCommand = stopCommand;
    }


    public void play() {
        playCommand.execute();

    }

    public void rewind() {
        rewindCommand.execute();

    }

    public void stop() {
        stopCommand.execute();

    }
}
