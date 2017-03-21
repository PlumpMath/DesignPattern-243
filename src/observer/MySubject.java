package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class MySubject implements Subject {
    Vector<Observer> observers = new Vector<>();
    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        Enumeration<Observer> elements = observers.elements();
        while (elements.hasMoreElements()) {
            elements.nextElement().update();
        }
    }
}
