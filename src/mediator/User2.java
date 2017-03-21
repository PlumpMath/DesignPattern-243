package mediator;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user2 work");
    }
}
