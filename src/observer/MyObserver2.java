package observer;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class MyObserver2 implements Observer{
    @Override
    public void update() {
        System.out.println("myObserver2 received message");
    }
}
