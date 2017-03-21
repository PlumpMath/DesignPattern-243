package memento;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Memento {
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento(String value) {
        this.value = value;
    }
}
