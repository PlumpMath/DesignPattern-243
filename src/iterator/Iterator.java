package iterator;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public interface Iterator {
    public Object previous();

    public Object next();

    public boolean hasNext();

    public Object first();
}
