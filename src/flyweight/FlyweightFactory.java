package flyweight;


import java.util.Hashtable;

/**
 * Created by sdt14096 on 2017/3/20.
 */
public class FlyweightFactory {
    Integer initSize;
    Integer maxSize;
    Hashtable<Integer, Flyweight> flyweights = new Hashtable<>();

    public FlyweightFactory(Integer initSize, Integer maxSize) throws Exception {
        this.initSize = initSize;
        this.maxSize = maxSize;
        initPool(initSize, maxSize);
    }

    private void initPool(Integer initSize, Integer maxSize) throws Exception {
        if (initSize > maxSize || initSize < 0 || maxSize < 1 || initSize > 26 || maxSize > 26) {
            throw new RuntimeException("wrong init size");
        } else {
            Flyweight flyweight;
            for (int i = 0; i < initSize; i++) {
                flyweight = new ConcreteFlyweight(Character.toString((char) ('A' + i)));
                flyweights.put(i+1, flyweight);
            }
        }
    }

    public Flyweight getFlyweight(int key) {
        if (key > maxSize || key < 1) {
            return null;
        }
        Flyweight flyweight = flyweights.get(key);
        int realSize = flyweights.size();
        if (flyweight == null) {
            if (realSize < maxSize) {
                flyweight = new ConcreteFlyweight(Character.toString((char) ('A' + key-1)));
                flyweights.put(key, flyweight);
            }
        }
        return flyweight;
    }

    public Integer getRealSize() {
        return flyweights.size();
    }
}
