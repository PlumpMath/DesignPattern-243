package mediator;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public abstract class User {
    Mediator mediator;

    public Mediator getMediator() {
        return mediator;
    }

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public abstract void work();
}
