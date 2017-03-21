package chainOfResponsibility;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}
