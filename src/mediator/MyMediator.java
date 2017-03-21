package mediator;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class MyMediator implements Mediator {
    User user1;
    User user2;

    @Override
    public void createMediator() {
        user1 = new User1(this);
        user2 = new User2(this);
    }

    @Override
    public void workAll() {
        user1.work();
        user2.work();
    }
}
