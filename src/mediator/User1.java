package mediator;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void work() {
        System.out.println("user1 work");
    }
}
