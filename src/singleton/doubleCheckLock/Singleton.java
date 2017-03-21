package singleton.doubleCheckLock;

/**
 * Created by sdt14096 on 2017/3/17.
 */
public class Singleton {
    private static volatile Singleton uniqueInstance;

    private Singleton(){}

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
}
