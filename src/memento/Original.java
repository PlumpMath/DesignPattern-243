package memento;

/**
 * Created by sdt14096 on 2017/3/21.
 */
public class Original {
    String value;

    public Original(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Memento createMemo() {
        return new Memento(this.value);
    }

    public void restoreMemo(Memento memento) {
        this.value = memento.getValue();
    }
}
