package memento;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Storage {
    Memento memento;

    public Storage(Memento memento) {
        this.memento = memento;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
