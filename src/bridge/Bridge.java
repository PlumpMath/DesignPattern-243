package bridge;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public abstract class Bridge {
    Sourceable source;

    public Sourceable getSource() {
        return source;
    }

    public void setSource(Sourceable source) {
        this.source = source;
    }

    public void method() {
        source.method();
    }
}
