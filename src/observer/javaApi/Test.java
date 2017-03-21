package observer.javaApi;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class Test {
    public static void main(String[] args) {
        Observer observer = new MyObserver();

        MySubject mySubject = new MySubject();

        mySubject.addObserver(observer);

        mySubject.setData();
    }
}
