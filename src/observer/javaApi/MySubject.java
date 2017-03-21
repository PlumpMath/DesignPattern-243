package observer.javaApi;

import java.util.Observable;

public class MySubject extends Observable {
    public void setData() {
        setChanged();
        notifyObservers();
    }
}
