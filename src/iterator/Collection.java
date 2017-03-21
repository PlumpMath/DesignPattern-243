package iterator;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public interface Collection {
    public Iterator iterator();

    public Object get(int i);

    public int size();
}
