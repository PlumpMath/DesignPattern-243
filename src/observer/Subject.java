package observer;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public interface Subject {
    public void add(Observer observer);

    public void remove(Observer observer);

    public void notifyObservers();
}
