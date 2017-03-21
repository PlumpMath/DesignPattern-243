package iterator;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class MyCollection implements Collection{
    String[] strings = {"A", "B", "C", "D", "E"};

    @Override
    public Iterator iterator() {
        return new MyIterator(this);
    }

    @Override
    public Object get(int i) {
        return strings[i];
    }

    @Override
    public int size() {
        return strings.length;
    }
}
