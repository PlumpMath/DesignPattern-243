package mediator;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Test {
    public static void main(String[] args) {
        Mediator mediator = new MyMediator();
        mediator.createMediator();
        mediator.workAll();
    }
}
