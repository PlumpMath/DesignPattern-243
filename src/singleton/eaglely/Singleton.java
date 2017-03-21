package singleton.eaglely;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Singleton {
    private static Singleton uniqueInstance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
