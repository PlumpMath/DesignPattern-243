package observer;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        Observer myObserver1 = new MyObserver1();
        Observer myObserver2 = new MyObserver2();
        Subject mySubject = new MySubject();
        mySubject.add(myObserver1);
        mySubject.add(myObserver2);
        mySubject.notifyObservers();
    }
}
