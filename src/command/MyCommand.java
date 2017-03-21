package command;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class MyCommand implements Command {
    Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
