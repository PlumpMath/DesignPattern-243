package command;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Invoker {
    Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.execute();
    }
}
